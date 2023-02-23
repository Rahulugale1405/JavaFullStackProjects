package allAboutStringPart2;

//7thNov recorded lecture 1st part from 01:20mins onwards --> Practiced on 03rdJan2023 from 07:45 PM onwards

import java.util.Scanner;

public class UpperToLowerAndLowerToUpperCase {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println(ch);
		ch = (char) (ch-32);
		System.out.println(ch);
		
		System.out.println("==========================1=============================");
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the word to convert into UpperCase");
		String s1 = scan1.nextLine();
		String s2 = "";
		
		for (int i=0; i<s1.length(); i++) {
			s2 = s2 + (char)(s1.charAt(i)-32);
		}
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("==========================2=============================");
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the word to convert into LowerCase");
		String s3 = scan2.nextLine();
		String s4 = "";
		
		for (int i=0; i<s3.length(); i++) {
			s4 = s4+(char)(s3.charAt(i)+32);
		}
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("==========================3=============================");
		
		String s5 = "rAhUlUgAlE";
		String s6 = "";
		
		for (int i=0; i<s5.length(); i++) {
			if (s5.charAt(i)>='a' && s5.charAt(i)<='z') {
				s6 = s6 + (char)(s5.charAt(i)-32);
			}
			else {
				s6 = s6 + (char)(s5.charAt(i)+32);
			}
		}
		System.out.println(s5);
		System.out.println(s6);
	}

}
