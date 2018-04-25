/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author jean72human
 */
public class FXMLDocumentController implements Initializable {
    Models model;
    
    @FXML
    private Label label;
    
    @FXML private TextField usernameTextField;
    
    @FXML private PasswordField passwordTextField;
    
    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        System.out.println("Trying to login");
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        this.model.login(username, password);
        if (this.model.getLoggingState()){
            System.out.println("Successful login");
            System.out.println("user: "+model.getUsername()+" email: "+model.getEmail()+" id: "+model.getId());
        }
        //String[] userinfo = 
    }
    
    public void registerModel(Models m){
        this.model = m;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
