package allAboutStringPart1;

//2ndNove recorded lecture 2nd half --> Practiced on 30thDec2022 from 11:15PM here & 07:00PM in notebook

public class LaunchEx3 {

	public static void main(String[] args) {
		
		//here s1 & s2 are pointing to two different objects
		String s1 = "Sambhaji";
		String s2 = new String("Sambhaji");
		System.out.println(s1==s2);
		
		System.out.println("=========1=========");
		
		
		//here String class equals() method will compare the content present inside the String
		System.out.println(s1.contentEquals(s2));
		
	}

}
