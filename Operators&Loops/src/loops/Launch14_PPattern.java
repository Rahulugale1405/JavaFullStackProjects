package loops;

public class Launch14_PPattern {		//19thOct recorded lecture. Practiced on 23rdDec @12:40AM Onwards

	public static void main(String[] args) {
		
		int n = 7;
		
		for (int i=0; i<n; i++) {				// P pattern
			
			for (int j=0; j<n; j++) {
				
				if ((j==0) || (i==0 && j<n/2) || (i==n/2 && j<n/2) || (j==n/2 && i>0 && i<n/2)) {
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
