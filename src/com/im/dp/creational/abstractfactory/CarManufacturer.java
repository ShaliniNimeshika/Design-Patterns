/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.abstractfactory;

/**
 *
 * @author Shalini PC
 */
public class CarManufacturer {
    public void buildCar(AbstractCarFactory newCar, String name, String color){
        Car car = newCar.createCar();
        car.setName(name);
        car.setColor(color);
    }
}
