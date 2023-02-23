package arrays;

//31stOct Recording 1st part--> Practiced on 28thDec from 11:30AM onwards

public class LaunchC {

	public static void main(String[] args) {
		
		int [] ar = {10,20,30,40,50};
		
		for (int i=ar.length-1; i>=0; i--) {			// for loop. This is not possible in for-each loop
			System.out.print(ar[i] + " ");
		}

	}

}
