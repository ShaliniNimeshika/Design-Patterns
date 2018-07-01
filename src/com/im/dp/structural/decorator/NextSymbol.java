/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.decorator;

/**
 *
 * @author Shalini PC
 */
public class NextSymbol implements Symbol{
    private Symbol core;
    
    public NextSymbol(Symbol inner){
        core = inner;
    }
    @Override
    public void printSymbol() {
        core.printSymbol();
    }
    
}
