package exceptionHandling28thNov;

import java.util.Scanner;

//25thNov recorded lecture 1st part --> watched on 19thJan2023 From 06:45AM onwards

class Alpha1 {
	
	void alpha() throws ArithmeticException {
		
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

class Beta1 {
	
	void beta() throws ArithmeticException {
		Alpha1 a = new Alpha1();
		a.alpha();
	}
}
public class Launch2 {

	public static void main(String[] args) {
		
		try {	
		Beta1 b = new Beta1();
		b.beta();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception finally handled in main");
		}
	}

}
