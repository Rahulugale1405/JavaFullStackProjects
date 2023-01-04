package conditionalStatements;

public class IF_Else_IF_Statement3 {				// recorded lecture of 17thOct. Practicing on 20thDec

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		if (a<b && a==b) {								// true && false
			System.out.println("a is the least " + a);
		}
		
		else if (b<c && b==c) {							// true && false
			System.out.println("b is the least " + b);
		}
		
		else if (c>a && c<b) {							// true && false
			System.out.println("How to finish");
		}
		
		else {											// true --> will be executed
			System.out.println("Let's finish the game");
		}

	}

}
