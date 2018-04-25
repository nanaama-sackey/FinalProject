/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import java.util.ArrayList;
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
public class ProjectModelIT {
    
    public ProjectModelIT() {
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
     * Test of close method, of class ProjectModel.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        ProjectModel instance = new ProjectModel();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertBook method, of class ProjectModel.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        int isbn = 0;
        String author = "";
        String title = "";
        String description = "";
        String publisher = "";
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.insertBook(isbn, author, title, description, publisher);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerStudent method, of class ProjectModel.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        String username = "";
        String password = "";
        String email = "";
        String first_name = "";
        String last_name = "";
        String major = "";
        int year = 0;
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.registerStudent(username, password, email, first_name, last_name, major, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerLecturer method, of class ProjectModel.
     */
    @Test
    public void testRegisterLecturer() {
        System.out.println("registerLecturer");
        String username = "";
        String password = "";
        String email = "";
        String first_name = "";
        String last_name = "";
        String department = "";
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.registerLecturer(username, password, email, first_name, last_name, department);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerLibrarian method, of class ProjectModel.
     */
    @Test
    public void testRegisterLibrarian() {
        System.out.println("registerLibrarian");
        String username = "";
        String password = "";
        String email = "";
        String first_name = "";
        String last_name = "";
        String position = "";
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.registerLibrarian(username, password, email, first_name, last_name, position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class ProjectModel.
     */
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        int id = 0;
        int isbn = 0;
        String author = "";
        String title = "";
        String description = "";
        String publisher = "";
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.updateBook(id, isbn, author, title, description, publisher);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class ProjectModel.
     */
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int id = 0;
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.deleteBook(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBooks method, of class ProjectModel.
     */
    @Test
    public void testGetBooks() {
        System.out.println("getBooks");
        ProjectModel instance = new ProjectModel();
        ArrayList expResult = null;
        ArrayList result = instance.getBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrowBook method, of class ProjectModel.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        int id = 0;
        int book_id = 0;
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.borrowBook(id, book_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class ProjectModel.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        int borroID = 0;
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.returnBook(borroID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class ProjectModel.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        ProjectModel instance = new ProjectModel();
        String[] expResult = null;
        String[] result = instance.login(username, password);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoggingState method, of class ProjectModel.
     */
    @Test
    public void testGetLoggingState() {
        System.out.println("getLoggingState");
        ProjectModel instance = new ProjectModel();
        boolean expResult = false;
        boolean result = instance.getLoggingState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProjectModel.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ProjectModel.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class ProjectModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        ProjectModel instance = new ProjectModel();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class ProjectModel.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        ProjectModel instance = new ProjectModel();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class ProjectModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        ProjectModel instance = new ProjectModel();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class ProjectModel.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        ProjectModel instance = new ProjectModel();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class ProjectModel.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        ProjectModel instance = new ProjectModel();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
