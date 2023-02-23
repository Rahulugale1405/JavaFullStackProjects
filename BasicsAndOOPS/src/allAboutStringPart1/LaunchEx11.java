package allAboutStringPart1;

//3rdNove recorded lecture 1st part --> Practiced on 31stDec2022 from 01:49 PM onwards

public class LaunchEx11 {

	public static void main(String[] args) {
		
		String s1 = new String("sachin");
		String s2 = s1.concat("tendulkar");
		String s3 = s2.intern();
		String s4 = "sachintendulkar";
		System.out.println(s3==s4);
	}

}
