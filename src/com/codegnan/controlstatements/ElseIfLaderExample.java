package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElseIfLaderExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your city name : ");
		String cityName = scanner.next();

		if (cityName.equalsIgnoreCase("Hyderabad")) {
			System.out.println("Hello Hyderabadi.. Adaab..");
		} else if (cityName.equalsIgnoreCase("Chennai")) {
			System.out.println("Hello Madrasi... Vannakkam....");
		} else if (cityName.equalsIgnoreCase("Banglore")) {
			System.out.println("Hello Kannadiga.... Namaskar...");
		} else {
			System.out.println("Please Enter the valid city name...");
		}

	}

}
