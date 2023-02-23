package staticKeywordUse;

//10thNov Recorded video 1stPart -> watched on 06thJan2023 from 08:00AM onwards

public class Launch2StaticControlFlow {

	static int r;
	static int d;
	
	static {
		System.out.println("This is a Static Block");
		r=14;
		d=20;
	}
	
	static void disp1( ) {
		System.out.println("This is a Static Method1");
		System.out.println(r);
		System.out.println(d);
	}
	
	static void disp2() {
		System.out.println("This is a Static Method2");
		//disp1();													//enable this & see the results	
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is a Main Method");				//First execute this & see the result	
		
		Launch2StaticControlFlow.disp1();							//Second execute this & see the result
		// or disp();												// We can call static method in this way also
		
		disp2();
		
	}	

}
