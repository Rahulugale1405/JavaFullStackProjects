package loops;

public class Launch21_Filled_and_Diamond_PatternEx2 {	//19thOct recorded lecture. Practiced on 23rdDec @09:00PM Onwards

	public static void main(String[] args) {
		
		int n = 11;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
			
				if ((i==0) || (i==n-1) || (j==0) || 
						(j==n-1) || (i+j<=n/2) ||
						(j-i>=n/2) || (j==n-1 && i<=n/2) || 
						(i-j>=n/2) || (i+j>=n-1+n/2)) {				// 1st output using-> P1,P2,P3,P4 formulas to fill the area inside
					System.out.print("*");
				}
			else {
				System.out.print(" ");
			}
		}
			
			
			
			for (int j=0; j<n; j++) {
				
				if ((i==0) || (i==n-1) || (j==0) || 
						(j==n-1) || (i+j<=n/2) ||
						(j-i>=n/2) || (j==n-1 && i<=n/2) || 
						(i-j>=n/2) || (i+j>=n-1+n/2)) {				// 2nd output using-> P1,P2,P3,P4 formulas to fill the area inside
					System.out.print(" ");
				}
			else {
				System.out.print("*");
			}
		}
			
		
			
			for (int j=0; j<n; j++) {
				
				if ((i==0) || (i==n-1) || (j==0) || 
						(j==n-1) || (i+j<=n/2) ||
						(j-i>=n/2) || (j==n-1 && i<=n/2) || 
						(i-j>=n/2) || (i+j>=n-1+n/2)) {				// 3rd output using-> P1,P2,P3,P4 formulas to fill the area inside
					System.out.print("*");
				}
			else {
				System.out.print(" ");
			}
		}
			
		
			for (int j=0; j<n; j++) {				// 4th Output -> using only P1,P2,P3,P4
				
				if ((i+j==n/2) || (i-j==n/2) || (j-i==n/2) || (i+j==n-1+n/2)) { 
						 
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
