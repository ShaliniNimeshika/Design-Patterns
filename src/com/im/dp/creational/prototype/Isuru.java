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
public class Isuru implements Person{

    private String name = "Isuru Prototype is Exizting";
    
    @Override
    public Person clone() {
        return new Isuru();
    }
    
    public String toString(){
        return name;
    }
    
}
