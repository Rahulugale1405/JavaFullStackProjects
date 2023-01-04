package loops;

public class Launch19_Z_and_Q_Patterns {		//19thOct recorded lecture. Practiced on 23rdDec @09:00PM Onwards

	public static void main(String[] args) {
		
			int n = 9;
			
			for (int i=0; i<n; i++) {
				
				for (int j=0; j<n; j++) {
					
					if (i==0 || i==n-1 || i+j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
				for (int j=0; j<n; j++) {
					
					if ((i==n/4 && j>n/4 && j<3*n/4) || (i==3*n/4 && j>n/4 && j<3*n/4)||
						(j==n/4 && i>n/4 && i<3*n/4) || (j==3*n/4 && i>n/4 && i<3*n/4)||
						(i==j && i>n/2 && j>n/2)) {				// to print Q
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
