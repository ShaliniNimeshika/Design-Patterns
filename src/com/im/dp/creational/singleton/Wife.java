/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.singleton;

import java.util.Calendar;

/**
 *
 * @author Shalini PC
 */

//This is SINGLETON PATTERN
public class Wife extends Person{
    static Wife wife;
    
    //make constructor PRIVATE
    private Wife(){}
    
    //create public function to access 
    public static Wife getInstance(){
        
        if (wife == null) {
            wife = new Wife();
        }
        return wife;
    }
    
    //Real example for Singleton pattern
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
   
}

//singleton : guaranteed not to create two objects

