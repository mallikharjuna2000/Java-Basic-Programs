package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMWithdrawl {

	public static void main(String[] args) {
		double accountBalance = 10000.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amount to withdraw : ");
		double withdrawAmount = scanner.nextDouble();
		if (withdrawAmount <= accountBalance) {
			double remainingBalance = accountBalance - withdrawAmount;
			System.out.println(withdrawAmount + "  succesuffuly withdrawn... remaing balance in your account is :"
					+ remainingBalance);
		} else {
			System.out.println("Insuffiucient funds please check your account balance");
		}

	}

}
