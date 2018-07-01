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
public class LightOff implements Command{
    
    Light light;

    LightOff(Light light) {
        this.light=light;
    }
    
    @Override
    public void execute() {
         light.switchOff();
    }
}
