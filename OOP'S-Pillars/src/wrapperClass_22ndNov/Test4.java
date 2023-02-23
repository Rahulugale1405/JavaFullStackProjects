package wrapperClass_22ndNov;

//22ndNov recording 1st part ---> watched on 14thJan2023 from 03:00 PM onwards

//Write a program to take inputs from command line & perform arithmetic operations
public class Test4 {

	public static void main(String[] args) {
		
		/*valueOf() ==>converts String/Primitive to Wrapper type
		  xxxValue() ==> converts Wrapper to Primitive type
		  parseXXX ==> converts String to Primitive type
		 */

		
		//commandLine arguments ==> String inputs = args[0], args[1]
		
		int i1 = Integer.parseInt(args[0]);
		int i2 = Integer.parseInt(args[1]);

		System.out.println(i1+i2);
		System.out.println(i1-i2);
		System.out.println(i1*i2);
		System.out.println(i1/i2);
		
		
	}

}
