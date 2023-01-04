package loops;

public class Launch10_BPattern {				//19thOct recorded lecture. Practiced on 22ndDec @10:39PM Onwards

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) { 				//B pattern
				
				if ((j==0)|| (i==0 && j<n/2) || (i==n/2 && j>0 && j<n/2) || (i==n-1 && j<n/2) || 
						(j==n/2 && i!=0 && i!=n/2 && i!=n-1)) {
														// we can use n/2 or (n-1)/2
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
