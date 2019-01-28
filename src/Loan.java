/*
Name: Tri Doan
Class and Section: CIS 35A Monday and Wednesday 6:00pm class / in class 
Assignment Number 1 Part 1 
Due Date: 01/20/2019
Date Submitted: 01/20/2019

Description: User enter a number and the program will calculate and display the square root of that number.
 */
import java.util.*;

public class Loan 
{
	public static void main(String[] args) 
	{
		//Create a scanner 
		Scanner input = new Scanner(System.in);
		//Create variable and input set up 
		System.out.print("Loan Amount: ");
		double LoanAmount = input.nextDouble();
		
		//System.out.print(LoanAmount); // test input
	
		//Enter number of years
		System.out.print("Number of Years: ");
		double NumberOfYear = input.nextInt();
		
		//System.out.print(NumberOfYear); // test input

		//Enter annual interest rate
		System.out.print("Annual Interest Rate: ");
		double AnnualInterestRate = input.nextDouble();
		
		//System.out.print(AnnualInterestRate); // test input
		
		//Obtain monthly interest
		double MonthlyInterestRate = AnnualInterestRate / 1200; 
		
		//Calculate payment 
		double MonthlyPayment = LoanAmount * MonthlyInterestRate / (1 -1 / Math.pow( 1 + MonthlyInterestRate, NumberOfYear * 12));
		
		//Get total payment
		double TotalPayment = MonthlyPayment * NumberOfYear * 12;
		
		//Display results
		System.out.printf("\nMonthly Payment: %.2f" , MonthlyPayment);
		System.out.printf("\nTotal Payment: %.2f" , TotalPayment);
		
		//Create three variable to hold balance, principal, and interest for every month
		double balance = LoanAmount;
		double principal;
		double interest;
		
		//Create table
		System.out.println("\n\nPayment#" + "\t" + "Interest" +  "\t" +"Principal" +  "\t" +"Balance\n");
		//Create loop to run number amount of months + its result data 
		for(int i = 1; i <= NumberOfYear*12; i++)
		{
			interest = MonthlyInterestRate * balance;
			principal = MonthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + (int)(interest*100) / 100.0 + "\t\t" + (int)(principal * 100) / 100.0 + "\t\t" + (int)(balance * 100) / 100.0);
		}
		input.close();  //close Scanner 
	}

}

//Sample Runs 
/*

Loan Amount: 20000
Number of Years: 1
Annual Interest Rate: 7

Monthly Payment: 1730.53
Total Payment: 20766.41

Payment#	Interest	Principal	Balance

1			116.66		1613		18386.13
2			107.25		1623		16762.84
3			97.78		1632		15130.09
4			88.25		1642		13487.82
5			78.67		1651		11835.96
6			69.04		1661		10174.47
7			59.35		1671		8503.29
8			49.6		1680		6822.35
9			39.79		1690		5131.61
10			29.93		1700		3431.01
11			20.01		1710		1720.49
12			10.03		1720		0.0


------------------------------------------------
------------------------------------------------
------------------------------------------------


Loan Amount: 30000
Number of Years: 2
Annual Interest Rate: 5

Monthly Payment: 1316.14
Total Payment: 31587.4

Payment#	Interest	Principal	Balance

1			125.0		1191		28808.85
2			120.03		1196		27612.75
3			115.05		1201		26411.66
4			110.04		1206		25205.57
5			105.02		1211		23994.45
6			99.97		1216		22778.28
7			94.9		1221		21557.05
8			89.82		1226		20330.73
9			84.71		1231		19099.3
10			79.58		1236		17862.74
11			74.42		1241		16621.03
12			69.25		1246		15374.14
13			64.05		1252		14122.06
14			58.84		1257		12864.76
15			53.6		1262		11602.22
16			48.34		1267		10334.42
17			43.06		1273		9061.34
18			37.75		1278		7782.95
19			32.42		1283		6499.24
20			27.08		1289		5210.18
21			21.7		1294		3915.74
22			16.31		1299		2615.92
23			10.89		1305		1310.68
24			5.46		1310		0.0

 */
