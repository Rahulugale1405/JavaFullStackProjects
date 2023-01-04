package loops;

public class Launch6_TPattern {						//18thOct recorded lecture. Practiced on 21stDec Evening

	public static void main(String[] args) {
		
		int n = 5;
		
		for (int i=0; i<n; i++) {					// T pattern
			
			for (int j=0; j<n; j++) {
				
				if (i==0 || j==n/2) {				//here it can be j==(n-1)/2
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
