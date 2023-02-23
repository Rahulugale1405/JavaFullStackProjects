package exceptionHandling28thNov;

import java.util.Scanner;

/*	Re-throwing an exception - throwing or propogating already handled exception object to the caller.
 * 	Statements or lines below "throw" will not be executed. To execute this, we use finally block
 */
class Alpha4 {
	
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

public class Launch5 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Main method");
			Alpha4 a = new Alpha4();
			a.alpha();
			}
			catch(ArithmeticException ae2) {
			System.out.println("Exception handled in main");
			}
	}

}
