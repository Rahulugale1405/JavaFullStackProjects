package allAboutStringsPart3;

import java.util.Arrays;

//8thNov recorded lecture 1st part --> Practiced on 04Jan2023 from 09:40 AM onwards

public class LaunchAnagramEx1 {

	public static void main(String[] args) {
		
		String s1 = "Race";
		String s2 = "carE";
		
		s1 = s1.toLowerCase();				//these two steps are optional
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("It's Anagram");
		}
		else {
			System.out.println("It's not Anagram");
		}
		
	}

}
