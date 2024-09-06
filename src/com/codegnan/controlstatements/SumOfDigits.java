package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int originalNumber=number;
		int count = 0;
		int remainder;
		while (number != 0) {
			
			
			number = number / 10;
			count++;
		}
		System.out.println("the count  digits in a given number " + originalNumber + " is : " + count);

	}

}
