package polyAndAbs15thNovLecture;

//15thNov recorded lecture 1stPart --> Practiced on 08thJan2023 08:31 AM onwards

class Parent1 {
	public void cry() {
		System.out.println("Parent Crying");
	}
	
}

class Child1 extends Parent1 {
	public void cry() {
		System.out.println("Child1 cries at low voice");
	}
	
}

class Child2 extends Parent1 {
	public void cry() {
		System.out.println("Child2 cries at high voice");
	}
	
}


public class LaunchParentEx1 {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();		//this is called tight coupling. Polymorphism can't be achieved in this case
		Child2 c2 = new Child2();
		c1.cry();
		c2.cry();
		
		System.out.println("==================1==================");
		
		Parent1 ref;
		ref=c1;
		ref.cry();			//other way to print same method. That's called Polymorphism
		ref=c2;
		ref.cry();
		
		System.out.println("==================2==================");
		
		Parent1 p1 = new Child1();	//this is called loose coupling. Polymorphism can be achieved in this case
		p1.cry();
		
	}

}
