package allAboutStringPart1;

//3rdNove recorded lecture 1st part --> Practiced on 31stDec2022 from 01:49 PM onwards

public class LaunchEx10 {

	public static void main(String[] args) {
		
		String s1 = new String("sachin");
		String s2 = s1.intern();
		System.out.println(s1==s2);
		
		String s3 = "sachin";
		System.out.println(s2==s3);
	}

}
