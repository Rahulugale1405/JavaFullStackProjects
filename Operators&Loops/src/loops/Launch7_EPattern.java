package loops;

public class Launch7_EPattern {							//18thOct recorded lecture. Practiced on 21stDec Evening

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i=0; i<n; i++) {					// E pattern
			
			for (int j=0; j<n; j++) {
				
				if (i==0 || i==(n-1)/2 || i==n-1 || j==0) {
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
