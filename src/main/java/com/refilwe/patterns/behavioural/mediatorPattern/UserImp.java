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
public class UserImp extends User{

    public  UserImp(Mediator me, String name){
        super(me,name);
    }
    @Override
    public void send(String message) {
        System.out.println(this.name+": Sending Message="+message);
        me.sendMessage(message, this);
   }

    @Override
    public void recieve(String message) {
        System.out.println(this.name+": Received Message:"+message);
  }
    
    
    
}
