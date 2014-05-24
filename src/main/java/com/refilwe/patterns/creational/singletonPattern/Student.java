/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.patterns.creational.singletonPattern;

/**
 *
 * @author Fifi
 */
public class Student {
    
    private static Student student = null;
    
    private Student(){
        
    }
    
    public static Student getInstance(){
        
        if(student == null){
            Student student = new Student();
            return student;
        }
        return student;
    }
    
    public String getPlace(){
        return "University";
    }
}
