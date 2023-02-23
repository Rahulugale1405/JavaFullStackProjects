package exceptionHandling25thNov;

import java.util.Scanner;

//25thNov Recorded lecture 1st part from 01:55mins - watched on 18thJan2023 from 07:10 PM onwards

public class LaunchEx3 {

	public static void main(String[] args) {
		
		System.out.println("Connection to Clac app is established");
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to divide:");
		int num1 = scan.nextInt();
		System.out.println("Enter the number to divide:");
		int num2 = scan.nextInt();
		int result = num1/num2;
		System.out.println("The result is: " + result);
		
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the element to be inserted in the respective array");
		int elem = scan.nextInt();
		
		System.out.println("Enter the position at which element has to be inserted: ");
		int position = scan.nextInt();
		a[position] = elem;
		System.out.println("Element " + elem + " Inserted at " + position + " successfully");
		
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Please provide non-zero denominator");
		}
		catch(NegativeArraySizeException nase) {
			System.out.println("Please be positive");
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Be in your limits, don't cross");
		}
		catch(Exception e) {
			System.out.println("Wrong Input");
		}
		System.out.println("Connection is terminated");

	}

}
