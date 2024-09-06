package com.codegnan.controlstatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Temparature in celsius : ");
		int temprature = scanner.nextInt();
		if (temprature > 30) {
			System.out.println("weather is too hot wear the cotton cloths ");
		}
		if (temprature > 20 && temprature < 30) {
			System.out.println("weather is normal... enjoy u r day ");
		}
		if (temprature > 10 && temprature < 20) {
			System.out.println("Weather is too cold please wear the sweater ..");
		}

	}

}
