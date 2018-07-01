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
public class ShopOwner {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop nokia;
    
    public ShopOwner(){
        iphone = new IPhone();
        samsung = new Samsung();
        nokia = new Nokia();
    }
    
    public void iphoneSale(){
        iphone.modelno();
        iphone.price();
    }
    
    public void samsungSale(){
        samsung.modelno();
        samsung.price();
    }
    
    public void nokiaSale(){
        nokia.modelno();
        nokia.price();
    }
}
