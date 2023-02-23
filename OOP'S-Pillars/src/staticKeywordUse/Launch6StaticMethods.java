package staticKeywordUse;

//10thNov Recorded video 2ndPart from 01:45mins -> watched on 06thJan2023 from 10:00AM onwards

class Bhau {
	
	static int a;
	
	//this is called static block / initialization block
	static {
	a = 10;
	System.out.println("this is called static block");
	}
	
	
	//this is a static method which is called directly by the className in the main method
	static void disp1() {
		System.out.println("Static display method for a-> " + a);
	}
	
}

public class Launch6StaticMethods {

	static void disp2() {
		System.out.println("Static display method 2");
		
	}
	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		disp2();
		Bhau.disp1();					//static method can be invoked using className also
		
		Bhau b = new Bhau();			//static method can be called using object reference variable also
		b.disp1();
	}

}
