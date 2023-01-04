package loops;

public class Launch5_HPatterneX1 {							 //18thOct recorded lecture. Practiced on 21stDec Evening

	public static void main(String[] args) {
		
		int n = 7;
		
		for (int i=0; i<n; i++) {			// H pattern
			
			for (int j=0; j<n; j++) {
				
				if (j==0 || j==n-1 || i==(n-1)/2) {
					
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
