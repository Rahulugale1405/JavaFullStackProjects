package loops;

public class Launch16_X_Box_N_PatternS {		//19thOct recorded lecture. Practiced on 23rdDec @10:00AM Onwards		

	public static void main(String[] args) {
		
		int n = 7;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if (i==j || i+j==n-1) {			//1st pattern is X. Also try using i==0; o/p is 7
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {			//2nd pattern is box.
				
				if (i==j || i+j==n-1 || i==0|| i==n-1 || j==0 || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			for (int j=0; j<n; j++) {			//3rd pattern is N
				
				if (i==j || j==0 || j==n-1) {
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
