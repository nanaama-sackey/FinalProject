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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

/**
 *
 * @author jean72human
 */
public class FXMLDocumentController implements Initializable {
    ProjectModel model;
    
    Stage stage;
    
    @FXML
    private Label label;
    
    @FXML private TextField usernameTextField;
    
    @FXML private PasswordField passwordTextField;
    
    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException {
        System.out.println("Trying to login");
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        this.model.login(username, password);
        if (this.model.getLoggingState()){
            System.out.println("Successful login");
            System.out.println("user: "+model.getUsername()+" email: "+model.getEmail()+" id: "+model.getId());
        }
        
        FXMLLoader loader;
        loader = new FXMLLoader(getClass().getResource("LibrarianPage.fxml"));
        Parent root = (Parent) loader.load();
        LibrarianPageController controller2 = loader.getController();
        controller2.registerModel(model);
        controller2.registerStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    
    public void registerModel(ProjectModel m){
        this.model = m;
    }
    
    public void registerStage(Stage stage){
        this.stage = stage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
