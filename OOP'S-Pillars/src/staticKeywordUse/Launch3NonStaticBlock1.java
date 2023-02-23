package staticKeywordUse;

//10thNov Recorded video 2ndPart from 01:45mins -> watched on 06thJan2023 from 10:00AM onwards
//This is the program to count the number of objects for one static variable
class Demo1 {
	
	int a;
	int b;
	
	//here it's static because memory will be allocated only once & same copy will be used for all the objects
	//therefore Static variables are also called as class variables
	static int count;
	
	
	Demo1() {
		count++;
	}
}
	

public class Launch3NonStaticBlock1 {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Demo1 d3 = new Demo1();
	}

}
