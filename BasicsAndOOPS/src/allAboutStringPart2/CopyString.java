package allAboutStringPart2;

//7thNov recorded lecture 1st part from 01:20mins onwards --> Practiced on 03rdJan2023 from 07:45 PM onwards

public class CopyString {

	public static void main(String[] args) {
		
		String s1 = "iNeuron";
		String s2 = "";
		
		for (int i=0; i<s1.length(); i++) {
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println("First String is: " + s1);
		System.out.println("Copy of first String is: " + s2);
		
		
		System.out.println("===========================1=========================");
		
		
		String s3 = "DevaRa";
		String s4 = "";
		
		for (int i=0; i<s3.length()-1; i++) {
			s4 = s4+s3.charAt(i);
		}
		
		System.out.println("First String is: " + s3);
		System.out.println("Copy of first String is: " + s4);
	}

}
