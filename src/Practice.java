
import java.util.Scanner;
public class Practice {

	
	//funtion to return the sum of two numbers 
	public static int Sum (int i1, int i2)
	{
		int result = 0;
		for (; i1 <= i2; i1++)
		{
			result += i1;
		}
		return result;
	}
	
	// main function
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter: ");
		int i1 = input.nextInt();
		System.out.printf("Enter: ");
		int i2 = input.nextInt();
		System.out.printf("hello" + "this is the result: " + Sum(i1, i2));
		input.close();
	}
	
	public void Draw()
	{
		//System.out.println("a\t" + "a^2\t" + "a^3\n");
		System.out.printf("a\t" , "a^2\t" , "a^3\n");

		for (int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				
			}
			
		}
	}
}
