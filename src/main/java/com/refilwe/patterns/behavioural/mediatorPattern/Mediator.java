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
public interface Mediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}
