/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import camperleaderboard.ContentLoader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author peter.ivanics
 */
public class ContentLoaderTests {
    
    public ContentLoaderTests() {
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

    @Test
    public void testLoadingCampersJSONFile() {
        String filePath = "data/campers.json";
        ContentLoader loader = new ContentLoader(filePath);
        String contents = loader.getContents();
        
        assertNotNull(contents);
        assertTrue(contents.startsWith("[")); 
        assertTrue(contents.endsWith("]"));
        assertTrue(contents.contains("\"username\": \"ndburrus\""));
    }
    
    @Test
    public void testLoadingNonExistentJSONFile() {
        String filePath = "somethingthatdoesnotexist.json";
        ContentLoader loader = new ContentLoader(filePath);
        String contents = loader.getContents();
        
        assertNull(contents);
    }
}
