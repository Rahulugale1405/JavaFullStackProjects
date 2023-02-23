package arrays;

//1stNov Recording 1st part --> Practiced on 29thDec from 09:00AM onwards

import java.util.Scanner;

public class LaunchLinearSearch1 {

	public static void main(String[] args) {
		
		int[] ar = {10,105,14,90,99,100,54,45};
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Key");
		int key = scan.nextInt();
		
		for (int i=0; i<ar.length; i++) {
			
			if (key==ar[i]) {
				System.out.println("Key " + key + " found at Index " + i);
				flag=true;
				break;
			}
			
		}
		
		if (flag==false) {
			System.out.println("Key not found");
		}
		
	}

}
