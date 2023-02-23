package arrays;
//1stNov Recording 1st part --> Practiced on 29thDec from 09:00AM onwards
import java.util.Arrays;

public class LaunchArrayDiffMethodsSortSearchETC {

	public static void main(String[] args) {
		
		int[] ar1 = new int [4];
		
		for (int elem:ar1) {
			System.out.print(elem + " ");
		}
		System.out.println();
		
		Arrays.fill(ar1, 5);
		for (int elem:ar1) {
			System.out.print(elem + " ");
		}
		
		
		
		System.out.println();
		System.out.println("==============================1===============================");
		
		
		int[] ar2 = {10,20,0,0,0,60,70};
		Arrays.fill(ar2, 2, 4, 30);
		for (int elem1:ar2) {
			System.out.print(elem1 + " ");
		}
		
		
		
		System.out.println();
		System.out.println("==============================2===============================");
		
		
		int[] ar3 = {11, 55, 20, 90, 88, 99, 100};
		Arrays.sort(ar3);
		for (int elem3:ar3) {
			System.out.print(elem3 + " ");
		}
		
		
		
		System.out.println();
		System.out.println("==============================3===============================");
		
		
		int[] ar4 = {10,20,30,40,50,60,70,80,90};
		int res = Arrays.binarySearch(ar4, 90);			//try giving -15 or 35 replacing 90
		System.out.println(res);
		
	}

}
