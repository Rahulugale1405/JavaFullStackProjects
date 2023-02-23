package allAboutStringPart1;
//2ndNove recorded lecture 2nd half --> Practiced on 30thDec2022 from 11:15PM here & 07:00PM in notebook
public class LaunchEx2 {

	public static void main(String[] args) {
		
		String s1 = "sachin";
		s1.concat("tendulkar");									//this is immutable or not changeable string
		System.out.println(s1);
		
		System.out.println("================1================");
		
		StringBuilder s2 = new StringBuilder("Sachin");			//this is mutable or changeable string
		s2.append("Tendulkar");
		System.out.println(s2);

	}

}
