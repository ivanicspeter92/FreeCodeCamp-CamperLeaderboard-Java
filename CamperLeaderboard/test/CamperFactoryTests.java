/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import camperleaderboard.Camper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import camperleaderboard.CamperFactory;
import camperleaderboard.ContentLoader;
import java.util.ArrayList;

/**
 *
 * @author peter.ivanics
 */
public class CamperFactoryTests {
    
    public CamperFactoryTests() {
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
    public void testIncorrectString() {
        String testString = "I am not a JSON string";
        ArrayList<Camper> testCampers = CamperFactory.getCampers(testString);

        assertNotNull(testCampers);
        assertEquals(0, testCampers.size());
    }
    
    @Test
    public void testOneCamperString() {
        String testString = "[{\"username\": \"ndburrus\", \"img\": \"https://avatars.githubusercontent.com/u/15148847?v=3\", \"alltime\": 709, \"recent\": 427, \"lastUpdate\": \"2016-07-14T08:58:18.736Z\"}]";
        ArrayList<Camper> testCampers = CamperFactory.getCampers(testString);

        assertNotNull(testCampers);
        assertEquals(1, testCampers.size());
    }
    
    @Test
    public void testCamperFile() {
        String testString = new ContentLoader("data/campers.json").getContents();
        ArrayList<Camper> testCampers = CamperFactory.getCampers(testString);

        assertNotNull(testCampers);
        assertTrue(testCampers.size() >= 8);
    }
}
