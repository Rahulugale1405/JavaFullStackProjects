package arrays;

import java.util.Scanner;

//1stNov Recording 1st part --> Practiced on 29thDec from 09:00AM onwards

public class LaunchBinarySearch1 {

	public static void main(String[] args) {
		
		int[] ar = {10,20,30,40,50,60,70,80,90};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Key to be searched");
		int key = scan.nextInt();
		
		int low = 0;
		int high = ar.length-1;
		
		while (low<=high) {
			int mid = (low+high)/2;
			
			if (key==ar[mid]) {
			System.out.println("Key " + key + " found at Index " + mid);
			break;
			}
			
			else if (key<ar[mid]) {
				high = mid-1;
			}
			
			else if (key>ar[mid]) {
				low = mid+1;
			}
		}
		
		if (low>high) {
			System.out.println("Key not found");
		}
	}

}
