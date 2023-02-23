package inheritance11thNovLecture;

//11thNov recorded lecture 1stPart from 44 mins of video --> Practiced on 07thJan2023 from 09:48 AM onwards
//This is PART 1 ---> is-A Relationship of inheritance

//Key points of Inheritance:----
//1. Single inheritance is allowed. That means one class can extend another class.

//2. Object class is parent of all classes.

//3. Multilevel inheritance is allowed.

//4. Parent class or Base class can have any number of child classes or sub classes.
// 	 This is called hierarchical inheritance which is allowed.

//5. Hybrid inheritance --> Mixture of Hierarchical & Multilevel inheritance.

//6. Multiple Inheritance is not allowed --> results in diamond shape problem / compile time ambiguity.

//7. Cyclic Inheritance is not allowed.

//8. Private members of a class doesn't participate in inheritance ---> to preserve Encapsulation.

//9. Constructor will not participate in Inheritance however parent class constructor will get called
//   because of super() method is present inside the child class



class Demo1 {
	
	String name = "DevaRa";
	int age = 26;
	
	void disp() {
		System.out.println("Demo1 " + age + name);
	}	
}

class Demo2 extends Demo1 {			//here code re usability is happening. i.e called Inheritance
	//Demo2 is taking properties so it's called subclass/child class/derived class
	//Demo1 is giving properties so it's called base class/parent class/super class/existing class
}


public class LaunchInheritanceAndKeyPoints {

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		d2.disp();
	}

}
