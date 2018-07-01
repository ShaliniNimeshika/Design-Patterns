/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.singleton;

import sun.security.jca.GetInstance;

/**
 *
 * @author Shalini PC
 */
public class Demo {
    public static void main(String[] args) {
        Wife wife1 = Wife.getInstance();
        wife1.name = "Nayanthi";
        Wife wife2 = Wife.getInstance();
        wife2.name = "Mayanthi";
        
        System.out.println("W1 = "+wife1.name);
        System.out.println("W2 = "+wife2.name);
    }
}
