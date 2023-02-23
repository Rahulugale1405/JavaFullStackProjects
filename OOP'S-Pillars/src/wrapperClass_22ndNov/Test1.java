package wrapperClass_22ndNov;

//22ndNov recording 1st part ---> watched on 14thJan2023 from 03:00 PM onwards

public class Test1 {

	public static void main(String[] args) {
		
		//ValueOf method
		Integer i1 = Integer.valueOf(10);
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf("10");
		System.out.println(i2);
		
		Boolean b1 = Boolean.valueOf("sachin");
		System.out.println(b1);
		
		/*
		Integer i3 = Integer.valueOf("ten");		this will throw NumberFormatException
		System.out.println(i3);					
		 */
		
		
		//Number System ==> base-2(binary), base-8(octal), base-10(decimal), base-16(hexadecimal)
		Integer i4 = Integer.valueOf("100",35);
		System.out.println(i4);
		System.out.println("MAX_RADIX = " + Character.MAX_RADIX);
		System.out.println("MIN_RADIX = " + Character.MIN_RADIX);
	}

}
