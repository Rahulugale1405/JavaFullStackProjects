package exceptionHandling25thNov;

import java.util.Scanner;

//25thNov Recorded lecture 1st part from 01:20mins - watched on 18thJan2023 from 06:45AM onwards

public class LaunchEx2 {

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
		}
		catch(Exception e) {
			System.out.println("You're trying to dividie by a value which is illogical");
		}
		System.out.println("Connection is terminated");

	}

}
