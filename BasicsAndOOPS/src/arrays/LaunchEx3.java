package arrays;

import java.util.Scanner;

public class LaunchEx3 {		//28thOct Rec. Practiced on 27thDec from 11:25AM onwards

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][]ar = new int[3][4];			//Array declaration //this is 2D Regular array
		
		for (int i=0; i<ar.length; i++) {
			
			for (int j=0; j<ar[i].length; j++) {
				
				System.out.println("Enter marks of Class " + i + " Student " + j);
				ar[i][j] = scan.nextInt();			}
		}
		
		System.out.println("The marks of Students are: ");
		
		for (int i=0; i<ar.length; i++) {
			
			for (int j=0; j<ar[i].length; j++) {
				
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
