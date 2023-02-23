package exceptionHandling28thNov;

import java.util.Scanner;

//25thNov recorded lecture 1st part --> watched on 19thJan2023 From 06:45AM onwards

class Alpha {
	
	void alpha() {
		
		System.out.println("Connection to Calc app is established");
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

class Beta {
	
	void beta() {
		Alpha a = new Alpha();
		a.alpha();
	}
}
public class Launch1 {

	public static void main(String[] args) {
		
		try {	
		Beta b = new Beta();
		b.beta();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception finally handled in main");
		}
	}

}
