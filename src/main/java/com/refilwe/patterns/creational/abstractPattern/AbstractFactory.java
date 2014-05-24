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
public class AbstractFactory {
    
    public CompanyFactory getCompany(String comp){
        if("Finance".equals(comp)){
            return new FinanceCompany();
        }
        else
            return new ScienceCompany();
    }
    
}
