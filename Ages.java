package wk4CodingProject;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ages 
{

	public static void main(String[] args) 
	{
			// Q1
				// implement an array of int with given values
				System.out.println("Q1:");
				int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
				
				// get the absolute value of the first age on the list and the last age on the list
				int difference = Math.abs( ages[0] - ages[ ages.length-1 ] );
				System.out.println("The difference between the first age on the list and the last is: " + difference);
				
				
				
				// implement a second array with 9 elements of type int
				int[] ages2 = { 5, 3, 2, 7, 4, 9, 11, 56, 44 };
				
				// get the difference in age between the first and last age on the list 
				// do not allow the result to be negative: use absolute
				difference = Math.abs( ages2[0] - ages2[ ages2.length-1 ] );
				System.out.println("The difference between the first age on the list and the last is: " + difference);
				
				// get the average age of the second array rounding off to 2 decimals
				double sum = 0;
				for ( double age : ages2 )
				{
					sum += age;
				}
				double average = sum / ( ages2.length );
				System.out.printf("The average age of the second array list is: %.2f \n" + "\n", average );
				 
			// Q2
				// implement a string array with the given values
				System.out.println("Q2:");
				String[] names = {"Sam", "Tommy", "Tim","Sally", "Buck", "Bob" };
				
				
				//  iterate through each name adding up the number of characters in each
				//  name and return the average length of the names in the array
				average = 0;
				for ( String name : names )
				{
					average += name.length();
				}
				average = average / ( names.length);
				System.out.printf("The average length of the names in this list is: %.2f \n", average );
				
				
				//  concatenate the array list of names together separated by a space
				String listOfNames = "";
				for ( String name : names )
				{
					listOfNames += (name + " " );
				}
				System.out.println(listOfNames + "\n" );
				
				
			// Q3 access the last element of an array by getting its length and subtracting 1
			// Q4 the first element in an array is at index [0]
				
			// Q5
				//  implement a new array of nameLengths of type integer
				//  using the above nameLengths array add the size of each name into the array nameLengths
				System.out.println("Q5:");
				List <Integer> nameLengths = new ArrayList<>();
				for ( String name : names )
				{
					nameLengths.add( name.length() );
				}
				System.out.println(nameLengths + "\n" );
				
			// Q6
				// Calculate the sum of all the elements in the nameLengths array
				// Unclear instructions; sounds like the length of each element in the array should be added up
				// ie:  5 = 1 element    22 = 2 elements.  Included in programming
				System.out.println("Q6: ");
				int sum2 = 0;
				int sum3 = 0;
				String size = "";
				
				for ( Integer length : nameLengths )
				{
					sum2 += length;
					size = Integer.toString(length);
					sum3 += size.length();
				}
			
				System.out.println("The sum of all the elements in the nameLengths array is: " + sum2 );
				System.out.println("The sum of the length of each element in nameLengths array is: " + sum3 + "\n" );
				
			// Q7
				// Method
				// Given a word and a number create a method that will print the word number amount of times(no spaces)
				System.out.println("Q7:");
				String word = "Daniel";
				   int    n = 8;
				String nameRun = concat(word, n);
				System.out.println(nameRun + "\n" );
				
			// Q8
				//  Method
				//  Create a method that, given two words, returns the words added together separated by a space
				System.out.println("Q8:");
				String firstName = "Daniel";
				String lastName  = "Jeffrey";		
				String fullName  = fullName( firstName, lastName );
				System.out.println(fullName + "\n" );
				
			// Q9
				// Method
				// Using the int array ages in Q1 create a method that returns TRUE if the sum of the elements are greater then 100
				System.out.println("Q9:");
				Boolean isGreater = isGreater(ages);
				System.out.println("The sum of the integer array ages is larger then 99: " + isGreater + "\n" );
				
			// Q10
				// Method Q10
				// Create an array of type double and pass it to a method returning the average of the array
				System.out.println("Q10:");
				List<Double> numbers = new ArrayList<>(Arrays.asList( 3.4, 4.2, 5.7, 13.2, 83.4567, 123.456, 88.3458175 ));
				double average2 = getAverage(numbers);
				System.out.printf("The average size of the elements in the array averageAge is: %.2f\n\n", average2);
				
			// Q11
				// Method Q11
				// Create another array of type double
				// Pass it and the double array in Q10 into a method returning True if
				// the average of the array numbers is larger the average of the array numbers2
				System.out.println("Q11: ");
				List<Double> numbers2 = new ArrayList<>(Arrays.asList( 3.4, 4.2, 5.7, 13.2, 83.4567, 123.456, 88.3458175));
				
				boolean result = getAverage( numbers, numbers2);
				System.out.println( result + "\n" );
				
				
			// Q12
				// Method 12
				// Create method willBuyDrink
				// Pass the boolean & double variables to the method and return 
				// True if it's hot outside and if you have more then $10.50
				System.out.println("Q12: ");
				boolean  isHotOutside = false;
				double  moneyInPocket = 15.36;
				boolean       result2 = willBuyDrink( isHotOutside, moneyInPocket );
				System.out.print("Will I buy a drink today? " + result2 + "\n\n" );
				
			// Q13
				// Method Q13
				// Given the task to create my own method I've chosen to create a random number
				// I'll achieve this by passing in a double number and randomizing it from a range
				// of 0 to 1000
				System.out.println("Q13: ");
				double num = 111254.668945;
				int randomNumber = getRandomNumber(num);
				
				System.out.println("I am generating an random integer from 0 to 1000: " + randomNumber);
				
			//  End of wk4 Coding assignment
				System.out.println("\n\n\nLots of fun but now its DONE......  :) ");
	}// Main 
	
					
			// Method Q13
					//  I've imported the method java.time.LocalTime so I can access the current time on the computer
					//  I will use the random access of the time and the pass in double number to generate a random-like value
					static int getRandomNumber(double num )
					{
						LocalTime now = LocalTime.now();
						double sum = 0;
						int hour = now.getHour();
						int  min = now.getSecond();
						int  sec = now.getSecond();
						//System.out.println(hour);
						//System.out.println(min);
						//System.out.println(sec);
						sum = (   (min*sec*8000/hour) % ( num * sec)) * num ;
						
						//  I've restricted the output to be no higher then 1000 by subtracting an amount
						//  from the sum if it exceeds 1000
						while ( sum > 1001 )
							{	sum -= 888;	}

						int result = (int)Math.round(sum);
						return result;
					}
	
	
	
	
			// Method Q12
					static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket )
					{
						if ( (isHotOutside == false) || (moneyInPocket < 10.50) )	{ return false; }						
						return true;
					}
	
	
			// Method Q11
					static boolean getAverage(List<Double> numbers, List<Double> numbers2 )
					{
						double avg = 0;
						double avg2 = 0;
						
						for ( Double number : numbers )		{	avg += number;	}
						for ( Double number : numbers2 )	{	avg2 += number;	}
						System.out.print("Is the average of the first array larger the the second? " );
						
						if ( avg == avg2 ) 
							{	System.out.print("\n" + "The average of the two array lists are equal. ");	}

						
						if ( avg > avg2 ) 
							{ 	return true;	}
							else 
								{	return false;	}
					}
	
					
			// Method Q10
					static double getAverage(List<Double> averageAge)
					{
						double sum = 0;
						for ( double age : averageAge )
							{	sum+= age;	}
						return ( sum/ averageAge.size() );
					}
	
	
			// Method Q9
					static Boolean isGreater(int[] ages )
					{
						int sum = 0;
						Boolean isGreater = false;
						
						for ( Integer age : ages )
							{	sum += age;	}
						if ( sum > 100 )
							{	isGreater = true;	}
						
						//System.out.println(sum);
						return isGreater;
					}
	
			// Method Q8
					static String fullName(String firstName, String lastName )
					{
						String fullName = ( firstName + " " + lastName ); 
						return fullName;
					}
	
					
			// Method Q7
					static String concat( String word, int n)
					{
							String newStr = "";
							for ( int i = 0; i < n; i++ )
								{	newStr += word;	}
							return newStr;
					}
						
					

						
						
			
	
}// Class
