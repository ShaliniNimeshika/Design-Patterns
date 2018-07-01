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
public class ClientDemo {
    public static void main (String[] args)
    {
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("www.designpatterns.org");
            internet.connectTo("helloworld.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
