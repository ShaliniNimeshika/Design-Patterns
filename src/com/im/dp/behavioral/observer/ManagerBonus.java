/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dp.behavioral.observer;

/**
 *
 * @author Dell
 */
public class ManagerBonus extends Observer{

    public ManagerBonus(Salary sal) {
        this.sal=sal;
        this.sal.addObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("Manager Bonus is Rs."+(sal.getVal() * 5));
    }
    
}
