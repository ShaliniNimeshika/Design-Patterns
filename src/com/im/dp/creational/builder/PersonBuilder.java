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
public class PersonBuilder {
    private String name;
    private int age;
    private String city;
    private boolean isFemale;
    private boolean isMarried;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
        return this;
    }

    public PersonBuilder setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }
    
    public Person createPerson(){
        return new Person(name,age,city,isFemale,isMarried);
    }
 
}
