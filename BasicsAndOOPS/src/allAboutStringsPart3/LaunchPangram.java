package allAboutStringsPart3;

public class LaunchPangram {

	public static void main(String[] args) {
		
		boolean flag = false;
		String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1 = s1.replace(" ", "");
		
		char[] ch1 = s1.toCharArray();
		
		int[] ar = new int[26];
		
		for (int i=0; i<ch1.length; i++) {
			int index = ch1[i]-65;
			ar[index]++;
			
			//OR
			//ar[ch1[i]-65]++;
		}
		
		for (int i=0; i<ar.length; i++) {
			
			if (ar[i]==0) {
				System.out.println("It's not a Pangram");
				flag = true;
			}
			
			if (flag==false) {
				System.out.println("It's a Pangram");
			}
		}

	}

}
