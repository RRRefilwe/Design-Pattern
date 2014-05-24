/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.creational.factoryPattern;

/**
 *
 * @author Fifi
 */
public class MovieFactory {
    
    public static Movie getMovie(String type){
        if(type.equals("Matrix")){
            return new Friction();
        }else
        {
            return new Comdey();
        }
    }   
}

