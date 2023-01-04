package conditionalStatements;

public class IF_Else_IF_Statement2 {			// recorded lecture of 17thOct. Practicing on 20thDec

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20; 
		int c = 30;
		
		if (a<b && a<c) {								//here try using --> (a<b ||& b==c)
			System.out.println("a is the least " + a);
		}

		else if (b<c) {
			System.out.println("b is the least + " + b);
		}
		
		else {
			System.out.println("c is the greatest " + c);
		}
	}

}
