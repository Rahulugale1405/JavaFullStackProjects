package inheritance14thNovLecture;

//14thNov recorded lecture 2ndPart from 01:57mins --> Practiced on 07thJan2023 07:29 PM onwards

class Demo123 {
	void disp1() {
		System.out.println("Demo is Parent");
	}
	public void disp2() {
		
	}
	public int add() {
		return 10+2;
	}
	public int add(int a, int b) {
		return a+b;
	}
}

class Demo456 extends Demo123 {
	public void disp1() {
		
	}
	
	//This below method is by default present in child class because of inheritance
	//	public int add(int a, int b) {
	//		return a+b;
	//	}
	
	
	//below method is overridden & specialized method because of different parameters passed in 
	//parent & child class
	public int add(int a) {
		return a;
	}
	
}


public class LaunchOverriddenRule2And4 {

	public static void main(String[] args) {
		

	}

}
