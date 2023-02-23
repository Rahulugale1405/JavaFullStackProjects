package polyAndAbs15thNovLecture;

//15thNov recorded lecture 1stPart from 53mins --> Practiced on 08thJan2023 09:24 AM onwards
//Polymorphism explained in this code

//Notes:
//1. for child type objects, creating parent type reference is called UpCasting or loose coupling
//2. Parent reference converting to child type temporarily to access specialized method present 
//	 in the child class which is called down-casting.

class Parents {
	public void cry() {
		System.out.println("Parents crying");
	}
}

class Child111 extends Parents {
	public void cry() {
		System.out.println("Child111 crying");
	}
	public void eat() {
		System.out.println("Child111 eats less");
	}
}

class Child222 extends Parents {
	public void cry() {
		System.out.println("Child222 crying");
	}
	public void eat() {
		System.out.println("Child222 eats more");
	}
}
public class LaunchParentEx2 {

	public static void main(String[] args) {
		
		Parents p1 = new Child111();
		p1.cry();	
		
		//p1.eat();	
		//directly using parent type reference can't access specialized method of child class. To change the
		//behavior of parent class, we need to do down-casting as shown below:
		((Child111) p1).eat();
		
		
		Parents p2 = new Child222();
		p2.cry();
		
		//p2.eat();	
		//directly using parent type reference can't access specialized method of child class. To change the
		//behavior of parent class, we need to do down-casting as shown below:
		((Child222) p2).eat();
		
	}

}
