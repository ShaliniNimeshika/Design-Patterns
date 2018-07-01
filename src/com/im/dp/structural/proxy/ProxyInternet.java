/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.proxy;

import java.util.ArrayList;

/**
 *
 * @author Shalini PC
 */
public class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static ArrayList<String> bannedSites;
     
    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
     
    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
         
        internet.connectTo(serverhost);
    }
}
