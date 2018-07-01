/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.proxy;

/**
 *
 * @author Shalini PC
 */
public class RealInternet implements Internet{

    @Override
    public void connectTo(String ServerHost){
        System.out.println("Connecting to "+ ServerHost);
    }
    
}
