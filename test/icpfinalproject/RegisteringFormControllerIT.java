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
public class RegisteringFormControllerIT {
    
    public RegisteringFormControllerIT() {
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
     * Test of initialize method, of class RegisteringFormController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleNavClick method, of class RegisteringFormController.
     */
    @Test
    public void testHandleNavClick() throws Exception {
        System.out.println("handleNavClick");
        ActionEvent event = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.handleNavClick(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class RegisteringFormController.
     */
    @Test
    public void testRegisterStudent() throws Exception {
        System.out.println("registerStudent");
        ActionEvent event = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.registerStudent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerLecturer method, of class RegisteringFormController.
     */
    @Test
    public void testRegisterLecturer() throws Exception {
        System.out.println("registerLecturer");
        ActionEvent event = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.registerLecturer(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerLibrarian method, of class RegisteringFormController.
     */
    @Test
    public void testRegisterLibrarian() throws Exception {
        System.out.println("registerLibrarian");
        ActionEvent event = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.registerLibrarian(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerModel method, of class RegisteringFormController.
     */
    @Test
    public void testRegisterModel() {
        System.out.println("registerModel");
        ProjectModel m = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.registerModel(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStage method, of class RegisteringFormController.
     */
    @Test
    public void testRegisterStage() {
        System.out.println("registerStage");
        Stage stage = null;
        RegisteringFormController instance = new RegisteringFormController();
        instance.registerStage(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
