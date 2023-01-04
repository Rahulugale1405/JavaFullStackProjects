package loops;

public class Launch13_HPatternEx2 {					//19thOct recorded lecture. Practiced on 22ndDec @10:39PM Onwards

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i=0; i<n; i++) {			// H pattern
			
			for (int j=0; j<n; j++) {
				
				if (j==0 || j==3*n/4 || i==n/2 && j<=3*n/4) {
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
