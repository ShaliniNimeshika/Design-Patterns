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
public interface Mediator {

    public void sendMessage(String msg, Colleague collgeague);
    
    void addColleague(Colleague c);
}
