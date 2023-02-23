package arrays;

import java.util.Scanner;

public class LaunchEx2 {		//28thOct Rec. Practiced on 27thDec from 10:41AM onwards

	public static void main(String[] args) {
		
		// To store & display marks of 5 students
		
		int [] ar = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<ar.length; i++) {								// i<5 can be used instead of i<ar.lenght;
			System.out.println("Please enter marks of students " + i);
			ar[i]  =scan.nextInt();	
		}
		
		System.out.println("The marks of Students are as follows");
		
		for (int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
	}

}
