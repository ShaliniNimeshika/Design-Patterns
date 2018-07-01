/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.behavioral.chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author Shalini PC
 */
public class Demo {
    private DispenceChain c1;

	public Demo() {
		// initialize the chain
		this.c1 = new DispenseFifity();
		DispenceChain c2 = new DispenseTwenty();
		DispenceChain c3 = new DispenseTen();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		Demo dispen = new Demo();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			dispen.c1.dispense(new Currency(amount));
		}

	}
}
