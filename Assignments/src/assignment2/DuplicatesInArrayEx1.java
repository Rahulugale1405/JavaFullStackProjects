package assignment2;

public class DuplicatesInArrayEx1 {

	public static void main(String[] args) {
		
		String[] arr = {"Java", "C++", "C", "Python", "C#", "Java", "C"};
		
		boolean flag=false;
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println("Dupluicates are " + arr[i]);
					flag=true;
				}

			}
		}
		
		if (flag==false) {
			System.out.println("Duplicate Elements are not found");
		}
	}

}
