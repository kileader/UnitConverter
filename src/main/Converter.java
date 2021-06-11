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
					System.out.println("");
					break;
				case 1:
					selectVolume(scanner);
					System.out.println("");
					break;
				case 2:
					selectDistance(scanner);
					System.out.println("");
					break;
				case 3:
					selectMoney(scanner);
					System.out.println("");
					break;
				case 4:
					System.out.println("Quitting Program");
					scanner.close();
					return;
			}
		}
	}
	
	
	// Methods for selecting a conversion
	static void selectVolume(Scanner scanner) {		
		System.out.println("Select a conversion: \n"
				+ "1. Cups to Teaspoons \n"
				+ "2. Teaspoons to Cups \n"
				+ "3. US Gallons to Imperial Gallons \n"
				+ "4. Imperial Gallons to US Gallons");
		
		int entry = 0;
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				cupsToTeaspoons(scanner);
				break;
			case 2:
				teaspoonsToCups(scanner);
				break;
			case 3:
				usGallonsToImperialGallons(scanner);
				break;
			case 4:
				imperialGallonsToUsGallons(scanner);
				break;
			default:
				System.out.println("Incorrect Selection");
		}
	}
	static void selectDistance(Scanner scanner) {
		System.out.println("Select a conversion: \n"
				+ "1. Miles to Kilometers \n"
				+ "2. Kilometers to Miles \n"
				+ "3. MPH to Knots \n"
				+ "4. Knots to MPH");

		int entry = 0;
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				milesToKilometers(scanner);
				break;
			case 2:
				kilometersToMiles(scanner);
				break;
			case 3:
				mphToKnots(scanner);
				break;
			case 4:
				knotsToMph(scanner);
				break;
			default:
				System.out.println("Incorrect Selection");
		}
	}
	static void selectMoney(Scanner scanner) {
		System.out.println("Select a conversion: \n"
				+ "1. USD to Euro \n"
				+ "2. Euro to USD \n"
				+ "3. USD to Yen \n"
				+ "4. Yen to USD");
		
		int entry = 0;
		try {
			entry = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Selection");
			return;
		}
		
		switch (entry) {
			case 1:
				usdToEuro(scanner);
				break;
			case 2:
				euroToUsd(scanner);
				break;
			case 3:
				usdToYen(scanner);
				break;
			case 4:
				yenToUsd(scanner);
				break;
			default:
				System.out.println("Incorrect Selection");
		}
	}
	
	
	// Volume Conversions
	static void cupsToTeaspoons(Scanner scanner) {
		System.out.println("How many Cups?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double cups = entry;
		double teaspoons = cups * 48;
		System.out.println(cups + " cups equals " + teaspoons + " teaspoons.");
	}
	static void teaspoonsToCups(Scanner scanner) {
		System.out.println("How many Teaspoons?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double teaspoons = entry;
		double cups = teaspoons / 48;
		System.out.println(teaspoons + " teaspoons equals " + cups + " cups.");
	}
	static void usGallonsToImperialGallons(Scanner scanner) {
		System.out.println("How many US Gallons?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double usGallons = entry;
		double imperialGallons = usGallons * 0.832674;
		System.out.println(usGallons + " US gallons equals " + imperialGallons + " Imperial gallons.");
	}
	static void imperialGallonsToUsGallons(Scanner scanner) {
		System.out.println("How many Imperial Gallons?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double imperialGallons = entry;
		double usGallons = imperialGallons * 1.20095;
		System.out.println(imperialGallons + " Imperial gallons equals " + usGallons + " US Gallons.");
	}
	
	// Distance Conversions
	static void milesToKilometers(Scanner scanner) {
		System.out.println("How many Miles?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double miles = entry;
		double kilometers = miles * 1.60934;
		System.out.println(miles + " miles equals " + kilometers + " kilometers.");
	}
	static void kilometersToMiles(Scanner scanner) {
		System.out.println("How many Kilometers?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double kilometers = entry;
		double miles = kilometers * 0.621371;
		System.out.println(kilometers + " kilometers equals " + miles + " miles.");
	}
	static void mphToKnots(Scanner scanner) {
		System.out.println("How many MPH?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double mph = entry;
		double knots = mph * 0.868976;
		System.out.println(mph + " mph equals " + knots + " knots.");
	}
	static void knotsToMph(Scanner scanner) {
		System.out.println("How many Knots?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double knots = entry;
		double mph = knots * 1.15078;
		System.out.println(knots + " knots equals " + mph + " mph.");
	}
	
	// Money Conversions
	static void usdToEuro(Scanner scanner) {
		System.out.println("How many USD?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double usd = entry;
		double euros = usd * 0.83;
		System.out.println(usd + " USD equals " + euros + " Euros.");
	}
	static void euroToUsd(Scanner scanner) {
		System.out.println("How many Euros?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double euros = entry;
		double usd = euros * 1.21;
		System.out.println(euros + " Euros equals " + usd + " USD.");
	}
	static void usdToYen(Scanner scanner) {
		System.out.println("How many USD?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double usd = entry;
		double yen = usd * 109.71;
		System.out.println(usd + " USD equals " + yen + " Yen.");
	}
	static void yenToUsd(Scanner scanner) {
		System.out.println("How many Yen?");
		double entry = 0;
		try {
			entry = scanner.nextDouble();
		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			System.out.println("Incorrect Entry");
			return;
		}
		double yen = entry;
		double usd = yen * 0.0091;
		System.out.println(yen + " Yen equals " + usd + " USD.");
	}
	
}