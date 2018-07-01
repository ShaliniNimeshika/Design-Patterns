/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.interpreter;

/**
 *
 * @author Shalini PC
 */
public class AddExpression implements Expression{
    	private String expression;
	
	public AddExpression(String expression) {
		this.expression = expression;
	}
 
	@Override
	public int interpret(InterpreterEngine ie) {
		return ie.add(expression);
	}
 
}
