package allAboutStringPart2;

//7thNov recorded lecture 2nd part from 02:05mins onwards --> Practiced on 03rdJan2023 from 09:40 PM onwards

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "iNeuron";
		String s2 = "";
		
		for (int i=s1.length()-1; i>=0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Original String: " + s1);
		System.out.println("String after reveresing: " + s2);
		
		
		System.out.println("==========================1===========================");
		
		
		String s3 = "ineuron java";
		String s4 = "";
		
		String[] arr = s3.split(" ");
		
		for (String elem:arr) {
			for (int i=elem.length()-1; i>=0; i--) {
				s4 = s4 + elem.charAt(i);
			}
			s4 = s4 + " ";
		}
		System.out.println(s4);
		
		
		System.out.println("==========================2===========================");
		
		
		String s5 = "Dev Krishna";				//remained-> to print -> anhsirK veD
		String s6 = "";
		
		String [] ar = s5.split(" ");
		
		for (String elem1:ar) {
			for (int i=elem1.length()-1; i>=0; i--) {
				s6 = s5 + elem1.charAt(i);
			}
			s6 = s6 + " ";
		}
		System.out.println(s6);
		
		
		
		
		/*for (int i=0; i<ar.length; i++) {
			String aa = ar[i];
			String ab = "";
			for (int j=aa.length()-1; j>=0; j--) {
				ab = ab + aa.charAt(j);
			}
			s6 = s6 + ab +" ";
		}
		System.out.println(s6);*/
		
		
		System.out.println("==========================3===========================");
		
		
		String s7 = "ineuron java";
		String s8 = "";
		
		String[] ar3 = s7.split(" ");
		
		for (int i=ar3.length-1; i>=0; i--) {
			s8 = s8+ar3[i]+" ";
		}
		System.out.println(s7);
		System.out.println(s8);
		
	}

}
