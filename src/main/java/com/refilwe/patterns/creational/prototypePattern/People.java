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
public class People implements Prototype{

    String walk;
    public People(String walk){
        this.walk = walk;
    }
    @Override
    public Prototype doPrototype() {
        return new People(walk);
    }
    public String toString(){
        return "Walk with" + walk;
    }
}
