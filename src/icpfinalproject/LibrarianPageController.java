/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jean72human
 */
public class LibrarianPageController implements Initializable {
    
    Models model;
    
    Stage stage;
    
    @FXML private Label welcomeMessage;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public void registerModel(Models m){
        this.model = m;
        
        welcomeMessage.setText("Welcome "+model.getUsername());
    }
    
    public void registerStage(Stage stage){
        this.stage = stage;
    }
    
}
