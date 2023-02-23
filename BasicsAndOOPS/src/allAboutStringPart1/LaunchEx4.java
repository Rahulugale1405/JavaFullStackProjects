package allAboutStringPart1;

//2ndNove recorded lecture 2nd half --> Practiced on 30thDec2022 from 11:15PM here & 07:00PM in notebook

public class LaunchEx4 {

	public static void main(String[] args) {
	
		StringBuilder s1 = new StringBuilder("Sachin");
		StringBuilder s2 = new StringBuilder("Sachin");
		
		
		System.out.println(s1==s2);
		//here, StringBuffer class equals() compares reference (address of object) & not the content of StringBuilder
		System.out.println(s1.equals(s2));
	}

}
