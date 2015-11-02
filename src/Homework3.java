/*
 * David Casarrubias-Mena
 * COSC 120
 * Dr. Lindsay Jamieson
 * This program prompts user for miles traveled and gallons used in order to calculate MPG on current trip and all trips combined. 
 */

import java.util.*;

public class Homework3 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double mpg; // miles per gallons for current trip
		double totalMPG = 0; // total miles per gallon for entire trip
		int trip;  // trip choice, 0 or 1. ) to exit, 1 to continue
		double miles; // miles traveled on current trip
		double gallons;  // gallons on current trip
		double totalMiles = 0; // initialize totalMiles traveled to 0
		double totalGallons = 0; // initialize total gallons traveled to 0
		
		System.out.println("Are you taking a trip? Enter 1 for yes or 0 for no"); // ASk user if they are taking a trip. Tells user to enter 1 for yes, 0 for no
		trip = input.nextInt(); // reads in users decision
		
		while(trip == 1){  // while the user decides to take a trip execute the following. 
			System.out.println("How many miles for this trip?"); // prompts user to enter miles traveled for this trip
			miles = input.nextDouble();  // stores miles traveled in variable miles
			totalMiles+=miles;  // adds the current miles traveled to the total miles traveled.
			
			System.out.println("How many gallons for this trip?"); // prompts user to enter how many gallons they used for the current trip
			gallons = input.nextDouble(); // stores gallons in variable gallons
			totalGallons+=gallons;  // adds current gallons to the total gallons counter. 
			
			mpg = miles / gallons; // sets mpg for current trip as miles divided by gallons
			totalMPG = totalMiles / totalGallons; // sets total miles per gallon on all trips equal to total miles traveled divided by total gallons used on all trips
			
			System.out.println("The MPG for this trip was " + mpg);  // prints out information to user. Information displays information about current miles per gallon on current trip
			
			System.out.println("Are you taking a trip? Enter 1 for yes or 0 for no");  // asks user if they wish to make another trip or exit
			trip = input.nextInt();  // reads in user choice
			
			if(trip == 0){ // if the user does not want to take a trip, exit from loop and print out their total miles per gallon for all trips combined
				System.out.println("The total MPG was " + totalMPG);  // prints out total miles per gallon for all trips 
			}
		}
		
			
		
		
	}
}
