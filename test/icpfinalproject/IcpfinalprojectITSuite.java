/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icpfinalproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jean72human
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({icpfinalproject.assets.AssetsITSuite.class, icpfinalproject.StudentPageControllerIT.class, icpfinalproject.ModelTableIT.class, icpfinalproject.ProjectModelIT.class, icpfinalproject.LibrarianPageControllerIT.class, icpfinalproject.RegisteringFormControllerIT.class, icpfinalproject.ICPFinalProjectIT.class, icpfinalproject.FXMLDocumentControllerIT.class})
public class IcpfinalprojectITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
