package loops;

public class Launch3 {							 //18thOct recorded lecture. Practiced on 21stDec

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
		
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
	System.out.println("-------------also another way----------------");
		
		int a = 5; 
		
		for (int b=0; b<a; b++) {
			
			for (int c=0; c<a; c++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

}
