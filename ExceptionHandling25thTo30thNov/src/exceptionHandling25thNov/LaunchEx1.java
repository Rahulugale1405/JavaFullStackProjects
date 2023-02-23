package exceptionHandling25thNov;

import java.util.Scanner;

//25thNov Recorded lecture 1st part - watched on 18thJan2023 from 06:45AM onwards
/*	Exception is an unwanted event occurs at runtime which leads to abnormal/abrupt termination of our application
 * 	Handling Exception - Abnormal termination shouldn't happen
 * 	Keywords to use for exception handling: try, catch, throw, finally
 */


public class LaunchEx1 {

	public static void main(String[] args) {
		
		System.out.println("Connection to Clac app is established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to divide:");
		int num1 = scan.nextInt();
		System.out.println("Enter the number to divide:");
		int num2 = scan.nextInt();
		int result = num1/num2;
		System.out.println("The result is: " + result);
		System.out.println("Terminate the connection");

	}

}
