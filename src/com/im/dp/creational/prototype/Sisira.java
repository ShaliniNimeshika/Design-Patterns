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
public class Sisira implements Person{
    
    private String name ="Sisira Prototype is Existing";
    
    @Override
    public Person clone() {
        return new Sisira();
    }
    
    public String toString(){
        return name;
    }
}
