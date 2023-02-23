package allAboutStringPart2;

//3rdNove recorded lecture 2nd part --> Practiced on 31stDec2022 from 05:00 PM onwards

public class Ex1LaunchCharMethod {

	public static void main(String[] args) {
		
		String s = new String("DevaRa");
		// System.out.println(s(3));			//exception will throw
	
		System.out.println(s.charAt(4));		//charAt method	

		System.out.println(s.charAt(-1));		//exception->StringIndexOutOfBoundException
		//OR
		System.out.println(s.charAt(500));		//exception->StringIndexOutOfBoundException
	}

}
