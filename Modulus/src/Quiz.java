import java.util.Scanner;
public class Quiz
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.println("How many questions would you like me to ask you?");
				int answer = userInput.nextInt();
				int score = 0;
				score = score + firstQuestion();
				score = score + secondQuestion();
				for (int i = 0; i < answer-2; i++)
					{
						boolean right = quiz();
						if (right)
							{
								score++;
							}
					}
				System.out.println("Your score is " + score);
			}
		public static boolean quiz()
		{
			int first = (int)(Math.random()*20)+1;
			int second = (int)(Math.random()*first)-3;
			second = Math.max(second, 1);
			int mod = (first % second);
			System.out.println("What is "+ first + " % "+ second+ "?");
			int answer = userInput.nextInt();
			boolean right = answer == mod;
			return right;
		}
		public static int firstQuestion()
		{
			int first = (int)(Math.random()*20)+1;
			int second = first;
			int mod = (first % second);
			System.out.println("What is "+ first + " % "+ second+ "?");
			int answer = userInput.nextInt();
			int right = 0;
			if (answer == mod)
				{
					right++;
				}
			return right;
		}
		public static int secondQuestion()
		{
			int first = (int)(Math.random()*20)+1;
			int second = (int)(Math.random()*3)+first+1;
			int mod = (first % second);
			System.out.println("What is "+ first + " % "+ second+ "?");
			int answer = userInput.nextInt();
			int right = 0;
			if (answer == mod)
				{
					right++;
				}
			return right;
		}

	}
