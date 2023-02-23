package assignment2;

public class LaunchBubbleSortArray {

	public static void main(String[] args) {
		
		int[] ar = {2,5,9,1,7,3,8,4,6,10,15,20,16,11,19,12,18,13,17};
		
		for (int i=0; i<ar.length; i++) {
			
			for (int j = 1; j<ar.length-i; j++) {
				
				if (ar[j]<ar[j-1]) {
					
					int temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
					
				}
			}
		}
		
		for (int elem:ar) {
			System.out.print(elem + " ");
		}
	}

}
