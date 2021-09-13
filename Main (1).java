/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.util.Scanner;

class Main {
    public static void main( String args[] ) {
       Scanner input = new Scanner(System.in);//creating scanner

       //prompts user to enter input string
       System.out.print("What is the input string? ");
       String string = input.nextLine();

       //displays the number of characters in string
       int length = string.length();  //calls the inbuilt lenght() method
       System.out.println(string + " has " + length + " characters.");
       }
}