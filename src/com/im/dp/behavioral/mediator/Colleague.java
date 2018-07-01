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
abstract class Colleague {

    protected Mediator mediator;
    String name;

    public Colleague(Mediator m, String name) {
        mediator = m;
        this.name = name;
    }

    public abstract void sendMsg(String msg);

    public abstract void receiveMsg(String msg);
}
