package main;

import java.util.Scanner;

public class Converter {

	// Main Method
	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) { // case 4 returns void
			System.out.println("Please select a type of unit: \n"
					+ "1. Volume \n"
					+ "2. Distance/Speed \n"
					+ "3. Money \n"
					+ "4. Quit");
			
			try {
				menuSelection = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Exception thrown: " + e);
				System.out.println("Incorrect Selection, Quitting Program");
				return;
			}
			
			switch (menuSelection) {
				default:
					System.out.println("Incorrect Selection");
					break;
				case 1:
					convertVolume(scanner);
					break;
				case 2:
					convertDistance(scanner);
					break;
				case 3:
					convertMoney(scanner);
					break;
				case 4:
					System.out.println("Quitting Program");
					scanner.close();
					return;
			}
		}
	}
	
	
	// Volume Conversions
	static void convertVolume(Scanner scanner) {		
		System.out.println("Select a conversion: \n"
				+ "1. Cups to Teaspoons \n"
				+ "2. Teaspoons to Cups \n"
				+ "3. US Gallons to Imperial Gallons \n"
				+ "4. Imperial Gallons to US Gallons");
		
		int entry = 0;
		double multiplier = 0;
		String unitOne = " n/a";
		String unitTwo = " n/a";
		
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				multiplier = 48;
				unitOne = " Cups";
				unitTwo = " Teaspoons";
				break;
			case 2:
				multiplier = 1/48;
				unitOne = " Teaspoons";
				unitTwo = " Cups";
				break;
			case 3:
				multiplier = 0.832674;
				unitOne = " US Gallons";
				unitTwo = " Imperial Gallons";
				break;
			case 4:
				multiplier = 1.20095;
				unitOne = " Imperial Gallons";
				unitTwo = " US Gallons";
				break;
			default:
				System.out.println("Incorrect Selection");
		}
		
		System.out.println("How many" + unitOne + "?");
		double amount = 0;
		try {
			amount = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		System.out.println(amount + unitOne + " equals " + amount * multiplier + unitTwo + ".");
	}
	
	// Distance Conversions
	static void convertDistance(Scanner scanner) {
		System.out.println("Select a conversion: \n"
				+ "1. Miles to Kilometers \n"
				+ "2. Kilometers to Miles \n"
				+ "3. MPH to Knots \n"
				+ "4. Knots to MPH");

		int entry = 0;
		double multiplier = 0;
		String unitOne = " n/a";
		String unitTwo = " n/a";
		
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				multiplier = 1.60934;
				unitOne = " Miles";
				unitTwo = " Kilometers";
				break;
			case 2:
				multiplier = 0.621371;
				unitOne = " Kilometers";
				unitTwo = " Miles";
				break;
			case 3:
				multiplier = 0.868976;
				unitOne = " MPH";
				unitTwo = " Knots";
				break;
			case 4:
				multiplier = 1.15078;
				unitOne = " Knots";
				unitTwo = " MPH";
				break;
			default:
				System.out.println("Incorrect Selection");
		}
		
		System.out.println("How many" + unitOne + "?");
		double amount = 0;
		try {
			amount = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		System.out.println(amount + unitOne + " equals " + amount * multiplier + unitTwo + ".");
		
	}
	
	// Money Conversions
	static void convertMoney(Scanner scanner) {
		System.out.println("Select a conversion: \n"
				+ "1. USD to Euro \n"
				+ "2. Euro to USD \n"
				+ "3. USD to Yen \n"
				+ "4. Yen to USD");
		
		int entry = 0;
		double multiplier = 0;
		String unitOne = " n/a";
		String unitTwo = " n/a";
		
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				multiplier = 0.83;
				unitOne = " USD";
				unitTwo = " Euro";
				break;
			case 2:
				multiplier = 1.21;
				unitOne = " Euro";
				unitTwo = " USD";
				break;
			case 3:
				multiplier = 109.72;
				unitOne = " USD";
				unitTwo = " Yen";
				break;
			case 4:
				multiplier = 0.0091;
				unitOne = " Yen";
				unitTwo = " USD";
				break;
			default:
				System.out.println("Incorrect Selection");
		}
		
		System.out.println("How many" + unitOne + "?");
		double amount = 0;
		try {
			amount = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		System.out.println(amount + unitOne + " equals " + amount * multiplier + unitTwo + ".");
	}
	
}