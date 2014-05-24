/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.creational.prototypePattern;

/**
 *
 * @author Fifi
 */
public class Bird implements Prototype{

    private String fly;
    public Bird(String fly){
        this.fly = fly;
    }
    @Override
    public Prototype doPrototype() {
        return new Bird(fly);
    }
    public String toString() { 
        return "Fly with" + fly;
    }
}
