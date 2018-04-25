/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class for the librarian page
 *
 * @author jean72human
 */
public class LibrarianPageController implements Initializable {
    
    ProjectModel model;
    
    Stage stage;
    
    @FXML private AnchorPane booksPane, dashboardPane, sidePane, bookEntryPane, bookUpdatePane; 
    @FXML private Button dashBtn, booksBtn;
    @FXML private TextField isbnTextField, authorTextField, titleTextField, descTextField, publisherTextField, isbnTextField1, authorTextField1, titleTextField1, descTextField1, publisherTextField1; 
    @FXML private Label welcomeMessage;
    
    int selectID;
    
    @FXML
    private TableView<ModelTable> bookTable;
    @FXML private TableColumn<ModelTable, String> col_isbn;
    @FXML private TableColumn<ModelTable, String> col_auth;
    @FXML private TableColumn<ModelTable, String> col_desc;
    @FXML private TableColumn<ModelTable, String> col_title;
    @FXML private TableColumn<ModelTable, String> col_publisher;
    
    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        isbnTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,7}([\\.]\\d{0,4})?")) {
                    isbnTextField.setText(oldValue);
                }
            }
        });
        
    }    
    
    
    public void handleNavClick(ActionEvent event) throws IOException {
        
        if (event.getSource() == dashBtn){
            dashboardPane.toFront();
            sidePane.toFront();
        } else if (event.getSource() == booksBtn){
            booksPane.toFront();
            sidePane.toFront();
            fetch();
        } 
        
    }
    
    public void handleBookEntryClick(ActionEvent event) throws IOException {
        this.model.insertBook(Integer.parseInt(isbnTextField.getText()), authorTextField.getText(), titleTextField.getText(), descTextField.getText(), publisherTextField.getText());
        isbnTextField.setText("");
        authorTextField.setText("");
        titleTextField.setText("");
        descTextField.setText("");
        publisherTextField.setText("");
        bookEntryPane.toBack();
        sidePane.toFront();
        fetch();
    }
    
    public void leadToBookEntry(ActionEvent event) throws IOException {
        bookEntryPane.toFront();
        sidePane.toFront();
    }
    
    public void backing(ActionEvent event) throws IOException {
        booksPane.toFront();
        sidePane.toFront();
    }
    
    public void registerModel(ProjectModel m){
        this.model = m;
        
        welcomeMessage.setText("Welcome "+model.getUsername());
        
        
        fetch();
    }
    
    void fetch(){
        ArrayList<String[]> bookList = model.getBooks();
        oblist = FXCollections.observableArrayList();
        
        for(String[] book : bookList){
            oblist.add(new ModelTable(book[0],book[1],book[2],book[3],book[4],book[5]));
        }
        
        col_isbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        col_auth.setCellValueFactory(new PropertyValueFactory<>("Author"));
        col_title.setCellValueFactory(new PropertyValueFactory<>("title"));
        col_desc.setCellValueFactory(new PropertyValueFactory<>("desciption"));
        col_publisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        
        
        bookTable.setItems(oblist);
    }
    
    
    public void deleteBook(ActionEvent event) throws IOException {
        selectID = Integer.parseInt(bookTable.getSelectionModel().getSelectedItem().getId());
        System.out.println("Deleting "+bookTable.getSelectionModel().getSelectedItem().getTitle());
        model.deleteBook(selectID);
        JOptionPane.showMessageDialog(null, "Book deleted");
        booksPane.toFront();
        sidePane.toFront();
        fetch();
    }
    
    public void leadToUpdate(ActionEvent event) throws IOException {
        bookUpdatePane.toFront();
        sidePane.toFront();
        selectID = Integer.parseInt(bookTable.getSelectionModel().getSelectedItem().getId());
        isbnTextField1.setText(bookTable.getSelectionModel().getSelectedItem().getIsbn());
        authorTextField1.setText(bookTable.getSelectionModel().getSelectedItem().getAuthor());
        titleTextField1.setText(bookTable.getSelectionModel().getSelectedItem().getTitle());
        descTextField1.setText(bookTable.getSelectionModel().getSelectedItem().getDesciption());
        publisherTextField1.setText(bookTable.getSelectionModel().getSelectedItem().getPublisher());
    }
    
    public void update(ActionEvent event) throws IOException {
        this.model.updateBook(selectID,Integer.parseInt(isbnTextField1.getText()), authorTextField1.getText(), titleTextField1.getText(), descTextField1.getText(), publisherTextField1.getText());
        isbnTextField1.setText("");
        authorTextField1.setText("");
        titleTextField1.setText("");
        descTextField1.setText("");
        publisherTextField1.setText("");
        bookUpdatePane.toBack();
        booksPane.toFront();
        sidePane.toFront();
        JOptionPane.showMessageDialog(null, "Updated");
        fetch();
    }
    
    
    public void registerStage(Stage stage){
        this.stage = stage;
    }
    
}
