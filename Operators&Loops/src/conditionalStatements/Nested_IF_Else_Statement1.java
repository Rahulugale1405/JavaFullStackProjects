package conditionalStatements;

public class Nested_IF_Else_Statement1 {		// recorded lecture of 17thOct. Practicing on 20thDec

	public static void main(String[] args) {
		
		int a = 10;				// try using a = 11
		int b = 2;
		
		if (a>b) {
			
			if (a==10) {
				System.out.print("Subtraction ");
				System.out.println(a-b);
			}
			
			else {
				System.out.println("A is greater than 10");
			}
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
