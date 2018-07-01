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
public class DecoratorDemo {
    public static void main( String[] args ) {
        Symbol[] array = {new SecondSymbol(new FirstSymbol()), new ThirdSymbol(new SecondSymbol(new FirstSymbol())),
                new FourthSymbol(new ThirdSymbol(new SecondSymbol(new FirstSymbol())))};
        for (Symbol anArray : array) {
            anArray.printSymbol();
            System.out.print("");
        }
    }
}
