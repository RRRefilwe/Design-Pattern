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
public class SectionA extends Departments{

    @Override
    public double getEmployeePay(double ratePerHour, int hours) {
        double pay = hours * ratePerHour;
        return pay;
    }
    
}
