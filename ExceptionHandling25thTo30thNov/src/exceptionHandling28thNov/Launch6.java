package exceptionHandling28thNov;

import java.util.Scanner;

// 28thNov recorded lecture 2nd part from 01:50mins ---> practiced on 19thJan2023 from 09:30PM onwards

class Alpha5 {
	
	void alpha() throws ArithmeticException {	//if throws here, it's main methods responsibility to handle exception		
		
		System.out.println("Connection to Calc app is established");
		try {														//try removing try catch from alpha
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to divide:");
		int num1 = scan.nextInt();
		System.out.println("Enter the number to divide:");
		int num2 = scan.nextInt();
		int result = num1/num2;
		System.out.println("The result is: " + result);
		}
		catch(ArithmeticException ae1) {
		System.out.println("Exception handled in alpha only");
		throw ae1;												//throw is used to re-throw the exception
		}
		finally {
		System.out.println("Terminate the connection");
		}
	}
	
}

public class Launch6 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Main method");
			Alpha5 a = new Alpha5();
			a.alpha();
			}
			catch(ArithmeticException ae2) {
				System.out.println(ae2.getMessage());
				//ae2.toString();
				//ae2.printStackTrace();
			System.out.println("Exception handled in main");
			}
	}

}
