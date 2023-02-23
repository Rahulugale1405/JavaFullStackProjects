package arrays;

//31stOct Recording 1st part--> Practiced on 28thDec from 10:00AM onwards

public class LaunchB {

	public static void main(String[] args) {
		
		int [][] a = {{10,20}, {20,30,40}, {50,60,70,80}};		//2D Jagged Array
		
		for (int ar[]:a) {
			
			for (int elem:ar) {
				System.out.print(elem + " ");
				
			}
			System.out.println();
		}
	}

}
