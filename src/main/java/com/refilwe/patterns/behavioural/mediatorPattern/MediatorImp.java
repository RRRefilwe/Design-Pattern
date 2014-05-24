/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.behavioural.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fifi
 */
public class MediatorImp implements Mediator{

    private List<User> users;
    
    public MediatorImp(){
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u != user){
                u.recieve(msg);
            }
        }
                
   }

    @Override
    public void addUser(User user) {
         this.users.add(user);
     }
    
}
