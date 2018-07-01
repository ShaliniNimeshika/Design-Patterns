/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.builder;

/**
 *
 * @author Shalini PC
 */
public class Person {
    private String name;
    private int age;
    private String city;
    private boolean isFemale;
    private boolean isMarried;
    
    Person(String name, int age, String city, boolean isFemale, boolean isMarried){
        this.name = name;
        this.age = age;
        this.city = city;
        this.isFemale = isFemale;
        this.isMarried = isMarried;
        
        
    }
    
    public String display(){
        String gender;
        String status;
        if (isFemale == true) {
            gender = "Female";
        } else {
            gender = "Male";
        }
        
        if (isMarried == true) {
            status = "Married";
        } else {
            status = "Unmarried";
        }
        
        return (this.name+" is a "+this.age+" years old "+status+" "+gender+" who lives in "+city);
    }
    
    
}
