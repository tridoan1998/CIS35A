/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment Number 2 Part 1
Due Date: 02/01/2019
Date Submitted: 02/01/2019


Part 1 - Personal Information Class

Design a class that hold the personal data: name, address, age and phone number.
Write appropriate methods (constructor, getters ad setters. Demonstrate the class 
by writing a program that creates three instances of the class. You can populate 
information in each object using Scanner class. Please do not use any personal 
information as data in the project. 
 
Submit a class diagram, test runs and code (.java file) with your submission.
Please create a zip file and submit a single attachment for part 1.
*/

//this class holds the personal data: name, address, age and phone number.

//Scanner utility for input from user
import java.util.*;

public class Personal_Information {
	
	//declare variables for the class
	String name = "", address = "";
	int age = 0, phonenumber = 0;
	
	public Personal_Information()
	{
		
	}
	
	public static void main(String[] args) 
	{
		//Create a scanner 
		Scanner input = new Scanner(System.in);
		
		//Create instances of the class Personal_Information
		Personal_Information PersonA, PersonB, PersonC;
		
		PersonA = new Personal_Information();
		PersonA.age = 1;
			
		System.out.println("");
		
		//Create a loop to input all 3 users informations into the class
		for(int i = 0; i < 3; i++)
		{
			
		}
		System.out.println("Enter name: ");
		
		
		

	}

}

