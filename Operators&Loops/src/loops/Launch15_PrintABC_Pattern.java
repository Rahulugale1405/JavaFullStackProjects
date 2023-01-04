package loops;

public class Launch15_PrintABC_Pattern {	//19thOct recorded lecture. Practiced on 23rdDec @10:00AM Onwards

	public static void main(String[] args) {
		
		int n=9;
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if ((j==0 && i>0) || (i==n/2 && j>0 && j<3*n/4) || 
					(i==0 && j>0 && j<3*n/4) || (j==3*n/4 && i>0)) {
						System.out.print("*");
						}
				else {
					System.out.print(" ");
				}			
			}
		
		
			
			for (int j=0; j<n; j++) {
				
				if ((i==0 && j>0 && j<3*n/4) || (i==n/2 && j>0 && j<3*n/4) || 
					(i==n-1 && j>0 && j<3*n/4) || (j==3*n/4 && i>0 && i!=n/2 && i!=n-1) || (j==0)) {
						System.out.print("*");
						}
				else {
					System.out.print(" ");
				}				
			}
			
			for (int j=0; j<n; j++) 
				
				if ((i==0 && j>0 && j<3*n/4) || (i==n-1 && j>0 && j<3*n/4) || (j==0 && i>0 && i<n-1)) {
						System.out.print("*");
						}
				else {
					System.out.print(" ");
				}
					
							
		System.out.println();
		}
	}
	
}
