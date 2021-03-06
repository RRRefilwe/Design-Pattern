/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.creation;

import com.refilwe.patterns.creational.prototypePattern.Bird;
import com.refilwe.patterns.creational.prototypePattern.People;
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
public class prototypeTest {
    
    public prototypeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void prototypeTest() {
         Bird sili = new Bird("Wings");
         Bird siliClone = (Bird)sili.doPrototype();
         Assert.assertNotSame(sili, siliClone);
         
         
         People person1 = new People("wheelchair");
         People person2 = (People) person1.doPrototype();
         Assert.assertNotSame(person2, person1);
         
         
         
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
