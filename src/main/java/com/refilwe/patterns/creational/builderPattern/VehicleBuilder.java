/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.creational.builderPattern;

/**
 *
 * @author Fifi
 */
public interface VehicleBuilder {
    public void colour();
    public void model();
    public void size();
    public void noOfDoors();
    public Car getCar();
       
}
