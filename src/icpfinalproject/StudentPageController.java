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
 * FXML Controller class
 *
 * @author jean72human
 */
public class StudentPageController implements Initializable {
    
    ProjectModel model;
    
    Stage stage;
    
    @FXML private AnchorPane booksPane, dashboardPane, sidePane; 
    @FXML private Button dashBtn, booksBtn; 
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
    
    public void handleBorrow(ActionEvent event) throws IOException {
        selectID = Integer.parseInt(bookTable.getSelectionModel().getSelectedItem().getId());
        int id = model.getId();
        model.borrowBook(id, selectID);
        JOptionPane.showMessageDialog(null, "You borrowed the book");
    }
    
    
    public void registerStage(Stage stage){
        this.stage = stage;
    }
    
}
