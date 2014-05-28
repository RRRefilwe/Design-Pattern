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
public class WednesdayHandler extends WeekHandler{

    @Override
    public String handleRequest(WeekEnum request) {
        String response = "pap";
        
        if(request == WeekEnum.Wednesday){
            response = "Pap";
        }else
            if(successor != null){
             successor.handleRequest(request);
        }
        return response;    
    
    }
    
}
