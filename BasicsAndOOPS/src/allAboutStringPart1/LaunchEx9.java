package allAboutStringPart1;

//3rdNove recorded lecture 1st part --> Practiced on 31stDec2022 from 01:49 PM onwards

public class LaunchEx9 {
 
	public static void main (String[] args) {
		
		String s1 = new String ("you cannot change me!");
		String s2 = new String ("you cannot change me!");
		System.out.println(s1==s2);						//result-> false because two diff objects
		
		String s3 = "you cannot change me!";
		System.out.println(s1==s3);						//result-> false because two diff objects
		String s4 = "you cannot change me!";
		System.out.println(s3==s4);						//result-> True because they are pointing to only one objects
		
		String s5 = "you cannot " + "change me!";
		System.out.println(s3==s5);
		
		String s6 = "you cannot ";
		String s7 = s6 + "change me!";
		System.out.println(s3==s7);
		
		final String s8 = "you cannot ";
		String s9 = s8 + "change me!";
		System.out.println(s3==s9);
		System.out.println(s6==s8);
	
	}
}
