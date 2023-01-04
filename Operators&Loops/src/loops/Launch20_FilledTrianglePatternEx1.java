package loops;

public class Launch20_FilledTrianglePatternEx1 {//19thOct recorded lecture. Practiced on 23rdDec @09:00PM Onwards

	public static void main(String[] args) {
		
		int n=19;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if (i==0 && j<n/2 ||  j==0 && i<n/2 || i+j==n/2) {  // 1st Output
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {
				
				if (i==0 && j<n/2 ||  j==0 && i<n/2 || i+j<=n/2) {	// 2nd output --> only changed --> i+j<=n/2
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {
				
				if ((i==0) || (j==0 && i<=n/2) || (i+j<=n/2) ||
					(j-i>=n/2) || (j==n-1 && i<=n/2)) {				// 3rd output using-> P1->i+j=n/2 & PN->j-i>=n/2 to fill the area inside
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