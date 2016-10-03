/*
 * Heather Taylor
 * CIS 2212 Tuesdays Fall 2016
 * Lab 04 - Political Donations
 * Due September 20, 2016
 */

// This program is designed to track a minimum of political donations made this election year. 

package arrays;

import java.util.Scanner; // library for user input
import java.text.NumberFormat; // library for currency

public class Donations {

	public static void main(String[] args) {
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Set up currency object
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// Display header
		System.out.println("Political Donations Tracker");
		System.out.println("-------------------------------");
		
		// Declare variable for number of donors
		int numDonors;
		
		// ask for number of donors to be tracked + verify at least 15
		System.out.print("\nHow many donors will you be tracking today? ");
		numDonors = input.nextInt();
		
		while (numDonors < 15){
			System.out.println("The minimum number of donors that can be tracked is 15.");
			System.out.print("Please enter a number equal to or greater than 15: ");
			numDonors = input.nextInt();
		}
		
		// Declare variables
		String [] donorName = new String [numDonors]; // holds first and last name of donor
		double [] amtDonated = new double [numDonors]; // holds the amount of the donation
		int [] numDonations = new int [numDonors]; // holds the number of times the donation will be made
		double [] totalDonation = new double [numDonors]; // holds the total donation made by each donor
		double grandTotalDonations = 0.00; // holds the sum of all donations from all donors
		
		// loop to capture donation information from multiple donors
		for (int index = 0; index < donorName.length; index++){
			
			System.out.println("\nDonor #" + (index + 1));
			
			System.out.print("\tName: ");
			donorName[index] = input.nextLine(); // collect the donor's name
			input.nextLine();
			
			System.out.print("\tAmount of Donation: $");
			amtDonated[index] = input.nextDouble(); // collect the amount of the donation
			
				// validate amount of donation is $5
				while (amtDonated[index] < 5.00){
					System.out.print("\t\tMinimum donation is $5.00. Please try again: $");
					amtDonated[index] = input.nextDouble();
				} // end while loop to validate minimum donation
			
			System.out.print("\tNumber of Donations: ");
			numDonations[index] = input.nextInt(); // holds the number of donations made by a single donor
			
				// validate at least one donation made
				while (numDonations[index] < 1){
					System.out.print("\t\tA minimum of 1 donation is required. Please try again: ");
					numDonations[index] = input.nextInt();
				}
				
			// Tally and display total donations for donor
				
			totalDonation[index] = (numDonations[index] * amtDonated[index]);
			System.out.println("\tTotal from Donor: " + currency.format(totalDonation[index]));
			
			System.out.println("\n-------------------------------");
			
		} // end for loop
		
		// Loop through all donations to display tally of all donations
		for (int index = 0; index < totalDonation.length; index++){
			grandTotalDonations += totalDonation[index]; 
		}
		
		System.out.println("\nGrand Total of Doantions: " + currency.format(grandTotalDonations));
		
		input.close(); // close scanner object

	} // end main

} // end Donations class
