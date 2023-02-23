package mapsAndInterface15thDec;

//15thDec recorded lecture 1st part --> practiced on 03rdFeb2023 from 01:15PM onwards
interface Rahul {
	
	void learns();
	void practices();
	
	//adding default (which is a keyword & not access modifier), we can have implemented methods in an interface
	default void display1() {
		System.out.println("This is an implemented method in an interface");
		display3();
	}
	
	
	
	//adding static keyword. From Java 8, inside interface, we can have static methods
	static void display2() {
		System.out.println("Interface special method");
		display4();
	}
	
	
	
	/*	1. From Java9, private methods can be used in Interface
	 *  2. Private methods in interface can't be inherited in the implementing class
	 *  3. Private methods can't be accessed outside the interface
	 *  4. However, within interface, we can use the private methods
	 *  5. These private methods are used for internal purposes
	 *  6. Below method is accessed in display1() method
	 */	
	
	//below method can be accessed in display1() method
	private void display3() {
		System.out.println("Interface private method 1");
	}
	
	//below method can be accessed in display2() method
	private static void display4() {
		System.out.println("Interface private method 2");
	}
	
}

class Study implements Rahul {

	@Override
	public void learns() {
		System.out.println("Rahul learns Java everyday");	
	}

	@Override
	public void practices() {
		System.out.println("Rahul practices Java codes everyday");	
	}
	
	// commenting this to access display3() method in display1() method
//	@Override
//	public void display1() {
//		System.out.println("I can override it in implementing class");
//	}
	
}
public class LaunchInterface {

	public static void main(String[] args) {
		
		Study study = new Study();
		study.learns();
		study.practices();
		study.display1();
		
		// study.display2()
		/*	From Java8, static methods of interfaces will not get inherited in implementing classes(here - 
		 * 	study is implementing class. So this static methods can be called in using interface as shown below:
		 * 	Rahul.display2();
		 */
		
		Rahul.display2();
		
	}

}
