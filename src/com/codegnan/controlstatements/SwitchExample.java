package com.codegnan.controlstatements;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Welcome to The vending machine! ");
		System.out.println("menu");
		System.out.println("1. coke");
		System.out.println("2. Pepsi");
		System.out.println("3. Water");
		System.out.println("4. soda");
		System.out.println("5. sprite");
		System.out.println("6. Exit");
		do {
			System.out.println("Enter your choice (1-6)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("You have selected Coke enjoy u r drink! ");
				break;
			case 2:
				System.out.println("You have selected Pepsi enjoy u r drink! ");
				break;
			case 3:
				System.out.println("You have selected Water.. enjoy u r drink! ");
				break;
			case 4:
				System.out.println("You have selected soda enjoy u r drink! ");
				break;
			case 5:
				System.out.println("You have selected Sprite enjoy u r drink! ");
				break;
			case 6:
				System.out.println("Thank you for using vending machine. Have a nice day ");
				break;
			default:
				System.out.println("InValid Choice . Please select a valid Option..");
				break;

			}
			System.out.println();
		} while (choice != 6);
	}
}
