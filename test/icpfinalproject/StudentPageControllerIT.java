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
public class StudentPageControllerIT {
    
    public StudentPageControllerIT() {
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
     * Test of initialize method, of class StudentPageController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        StudentPageController instance = new StudentPageController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleNavClick method, of class StudentPageController.
     */
    @Test
    public void testHandleNavClick() throws Exception {
        System.out.println("handleNavClick");
        ActionEvent event = null;
        StudentPageController instance = new StudentPageController();
        instance.handleNavClick(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerModel method, of class StudentPageController.
     */
    @Test
    public void testRegisterModel() {
        System.out.println("registerModel");
        ProjectModel m = null;
        StudentPageController instance = new StudentPageController();
        instance.registerModel(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetch method, of class StudentPageController.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        StudentPageController instance = new StudentPageController();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleBorrow method, of class StudentPageController.
     */
    @Test
    public void testHandleBorrow() throws Exception {
        System.out.println("handleBorrow");
        ActionEvent event = null;
        StudentPageController instance = new StudentPageController();
        instance.handleBorrow(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStage method, of class StudentPageController.
     */
    @Test
    public void testRegisterStage() {
        System.out.println("registerStage");
        Stage stage = null;
        StudentPageController instance = new StudentPageController();
        instance.registerStage(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
