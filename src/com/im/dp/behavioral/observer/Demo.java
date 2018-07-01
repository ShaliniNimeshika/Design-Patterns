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
public class Demo {
    public static void main(String[] args) {
        Salary salary=new Salary();
        
        new ManagerBonus(salary);
        new EmployeeBonus(salary);
        
        salary.setVal(5000);
        salary.setVal(5500);
        
        
    }
}
