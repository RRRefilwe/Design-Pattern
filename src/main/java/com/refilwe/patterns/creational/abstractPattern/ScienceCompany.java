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
public class ScienceCompany extends CompanyFactory{

    @Override
    public Departments getDepartment(String dep) {
        if("B".equals(dep)){
            return new SectionB();  
        }else
            return new SectionA();
    
    }


    
}
