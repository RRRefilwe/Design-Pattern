/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.behavioural;

import com.refilwe.patterns.behavioural.chainPattern.MondayHandler;
import com.refilwe.patterns.behavioural.chainPattern.TuesdayHandler;
import com.refilwe.patterns.behavioural.chainPattern.WednesdayHandler;
import com.refilwe.patterns.behavioural.chainPattern.WeekEnum;
import com.refilwe.patterns.behavioural.chainPattern.WeekHandler;
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
public class ChainTest {
    
    public ChainTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void chainTest() {
         
         //SetUp s = new SetUp();
         WeekHandler chain = setUpChain();
         String response = chain.handleRequest(WeekEnum.Tuesday);
         Assert.assertNotNull(chain);
         Assert.assertEquals("Rice", response);
 
     }
     public static WeekHandler setUpChain(){
        WeekHandler mondayHandler = new MondayHandler();
        WeekHandler tuesdayHandler = new TuesdayHandler();
        WeekHandler wednesdayHandler = new WednesdayHandler();
         
        mondayHandler.setSuccessor(tuesdayHandler);
        tuesdayHandler.setSuccessor(wednesdayHandler);
        
        return mondayHandler;
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
