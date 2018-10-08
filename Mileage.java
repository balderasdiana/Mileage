/* 
Author: Diana Balderas
Submitted: 2018/23/08
*/

import java.util.Scanner;

public class Mileage
{
	public static void main(String[] args)
	{
		double miles; // Miles driven
		double gallons; // Gallons of gas used
		double mileage; // Miles per gallon used
		
		Scanner keyboard = new Scanner(System.in); // Scanner object to read input
		
		System.out.println("This will calculate your car's mileage.");
		System.out.print("How many miles have you driven: ");
		miles = keyboard.nextDouble(); // Get the user's miles 
		
		System.out.print("How many gallons of gas have you used: ");
		gallons = keyboard.nextDouble(); // Get the user's gallons of gas 
		
		mileage = miles / gallons; // mathematical calculation 
		
		System.out.println("Your car's mileage is: " + mileage);
	}
}
