package localVariables;
//20th Oct recording --> practiced on 24th Dec eve
public class Ex1Student {

	public static void main(String[] args) {
		
		// below are local variables which are created inside the stack area
		int a = 14;
		int d = 20;
		int ad = a+d;
		
		System.out.println(ad);
		
		
		// //here default value is 0 only for instance variables.
		// local variables default values will not be given by JVM. Programmer should give the default value
		// If the programmer doesn't give default value to the localVar, then it results in Compile Time Error 
		
		// EX-->		int r;						
		//     			System.out.println(r);
	}

}
