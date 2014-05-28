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
public class TuesdayHandler extends WeekHandler{

    @Override
    public String handleRequest(WeekEnum request) {
        String response = "rice";
        
        if(request == WeekEnum.Tuesday){
            response = "Rice";
        }else
            if(successor != null){
            successor.handleRequest(request);
        }
        return response;
    }
    
}
