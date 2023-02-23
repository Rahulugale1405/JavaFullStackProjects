package staticKeywordUse;

//10thNov Recorded video 2ndPart from 01:45mins -> watched on 06thJan2023 from 10:00AM onwards
//This is the program to count the number of objects for one static variable

class Demo2 {
	
	int a;
	int b;
	
	//here it's static because memory will be allocated only once & same copy will be used for all the objects
	//therefore Static variables are also called as class variables
	static int count;
	
	
	//below is the purpose of non-static block / java block / instance initialization block
	//Non Static block below -> Whichever content is common inside the constructors, include those in the non-static method 
	//Here in the constructors below, "count++" is common
	{
		count++;
		System.out.println("Hello");
	}
	
	
	//Creating multiple constructors
	Demo2() {
		//count++;	
		this(100);
		System.out.println("First Constructor");
		
	}
	
	Demo2(int a) {
		System.out.println(a);
		this.a = a;
		//count++;
	}
	
	Demo2(int a, int b) {
		this.a = a;
		this.b = b;
		//count++;
	}
}
	

public class Launch4NonStaticBlock2 {

	public static void main(String[] args) {
		
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2(10,20);
		Demo2 d3 = new Demo2(10);
		
		System.out.println(Demo2.count);
	}

}
