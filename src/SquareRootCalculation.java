/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment Number 1 Part 2
Due Date: 01/20/2019
Date Submitted: 01/20/2019

Description: User suppose to enter the loan amount, number of years, and annual interest rate. 
After that the program will display the monthly payment, annual payment, and a table showing every
month during the year with payment #, interest, principal, and balance.
 */

import java.util.Scanner;

public class SquareRootCalculation {
	public static void main(String[] args) 
	{
	//create scanner 
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	double number = input.nextDouble();
	//case if number is 0
	if(number == 0)
	{
		System.out.println("Can't accept 0 as input!");
		System.exit(1);
	}
	else if(number < 0)
	{
		//convert to positive number and pass variable to the function findnextGuesst
		System.out.println("Square root of " + number + " is " + findnextGuesst(Math.abs(number)) +"i");
	}
	else
	{
		//pass number to the function and print out result
		System.out.println("Square root of " + (int)number + " is " + findnextGuesst(number));
	}
	
	//close Scanner
	input.close();
	}
	
	
	//return the square root of variable n 
	public static double findnextGuesst (double num)
	{
		double nextGuess = num;
		//initial guess can be any positive value
		double lastGuess = 1;
		do
		{
			//if last and next not equal then set next equal to last guess
			lastGuess = nextGuess;
			
			//formula to approximate the square root
			nextGuess = (lastGuess+ (num/lastGuess))/2;
			
		} while((lastGuess-nextGuess ) > 0.0001);  //when last and next guess are almost identical 
		
		return nextGuess;
	}
}

//Sample Runs 
/*

Enter a number: 30
Square root of 30 is 5.47722557564769

-------------------------
-------------------------
-------------------------

Enter a number: 70
Square root of 70 is 8.3666002653415

-------------------------
-------------------------
-------------------------

Enter a number: 100
Square root of 100 is 10.000000000139897

*/