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
public class CarDirector {
    
    private  VehicleBuilder vBuilder = null;
    
    public CarDirector (VehicleBuilder vBuilder){
        this.vBuilder = vBuilder;
    }
    
    public void constuctCar(){
        vBuilder.colour();
        vBuilder.model();
        vBuilder.noOfDoors();
        vBuilder.size();
    }
    public Car getCar(){
        return vBuilder.getCar();
    }
}
