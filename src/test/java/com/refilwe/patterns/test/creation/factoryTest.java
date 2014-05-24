/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.creation;

import com.refilwe.patterns.creational.factoryPattern.Movie;
import com.refilwe.patterns.creational.factoryPattern.MovieFactory;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class factoryTest {
    
    public factoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void factoryTest() {
         
         Movie m1 = MovieFactory.getMovie("Matrix");
         String feeling = m1.makeYouFeel();
         Assert.assertNotNull(m1);
         Assert.assertEquals("Intrigued", feeling);
         
         Movie m2 = MovieFactory.getMovie("Hitch");
         String feeling2 = m2.makeYouFeel();
         Assert.assertEquals("laughing", feeling2);
         Assert.assertNotNull(m2);
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
