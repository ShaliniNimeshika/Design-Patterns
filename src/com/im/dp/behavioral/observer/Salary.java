/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Salary {//Subject class

    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    private int val;

    public void setVal(int val){
        this.val=val;
        notifyAllObservers();
    }
    public int getVal() {
        return this.val;
    }

    private void notifyAllObservers() {
        for(Observer ob: observers){
            ob.update();
        }
    }

}
