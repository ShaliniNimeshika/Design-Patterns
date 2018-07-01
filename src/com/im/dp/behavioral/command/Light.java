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
public class Light {
    private boolean on;
    public void switchOn(){
        on = true;
        System.out.println("Lights Switch On");
    }
    public void switchOff(){
        on = false;
        System.out.println("Lights Switch Off");
    }
}
