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
public class Car {
    
        
    private String colour;
    private String model;
    private int size;
    private int noOfDoors;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }
 
    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + ", model=" + model + ", size=" + size + ", noOfDoors=" + noOfDoors + '}';
    }

    
    
}
