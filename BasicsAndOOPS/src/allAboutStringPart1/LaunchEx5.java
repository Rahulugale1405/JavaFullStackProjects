package allAboutStringPart1;

//2ndNove recorded lecture 2nd half --> Practiced on 30thDec2022 from 11:15PM here & 07:00PM in notebook

public class LaunchEx5 {

	public static void main(String[] args) {
		
		
		// here, String s1 = "Sachin" is using direct literal.
		// So, memory will be in SCM (String Constant Pool) & not in heap area 
		String s1 = new String("Sachin");
		
		
		// It has no reference so it is called Garbage Object. 
		// Even though it is a Garbage Object, Garbage Collector can't clean the data present in SCP
		String s2 = "Sachin";
		

	}

}
