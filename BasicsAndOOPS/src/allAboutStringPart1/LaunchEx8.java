package allAboutStringPart1;

//3rdNove recorded lecture 1st part --> Practiced on 31stDec2022 from 01:49 PM onwards

public class LaunchEx8 {

	public static void main(String[] args) {
		
		//Q-> Find out how many objects are created & how many are eligible for Garbage Collection?
		
		String s1 = new String ("sachin");
		s1.concat("tendulakar");
		s1+="IND";
		String s2=s1.concat("MI");
		System.out.println(s1);
		System.out.println(s2);
		
		
		//Total Objects: StackArea 4 + HeapArea 4 = 8
		// For Garbage Collector, there will be 2 objects. See the explanation in book
	}

}
