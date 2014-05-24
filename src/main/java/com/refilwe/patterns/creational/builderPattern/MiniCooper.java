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
public class MiniCooper implements VehicleBuilder{
    private Car c;
    
    public MiniCooper(){
        c = new Car();
    }
    

    @Override
    public void colour() {
        c.setColour("Black"); 
    }

    @Override
    public void model() {
        c.setModel("newS");
    }

    @Override
    public void size() {
       c.setSize(30);
    }

    @Override
    public void noOfDoors() {
       c.setNoOfDoors(4); 
    }

    @Override
    public Car getCar() {
       return c;
    }
    
}
