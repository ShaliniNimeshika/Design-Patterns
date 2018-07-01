/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.facade;

/**
 *
 * @author Shalini PC
 */
public class Samsung implements MobileShop{

    @Override
    public void modelno() {
        System.out.println("Samsung S8");
    }

    @Override
    public void price() {
        System.out.println("Rs.97,000");
    }
    
}
