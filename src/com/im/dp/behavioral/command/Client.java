/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.command;

/**
 *
 * @author Shalini PC
 */
public class Client {
    public static void main(String[] args) {
        Remote control = new Remote();
        
        Light light = new Light();
        
        Command lightsOn = new LightOn(light);
        Command lightsOff = new LightOff(light);
    //switch on
        control.setCommand(lightsOn);
        control.pressButton();
    
    //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
