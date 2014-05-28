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
public class MondayHandler extends WeekHandler {

    @Override
    public String handleRequest(WeekEnum request) {
        
        String response = null;
        
       if(request == WeekEnum.Monday){
          response = "Stamp";
       }else
           if(successor != null){
           successor.handleRequest(request);
       }
       return response;
    }
    
}
