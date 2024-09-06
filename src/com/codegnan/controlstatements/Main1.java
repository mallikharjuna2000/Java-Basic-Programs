package com.codegnan.controlstatements;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = scanner.nextInt();

		if (number > 0) {
			System.out.println("The Number " + number + " Is Positive :");
		} else {
			System.out.println("The Number " + number + " is Negative ");
		}

	}

}
