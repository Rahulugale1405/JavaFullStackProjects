package arrays;

//2ndNov Recording 1st part --> Practiced on 30thDec from 11:00AM onwards

public class LaunchBubbleSortArray {		//This is also called Sinking sort or exchange sort

	public static void main(String[] args) {
		
		int[] a = {7,5,8,6,4,1,9,2};
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=1; j<a.length-i; j++) {
				
				if (a[j]<a[j-1]) {
					
					int tempVar = a[j];
					a[j] = a[j-1];
					a[j-1] = tempVar;
					
				}
			}
		}
		
		for (int elem:a) {
			System.out.print(elem + " ");
		}
	}

}
