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
public class InterpreterClient {
    	private InterpreterEngine ie;
	
	public InterpreterClient(InterpreterEngine ie) {
		this.ie = ie;
	}
	
	public int interpret(String input) {
		
		Expression exp = null;
		
		if(input.contains("add")) {
			exp = new AddExpression(input);
		} else if(input.contains("subtract")) {
			exp = new SubtractExpression(input);
		}
		
		int result = exp.interpret(ie);
		System.out.println(input);
		
		return result;
	}
	
	public static void main(String args[]) {
		
		InterpreterClient ic = new InterpreterClient(new InterpreterEngine());
		
		System.out.println("Result = " + ic.interpret("add 12 and 13"));
		System.out.println("Result = " + ic.interpret("subtract 76 from 621"));
	}
}
