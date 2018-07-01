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
public class Demo {
    public static void main(String[] args) {
        PersonBuilder personbuilder = new PersonBuilder();
        
        personbuilder.setName("Nimesh");
        personbuilder.setAge(25);
        personbuilder.setCity("Kegalle");
        personbuilder.setIsFemale(false);
        personbuilder.setIsMarried(false);
        
        System.out.println(personbuilder.createPerson().display());
        
    }
}
