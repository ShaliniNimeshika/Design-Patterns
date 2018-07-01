/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dp.behavioral.mediator;

/**
 *
 * @author Dell
 */
public class ConcreteColleague extends Colleague{

    public ConcreteColleague(Mediator m, String name) {
        super(m, name);
    }

    @Override
    public void sendMsg(String msg) {
        System.out.println(this.name+": Sent Message="+msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMsg(String msg) {
        System.out.println(this.name+": Received Message="+msg);
        
    }
    
}
