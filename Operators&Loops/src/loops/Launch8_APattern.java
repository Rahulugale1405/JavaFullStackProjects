package loops;

public class Launch8_APattern {							//18thOct recorded lecture. Practiced on 21stDec Evening

	public static void main(String[] args) {
		
		int n = 7;
		
		for (int i=0; i<n; i++) {				// A pattern
			
			for (int j=0; j<n; j++) {
				
				if (i==0 || i==n/2 || j==0 || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		System.out.println();
		
		}

	}

}
