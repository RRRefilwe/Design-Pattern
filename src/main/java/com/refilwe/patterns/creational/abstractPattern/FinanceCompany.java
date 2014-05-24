/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.creational.abstractPattern;

/**
 *
 * @author Fifi
 */
public class FinanceCompany extends CompanyFactory{

    @Override
    public Departments getDepartment(String dep) {
        if("C".equals(dep)){
            return new SectionC();
        }else
            return new SectionA();
        
    
    }

  
    
}
