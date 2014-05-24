/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.creation;

import com.refilwe.patterns.creational.builderPattern.Car;
import com.refilwe.patterns.creational.builderPattern.CarDirector;
import com.refilwe.patterns.creational.builderPattern.MiniCooper;
import com.refilwe.patterns.creational.builderPattern.VehicleBuilder;
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
public class builderTest {
    
    public builderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void builderTest() {
         VehicleBuilder vehicleBuilder = new MiniCooper();
         CarDirector carDirector = new CarDirector(vehicleBuilder);
         carDirector.constuctCar();
         Car c = carDirector.getCar();
         Assert.assertNotNull(c);
     
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
