package loops;

public class Launch2 {				  //18thOct recorded lecture. Practiced on 21stDec from 04:58 PM onwards --> HomeOzar

	public static void main(String[] args) {
		
		int n = 9;
		for (int a=0; a<n; ++a) {					// for loop
			System.out.print("*");
		}
		
		System.out.println("");
		System.out.println("-----------------------------------1-------------------------------------------");
		
		int x = 5;
		int y = 0;
		
		while (y<x) {								// while loop
			System.out.print("*");
			y++;
		}
		
		System.out.println();
		System.out.println("-----------------------------------2-------------------------------------------");
		
		int c = 5;
		int d = 0;
		
		do {										// do while loop
			System.out.print("*");
			d++;
		}
		while (d<c);

	}

}
