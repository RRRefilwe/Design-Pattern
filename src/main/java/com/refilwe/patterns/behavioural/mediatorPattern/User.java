/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.behavioural.mediatorPattern;

/**
 *
 * @author Fifi
 */
public abstract class User {
    protected Mediator me;
    protected String name;
    
    public User(Mediator me, String name){
        this.me = me;
        this.name = name;
    }
    
    public abstract void send(String message);
    public abstract void recieve(String message);
}
