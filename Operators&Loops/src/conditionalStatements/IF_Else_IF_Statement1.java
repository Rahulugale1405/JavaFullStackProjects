package conditionalStatements;		

public class IF_Else_IF_Statement1 {			// recorded lecture of 17thOct. Practicing on 20thDec

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;				// try using b = 10 or b = 20
		
		if (a>b) {
			System.out.println("Subtraction");
			System.out.println(a-b);
		}
		
		else if (a==b) {
			System.out.println("Addition");
			System.out.println(a+b);
		}
		
		else if (a<b) {
			System.out.println("a is greater");
		}
		
		else {
			System.out.println("b is greater");
		}

	}

}
