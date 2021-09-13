/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creating scanner

		//prompts user to enter input string
		System.out.print("What is the input string? ");
		String string = input.nextLine();

		// Display the number of letters in the string
		System.out.println(string + " has " + countLetters(string) + " characters.");
	}

	//counts number of characters in string
	public static int countLetters(String s) {
		int numberOfLetters = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i)))
				numberOfLetters++; //increments character count
		}
		return numberOfLetters;
  }
}