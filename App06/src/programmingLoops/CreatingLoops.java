package programmingLoops;

import javax.swing.JOptionPane;

public class CreatingLoops
{

	public CreatingLoops() // Constructor
	{
		countingWithWhileLoops(); // 1A. performs multiple while loops in sequence
		
		askForStudentName(); // 1B. inputs students name and ends program when "no more students" is entered
		
		inputIntegersUntilMatchIsMade(); // 1C. input an integer until certain number "-99" ends loop
		
		inputStringUntilMatchIsMade(); // 1D. input a string until certain number "-99" ends loop
		
		inputDoubleUntilMatchIsMade(); // 1E. input a double until certain number "-99.99" ends loop
		
		inputStringUntilSentinel(); // 1F. input a string until sentinel value is input
		
		countingWithForLoops();// 2A performs multiple for loops in sequence
	}

	public void countingWithWhileLoops()
	{
		int countsFromOneToTen = 1;
		int countsFromTenToOne = 10;
		int countsFromNegativeTentoTen = -10;
		int countsInStepsOfThrityTwo = -1001;
		int countsInStepsOfSixtyFour = 253;

		System.out.println(countsFromOneToTen + " is before the loop "); // shows the number before entering the loop

		while (countsFromOneToTen <= 10)
		{
			System.out.println(countsFromOneToTen + " is inside the loop"); // shows the number inside the loop when parameter is true

			countsFromOneToTen++;
		}
		
		System.out.println(countsFromOneToTen + " is after the loop"); // shows the number that breaks the loop

		System.out.println();

		System.out.println(countsFromTenToOne + " is before the loop"); // shows the number before entering the loop

		while (countsFromTenToOne >= 1)
		{
			System.out.println(countsFromTenToOne + " is inside the loop"); // shows the number inside the loop when parameter is true

			countsFromTenToOne--;
		}

		System.out.println(countsFromTenToOne + " is after the loop"); // shows the number inside the loop when parameter is true

		System.out.println();

		System.out.println(countsFromNegativeTentoTen + " is before the loop"); // shows the number before entering the loop

		while (countsFromNegativeTentoTen <= 10)
		{
			System.out.println(countsFromNegativeTentoTen + " is inside the loop"); // shows the number inside the loop when parameter is true

			countsFromNegativeTentoTen++;
		}
		
		System.out.println(countsFromNegativeTentoTen + " is after the loop"); // shows the number inside the loop when parameter is true

		System.out.println();

		System.out.println(countsInStepsOfThrityTwo + " is before the loop"); // shows the number before entering the loop

		while (countsInStepsOfThrityTwo <= 251)
		{
			System.out.println(countsInStepsOfThrityTwo + " is inside the loop"); // shows the number inside the loop when parameter is true

			countsInStepsOfThrityTwo = countsInStepsOfThrityTwo + 32;
		}
		
		System.out.println(countsInStepsOfThrityTwo + " is after the loop"); // shows the number inside the loop when parameter is true

		System.out.println();

		System.out.println(countsInStepsOfSixtyFour + " is before the loop"); // shows the number before entering the loop

		while (countsInStepsOfSixtyFour >= -1001)
		{
			System.out.println(countsInStepsOfSixtyFour + " is inside the loop"); // shows the number inside the loop when parameter is true

			countsInStepsOfSixtyFour = countsInStepsOfSixtyFour - 64;
		}
		
		System.out.println(countsInStepsOfSixtyFour + " is after the loop"); // shows the number inside the loop when parameter is true

		System.out.println();
	}

	public void askForStudentName()
	{
		String enterName;

		do
		{
			enterName = JOptionPane.showInputDialog("Enter a student name:\nTo exit the program enter:\n\"No More Students\"");

			//JOptionPane.showMessageDialog(null, enterName + " has joined the class");
			displayOneStudentName(enterName + " just joined the class.");
			
		} while (!enterName.equalsIgnoreCase("No More Students"));

		JOptionPane.showMessageDialog(null, "End of Program");
	}
	
	public void displayOneStudentName(String userName)
	{
		JOptionPane.showMessageDialog(null, userName);
	}

	public void inputIntegersUntilMatchIsMade()
	{
		String tempString;
		int num1;
		
		do
		{
			tempString = JOptionPane.showInputDialog("Enter a number\nTo end input -99");
			num1 = Integer.parseInt(tempString);

			JOptionPane.showMessageDialog(null, "You input number " + num1);

		} while (num1 != -99);

		JOptionPane.showMessageDialog(null, "End of Program");
	}

	public void inputStringUntilMatchIsMade()
	{
		String num2;

		do
		{
			num2 = JOptionPane.showInputDialog("Enter a number\nTo end input -99");
			
			if (num2.equals("-99"))
			{
				break;
			}

			JOptionPane.showMessageDialog(null, "You input number " + num2);

		} while (!num2.equals("-99"));

		JOptionPane.showMessageDialog(null, "End of Program");
	}

	public void inputDoubleUntilMatchIsMade()
	{
		String tempDouble;
		Double num3;

		do
		{
			tempDouble = JOptionPane.showInputDialog("Enter a double:\nEnter -99.99 to end program");
			num3 = Double.parseDouble(tempDouble);
			
			if (num3.equals(-99.99))
			{
				break;
			}

			JOptionPane.showMessageDialog(null, "You input number " + num3);

		} while (num3 != -99.99);

		JOptionPane.showMessageDialog(null, "End of Program");
	}

	public void inputStringUntilSentinel()
	{
		String enterAString;

		do
		{
			enterAString = JOptionPane.showInputDialog("Enter a name:\n Input \"I am a silly duck\" to end");

			JOptionPane.showMessageDialog(null, "You entered " + enterAString);

			if (enterAString.equals("I am a silly duck"))

				break;

		} while (true);

		JOptionPane.showMessageDialog(null, "End of Program");
	}

	public void countingWithForLoops()
	{

		for (int countsFromOneToTen = 1; countsFromOneToTen <= 10; countsFromOneToTen++)
		{
			System.out.println(countsFromOneToTen);
		}

		System.out.println();

		for (int countsFromTenToOne = 10; countsFromTenToOne >= 1; countsFromTenToOne--)
		{
			System.out.println(countsFromTenToOne);
		}

		System.out.println();

		for (int countsFromNegativeTentoTen = -10; countsFromNegativeTentoTen <= 10; countsFromNegativeTentoTen++)
		{
			System.out.println(countsFromNegativeTentoTen);
		}

		System.out.println();

		for (int countsInStepsOfTwentyThree = -1001; countsInStepsOfTwentyThree <= 521; countsInStepsOfTwentyThree += 23)
		{
			System.out.println(countsInStepsOfTwentyThree);
		}

		System.out.println();

		for (int countsInStepsOfFourtySix = 523; countsInStepsOfFourtySix >= -1000; countsInStepsOfFourtySix -= 46)
		{
			System.out.println(countsInStepsOfFourtySix);
		}

	}

}
