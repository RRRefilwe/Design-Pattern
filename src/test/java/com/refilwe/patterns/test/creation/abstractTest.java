/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.test.creation;

import com.refilwe.patterns.creational.abstractPattern.AbstractFactory;
import com.refilwe.patterns.creational.abstractPattern.CompanyFactory;
import com.refilwe.patterns.creational.abstractPattern.Departments;
import com.refilwe.patterns.creational.abstractPattern.FinanceCompany;
import com.refilwe.patterns.creational.abstractPattern.ScienceCompany;
import com.refilwe.patterns.creational.abstractPattern.SectionA;
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
public class abstractTest {
    
    public abstractTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void abstractTest() {
         AbstractFactory abstr= new AbstractFactory();
         
         CompanyFactory c1 = abstr.getCompany("Finance");
         Departments dep = c1.getDepartment("A"); 
         double pay = dep.getEmployeePay(100.00, 8);
         Assert.assertNotNull(c1); 
         Assert.assertEquals(pay, 800.00, 2);
       
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
