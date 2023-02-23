package exceptionHandling28thNov;

import java.util.Scanner;

class Alpha3 {
	
	void alpha() {				
		
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
		}
		System.out.println("Terminate the connection");
	}
	
}
public class Launch4 {
												
	public static void main(String[] args) {
		
		try {
		System.out.println("Main method");
		Alpha3 a = new Alpha3();
		a.alpha();
		}
		catch(ArithmeticException ae2) {
		System.out.println("Exception handled in main");
		}

	}

}
