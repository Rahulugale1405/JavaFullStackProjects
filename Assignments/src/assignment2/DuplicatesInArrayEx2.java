package assignment2;

public class DuplicatesInArrayEx2 {

	public static void main(String[] args) {
		
		int[] dev = {10,20,30,40,90,99,98,99,20,10};
		boolean flag = false;
		
		for (int i=0; i<dev.length; i++) {
			
			for (int j=i+1; j<dev.length; j++) {
				
				if (dev[i]==dev[j]) {
					System.out.println("The duplicate numbers is:: " + dev[i]);
					flag=true;
				}
			}
		}
		
		if (flag==false) {
			System.out.println("No duplicate numbers are found");
		}
	}

}
