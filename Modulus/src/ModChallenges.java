import java.util.ArrayList;
import java.util.Scanner;

public class ModChallenges
	{
		public static void main(String[] args)
			{
			doOddsOrEvens();
			doLeapYear();
			doArray();	
			doFizzBuzz();
			}
		
		public static void doOddsOrEvens()
			{
				Scanner userInput = new Scanner(System.in);
				int number;
				
				System.out.println("Please input a random number and I will tell you if it is Odd or Even.");
				number = userInput.nextInt();
				if(number % 2 == 0)
					{
					System.out.println("Your number is even.");
					}
				else
					{
					System.out.println("Your number is odd.");
					}
			}
		
		public static void doLeapYear()
		{
			int year;
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Now please input a random year and I will tell you if it is a leap year or not.");
			year = userInput2.nextInt();
			if(year % 4 == 0)
				{
				System.out.println("The year that you input is a leap year.");
				System.out.println();
				}
			else
				{
				System.out.println("The year that you input is not a leap year.");
				System.out.println();
				}	
		}
		
		public static void doArray()
		{
		int[] array = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};	
		for(int i = 0; i <= 9; i = i + 3)
			{
			System.out.println(array[i]);
			}
		System.out.println();
		}
		
		public static void doFizzBuzz()
			{
			for(int i = 1; i <= 100; i++)
				{
				if(i % 15 == 0)
					{
					System.out.println("fizz-buzz");
					}
				else if(i % 3 == 0)
					{
					System.out.println("fizz");
					}
				else if(i % 5 == 0)
					{
					System.out.println("buzz");
					}
				else
					{
					System.out.println(i);
					}
				}
			}

	}
//test
