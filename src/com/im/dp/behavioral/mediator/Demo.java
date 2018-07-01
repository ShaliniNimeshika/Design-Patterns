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
public class Demo {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague(mediator, "Venuka");
        Colleague c2 = new ConcreteColleague(mediator, "Lachini");
        mediator.addColleague(c1);
        mediator.addColleague(c2);
        
        c1.sendMsg("Hi IDEx");

    }
}
