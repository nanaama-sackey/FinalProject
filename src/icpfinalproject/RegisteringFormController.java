/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class for the registering forms
 *
 * @author jean72human
 */
public class RegisteringFormController implements Initializable {

    
    @FXML private AnchorPane studentPane, lecturerPane, librarianPane, topPane;
    @FXML private Button studentButton, lecturerButton, librarianButton;
    @FXML private TextField usernameTextField, usernameTextField1, usernameTextField11, majorTextField, lnameTextField, lnameTextField1, lnameTextField11, fnameTextField, fnameTextField1, fnameTextField11, emailTextField, emailTextField1, emailTextField11, positionTextField, departmentTextField;
    @FXML private PasswordField passwordTextField, passwordTextField1, passwordTextField11;
    private ProjectModel model;
    private Stage stage;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void handleNavClick(ActionEvent event) throws IOException {
        
        if (event.getSource() == studentButton){
            studentPane.toFront();
            topPane.toFront();
        } else if (event.getSource() == lecturerButton){
            lecturerPane.toFront();
            topPane.toFront();
        } else if (event.getSource() == librarianButton){
            librarianPane.toFront();
            topPane.toFront();
        } 
        
    }
    
    public void registerStudent(ActionEvent event) throws IOException {
        boolean registered = false;
        registered = model.registerStudent(usernameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), fnameTextField.getText() , lnameTextField.getText(), majorTextField.getText(), 0);
        
        if (registered){
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = (Parent) loader.load();
        FXMLDocumentController controller2 = loader.getController();
        controller2.registerModel(model);
        controller2.registerStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        JOptionPane.showMessageDialog(null, "You are now registered");
        } else {
            JOptionPane.showMessageDialog(null, "You were not able to register");
        }
    }
    
    public void registerLecturer(ActionEvent event) throws IOException {
        boolean registered = false;
        registered = model.registerLecturer(usernameTextField1.getText(), passwordTextField1.getText(), emailTextField1.getText(), fnameTextField1.getText(), lnameTextField1.getText(), departmentTextField.getText());
        
        if (registered){
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = (Parent) loader.load();
        FXMLDocumentController controller2 = loader.getController();
        controller2.registerModel(model);
        controller2.registerStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        JOptionPane.showMessageDialog(null, "You are now registered");
        } else {
            JOptionPane.showMessageDialog(null, "You were not able to register");
        }
    }
    
    public void registerLibrarian(ActionEvent event) throws IOException {
        boolean registered = false;
        registered = model.registerLibrarian(usernameTextField11.getText(), passwordTextField11.getText(), emailTextField11.getText(), fnameTextField11.getText(), lnameTextField11.getText(), positionTextField.getText());
        
        if (registered){
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = (Parent) loader.load();
        FXMLDocumentController controller2 = loader.getController();
        controller2.registerModel(model);
        controller2.registerStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        JOptionPane.showMessageDialog(null, "You are now registered");
        } else {
            JOptionPane.showMessageDialog(null, "You were not able to register");
        }
    }
    
    public void registerModel(ProjectModel m){
        this.model = m;
    }
    
    public void registerStage(Stage stage){
        this.stage = stage;
    }
}
