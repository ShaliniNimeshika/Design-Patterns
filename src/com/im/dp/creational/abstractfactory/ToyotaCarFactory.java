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
public class ToyotaCarFactory implements AbstractCarFactory{

    @Override
    public Car createCar() {
        ToyotaCar newToyota = new ToyotaCar();
        return newToyota;
    }
    
}
