package autoboxingAndUnboxing22ndNov;

//22ndNov recording 2nd part from 02:05 mins onwards---> watched on 14thJan2023 from 06:00 PM onwards

public class Example1 {

	static Integer i1 = 10;						//AutoBoxing
	
	public static void main(String[] args) {
		
		int i2 = i1;							//AutoUnboxing
		m1(i2);
		
	}
	
		public static void m1(Integer i2) {		//AutoBoxing
			int k = i2;							//AutoBoxing
			System.out.println(k);
		}
		
}
