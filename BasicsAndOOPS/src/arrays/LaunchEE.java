package arrays;

//31stOct Recording 2nd part 02:00mins onwards--> Practiced on 28thDec from 07:30PM onwards

public class LaunchEE {

	public static void main(String[] args) {
		
		//print a program to get the sum of all elements in an array
		
		int[] ar = {10, 20, 30, 40};
		int sum = 0;
		
		for (int i=0; i<ar.length; i++) {
			sum=sum + ar[i];
			// sum+=ar[i];
		}
		System.out.println("The total is " + sum);
		
	}
}
