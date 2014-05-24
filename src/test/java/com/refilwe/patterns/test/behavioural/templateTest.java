/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.behavioural;

import com.refilwe.patterns.behavioural.templatePattern.Meal;
import com.refilwe.patterns.behavioural.templatePattern.Pizza;
import com.refilwe.patterns.behavioural.templatePattern.SubMeal;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fifi
 */
public class templateTest {
    
    public templateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void templateTest() {
         Meal meal1 = new Pizza();
         meal1.doMeal();
         Assert.assertNotNull(meal1);
         
         Meal meal2 = new SubMeal();
         meal2.doMeal();
          Assert.assertNotNull(meal2);
         
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
