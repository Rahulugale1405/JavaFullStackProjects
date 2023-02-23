package inheritance11thNovLecture;

//11thNov recorded lecture 1stPart from 01:40 mins of video --> Practiced on 07thJan2023 from 10:48 52 onwards

class Parent22 {
	
	private String name;
	
	Parent22() {
		System.out.println("Parent Constructor");
	}
	
	void disp1() {
		System.out.println("Parent ");
	}
	
}

class Child22 extends Parent22 {
	
	//Javac will include a default constructor
	
	// 		Child22() {
	//		super();				//here super() means calling parent class constructor
	//			}
	
	void disp2() {
	
	}
	
}
public class LaunchConstructorInInheritance1 {

	public static void main(String[] args) {
		
		Child22 c = new Child22();			//
		c.disp1();

	}

}
