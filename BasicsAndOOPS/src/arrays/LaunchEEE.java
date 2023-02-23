package arrays;

//31stOct Recording 2nd part 02:00mins onwards--> Practiced on 28thDec from 07:30PM onwards

public class LaunchEEE {

	// print a program to find maximum & minimum values in an array
	
	public static void main(String[] args) {
		
		int[] ar1 = {10,40,90,54,81};
		int max = ar1[0];
		
		for (int i=0; i<ar1.length; i++) {
			if (ar1[i]>max) {
				max=ar1[i];
			}
		}
		System.out.println("The maximum value is " + max);
		

		System.out.println("--------------------------1--------------------------");
		
		
		int[] ar2 = {55, 9, 45, 7, 1};
		int min = ar2[0];
		
		for (int i=0; i<ar2.length; i++) {
			if (ar2[i]<min) {
				min=ar2[i];
			}
		}
		System.out.println("The minimum value is " + min);
	}

}
