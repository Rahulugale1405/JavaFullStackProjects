package allAboutStringsPart3;

//8thNov recorded lecture 1st part --> Practiced on 04Jan2023 from 09:40 AM onwards

public class LaunchPalindrome {

	public static void main(String[] args) {
		
		String s1 = "dad";							//use other words
		String s2 = "";
		
		for (int i=s1.length()-1; i>=0; i--) {
			s2 = s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		if (s1.equals(s2)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}

}
