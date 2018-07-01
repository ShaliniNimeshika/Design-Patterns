/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ConcreteMediator implements Mediator{

    private List<Colleague> colleague;
    
    public ConcreteMediator(){
        this.colleague=new ArrayList<>();
    }
    
    @Override
    public void sendMessage(String msg, Colleague collgeague) {
        for(Colleague c:this.colleague){
            if(c!=colleague){
                c.receiveMsg(msg);
            }           
        }
    }

    @Override
    public void addColleague(Colleague c) {
        this.colleague.add(c);
    }
    
}
