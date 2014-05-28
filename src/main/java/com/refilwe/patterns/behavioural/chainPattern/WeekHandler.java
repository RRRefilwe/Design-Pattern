/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.behavioural.chainPattern;

/**
 *
 * @author Fifi
 */
public abstract class WeekHandler {
    
    WeekHandler successor;
    
    public void setSuccessor(WeekHandler successor){
        this.successor = successor;
    }
    public abstract String handleRequest(WeekEnum request);
}
