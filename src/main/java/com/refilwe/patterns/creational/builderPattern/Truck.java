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
public class Truck implements VehicleBuilder{
    
    private Car c;
    
    public Truck (Car c){
        c = new Car();
    }
    

    @Override
    public void colour() {
        c.setColour("Blue"); 
    }

    @Override
    public void model() {
        c.setModel("Classic");
    }

    @Override
    public void size() {
       c.setSize(50);
    }

    @Override
    public void noOfDoors() {
       c.setNoOfDoors(2); 
    }

    @Override
    public Car getCar() {
       return c;
    }
    
}
