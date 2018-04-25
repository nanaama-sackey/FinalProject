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
public class LibrarianPageControllerIT {
    
    public LibrarianPageControllerIT() {
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
     * Test of initialize method, of class LibrarianPageController.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        URL url = null;
        ResourceBundle rb = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.initialize(url, rb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleNavClick method, of class LibrarianPageController.
     */
    @Test
    public void testHandleNavClick() throws Exception {
        System.out.println("handleNavClick");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.handleNavClick(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleBookEntryClick method, of class LibrarianPageController.
     */
    @Test
    public void testHandleBookEntryClick() throws Exception {
        System.out.println("handleBookEntryClick");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.handleBookEntryClick(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leadToBookEntry method, of class LibrarianPageController.
     */
    @Test
    public void testLeadToBookEntry() throws Exception {
        System.out.println("leadToBookEntry");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.leadToBookEntry(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of backing method, of class LibrarianPageController.
     */
    @Test
    public void testBacking() throws Exception {
        System.out.println("backing");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.backing(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerModel method, of class LibrarianPageController.
     */
    @Test
    public void testRegisterModel() {
        System.out.println("registerModel");
        ProjectModel m = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.registerModel(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fetch method, of class LibrarianPageController.
     */
    @Test
    public void testFetch() {
        System.out.println("fetch");
        LibrarianPageController instance = new LibrarianPageController();
        instance.fetch();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class LibrarianPageController.
     */
    @Test
    public void testDeleteBook() throws Exception {
        System.out.println("deleteBook");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.deleteBook(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leadToUpdate method, of class LibrarianPageController.
     */
    @Test
    public void testLeadToUpdate() throws Exception {
        System.out.println("leadToUpdate");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.leadToUpdate(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class LibrarianPageController.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        ActionEvent event = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.update(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStage method, of class LibrarianPageController.
     */
    @Test
    public void testRegisterStage() {
        System.out.println("registerStage");
        Stage stage = null;
        LibrarianPageController instance = new LibrarianPageController();
        instance.registerStage(stage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
