package staticKeywordUse;

//10thNov Recorded video 1stPart -> watched on 06thJan2023 from 08:00AM onwards

class Demo {
	
	static int a;											// these are static variables
	static int b;
	
	static {												// this is a static block
		System.out.println("Static Block");
		a=10;
		b=20;
	}	
	static void disp() {									// this is a static method
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	
	int x;													// these are Normal Instance variable
	int y;	
	
	{														// this is a non-static java block/initialization block
		x=14;
		y=1420;
		System.out.println("Non Static Java Block");
	}
	
	Demo() {								// this is a Constructor. It will 1st include the Non-Static java block
		System.out.println("Constructor");
	}
	void disp1() {											//this is normal or non-static method
		System.out.println("Non Static Method");
		System.out.println(x);
		System.out.println(y);
	}
}


public class Launch1StaticAllElements {

	public static void main(String[] args) {
		
		Demo.disp();									//hide this & see the result
		Demo d = new Demo();
		d.disp1();										//or hide this & see the result
		// d.disp1();

	}

}
