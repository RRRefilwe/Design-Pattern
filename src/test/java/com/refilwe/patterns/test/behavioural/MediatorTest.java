/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.behavioural;

import com.refilwe.patterns.behavioural.mediatorPattern.Mediator;
import com.refilwe.patterns.behavioural.mediatorPattern.MediatorImp;
import com.refilwe.patterns.behavioural.mediatorPattern.User;
import com.refilwe.patterns.behavioural.mediatorPattern.UserImp;
import junit.framework.Assert;
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
public class MediatorTest {
    
    public MediatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void mediatorTest() {
     
        Mediator mediator = new MediatorImp();
        User user1 = new UserImp(mediator, "Refilwe");
        User user2 = new UserImp(mediator, "Khanyi");
        
        mediator.addUser(user1);
        mediator.addUser(user2);

         
        user1.send("Hi All");
        Assert.assertNotNull(user2);
     
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
