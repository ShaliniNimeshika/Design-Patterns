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
public interface DispenceChain {
    public void setNextChain(DispenceChain nextChain);
    void dispense(Currency cur);
}
