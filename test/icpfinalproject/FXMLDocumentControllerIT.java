/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jean72human
 */
public class FXMLDocumentControllerIT {
    
    public FXMLDocumentControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of leadToRegister method, of class FXMLDocumentController.
     */
    @Test
    public void testLeadToRegister() throws Exception {
        System.out.println("leadToRegister");
        ActionEvent event = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.leadToRegister(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerModel method, of class FXMLDocumentController.
     */
    @Test
    public void testRegisterModel() {
        System.out.println("registerModel");
        ProjectModel m = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.registerModel(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStage method, of class FXMLDocumentController.
     */
    @Test
    public void testRegisterStage() {
        System.out.println("registerStage");
        Stage stage = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.registerStage(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initialize method, of class FXMLDocumentController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        FXMLDocumentController instance = new FXMLDocumentController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
