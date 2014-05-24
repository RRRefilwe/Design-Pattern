/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.behavioural.templatePattern;

/**
 *
 * @author Fifi
 */
public class Pizza extends Meal{

    @Override
    public void prepareIngredients() {
       System.out.println("cheese, paste, veggies");
    }

    @Override
    public void cook() {
        
        System.out.println("put in oven");
    
    }

    @Override
    public void cleanUp() {
       
    System.out.println("wipe oven");
    
    }
    
}
