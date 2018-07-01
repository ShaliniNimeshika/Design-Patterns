/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.chainofresponsibility;

/**
 *
 * @author Shalini PC
 */
public class DispenseFifity implements DispenceChain{

    private DispenceChain chain;
    
    @Override
    public void setNextChain(DispenceChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if (cur.getAmount()>=50) {
            int num = cur.getAmount()/50;
            int remain = cur.getAmount()%50;
            System.out.println("Dispense "+num+" of Fifty Note(s)");
            if (remain!=0) {
                this.chain.dispense(new Currency(remain));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
    
}
