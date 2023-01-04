package loops;

public class Launch18_Diff_PatternEx2 {		//19thOct recorded lecture. Practiced on 23rdDec @10:00AM Onwards

	public static void main(String[] args) {
		
		int n = 27;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
			
				if (i+j==n/2 || i-j==n/2 || j-i==n/2 || i+j==n+(n/2)-1 ||
					i==j || i+j==n-1 || i==0 || j==0 || i==n-1 || j==n-1) { 	// 4th Output from Launch17 along with i==0 || j==0 || i==n-1 || j==n-1				
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
