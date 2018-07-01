/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.state;

/**
 *
 * @author Shalini PC
 */
public class TVStartState implements State{

    @Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}
    
}
