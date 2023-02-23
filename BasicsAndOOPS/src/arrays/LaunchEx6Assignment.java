package arrays;

import java.util.Scanner;			//28thOct Rec. Practiced on 27thDec from 07:00PM onwards

public class LaunchEx6Assignment {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] [] [] rahul = new int [3][][];  //Array declaration //this is 3D jagged array
		rahul [0] = new int [1][5];
		rahul [1] = new int [2][2];
		rahul [2] = new int [0][9];
		
		for (int i=0; i<rahul.length; i++) {
			
			for (int j=0; j<rahul[i].length; j++) {
				
				for (int k=0; k<rahul[i][j].length; k++) {
					
					System.out.println("Enter college " + i + " class " + j + " Stundet " + k);
					rahul[i][j][k] = scan.nextInt();
				}
			}
		}
		
		System.out.println("Marks scored are as below: ");
		
		
		for (int i=0; i<rahul.length; i++) {
			
			for (int j=0; j<rahul[i].length; j++) {
				
				for (int k=0; k<rahul[i][j].length; k++) {
					
					System.out.print(rahul[i][j][k] + " ");
				}
				System.out.println();
			}
			
		}

	}

}
