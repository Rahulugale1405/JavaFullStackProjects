package wrapperClass_22ndNov;

//22ndNov recording 1st part ---> watched on 14thJan2023 from 03:00 PM onwards


/*	String/Primitive to wrapper ===> valueOf()
 * 	Wrapper type to primitive ===> xxxValue()
 * 	String type to primitive ===> parseXXX()
 * 	Primitive type to String ===> toString(), toHexString(), toOctalString(), toBinaryString()
 * 	All these above methods are Static methods
 */


public class Test7 {

	public static void main(String[] args) {
		
		String result1 = Integer.toString(7,2);
		String result2 = Integer.toString(10,8);
		String result3 = Integer.toString(10,16);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println("================1===================");
		
		String s1 = Integer.toBinaryString(7);
		String s2 = Integer.toOctalString(10);
		String s3 = Integer.toHexString(10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
