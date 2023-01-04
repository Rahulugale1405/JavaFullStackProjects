package loops;

public class Launch17_Diff_and_K_PatternEx1 {	//19thOct recorded lecture. Practiced on 23rdDec @10:00AM Onwards

	public static void main(String[] args) {
		
		int n = 11;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if (i+j==n/2 || i-j==n/2) { 		// For 1st Output. Also... to print K, add j==0
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		
			for (int j=0; j<n; j++) {
				
				if (i+j==n/2 || i-j==n/2 || j-i==n/2) { 		// For 2nd Output
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {
				
				if (i+j==n/2 || i-j==n/2 || j-i==n/2 || i+j==n+(n/2)-1) { 		// For 3rd Output
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {
				
				if (i+j==n/2 || i-j==n/2 || j-i==n/2 || i+j==n+(n/2)-1 || i==j || i+j==n-1) { 	// For 4th Output --> Mixing X Pattern & 3rd Output
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
