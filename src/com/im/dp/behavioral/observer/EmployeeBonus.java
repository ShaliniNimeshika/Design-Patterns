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
public class EmployeeBonus extends Observer{

    public EmployeeBonus(Salary sal) {
        this.sal=sal;
        this.sal.addObserver(this);
    }
    
    @Override
    public void update() {//if salary changed, employees update their Bonus
        System.out.println("Employee bonus is Rs."+(sal.getVal()*3));
    }
    
}
