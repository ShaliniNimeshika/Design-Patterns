/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.prototype;

/**
 *
 * @author Shalini PC
 */
public class Nimesh implements Person{

    private String name = "Nimesh Prototype is Existing";
    
    @Override
    public Person clone() {
        return new Nimesh();
    }
    
    public String toString(){
        return name;
    }
}
