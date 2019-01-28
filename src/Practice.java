

//A prime number is a whole number greater than 1, which is only divisible by 1 and itself. 
//First few prime numbers are : 2 3 5 7 11 13 17 19 23 …..


import java.util.*;
public class Practice {
	
	// main function
	public static void main(String[] args) 
	{	
		System.out.println(Max(3,0));
	}
	
	public static int Max(int a, int b)
	{
		int max = 0;
		if(a > b)
		{
			max = a;
		}
		else if(a == b)
		{
			max = a;
		}
		else 
		{
			max = b;
		}
		return max;
	}
}

