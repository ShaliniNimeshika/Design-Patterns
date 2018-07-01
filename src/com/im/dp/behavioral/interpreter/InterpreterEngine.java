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
public class InterpreterEngine {
    	public int add(String input) {
		String[] tokens = interpret(input);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);
		return (num1 + num2);
	}
 
	public int subtract(String input) {
		String[] tokens = interpret(input);
		int num1 = Integer.parseInt(tokens[0]);
		int num2 = Integer.parseInt(tokens[1]);		
		return (num2 - num1);
	}
	
	private String[] interpret(String input) {
		String str = input.replaceAll("[^0-9]", " ");
		str = str.replaceAll("( )+", " ").trim();
		String[] tokens = str.split(" ");
		return tokens;
	}
}
