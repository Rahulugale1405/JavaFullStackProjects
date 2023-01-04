package conditionalStatements;

public class Nested_IF_Else_Statement2 {		// recorded lecture of 17thOct. Practicing on 20thDec

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20; 
		int c = 30;
		
		if (a<c) {					//try using "a>c" & see the result
			
			if (a<c) {
				System.out.println("a is the least = " + a);
			}
			else {
				System.out.println("c is the least = " + c);
			}
		}
		
		else if (b<c) {
			System.out.println("b is the least = " + b);
		}

		else {
			System.out.println("C is the biggest = " + c);
		}
	}

}
