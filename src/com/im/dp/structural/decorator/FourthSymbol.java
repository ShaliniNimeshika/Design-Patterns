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
public class FourthSymbol extends NextSymbol{
    public FourthSymbol(Symbol inner) {
        super(inner);
    }

    @Override
    public void printSymbol() {
        super.printSymbol();
        printFourth();
    }

    private void printFourth() {
        System.out.print('&');
    }
}
