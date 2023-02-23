package wrapperClass_22ndNov;

//22ndNov recording 1st part ---> watched on 14thJan2023 from 03:00 PM onwards

public class Test2 {

	public static void main(String[] args) {
		
		Integer i = new Integer(130);			//primitive to -> Wrapper
		
		//result = minrange+(total-maxrange-1)
		
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
		System.out.println("==================1=====================");
		
		Character c = new Character('a');
		char c1 = c.charValue();
		System.out.println(c1);
		
		System.out.println("==================2=====================");

		Boolean b = new Boolean("true");
		boolean b1 = b.booleanValue();
		System.out.println(b1);
	}

}
