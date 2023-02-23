package inheritance11thNovLecture;

//11thNov recorded lecture 2ndPart --> Practiced on 07thJan2023 from 01:04 PM onwards

class Parent123 {
	int a, b;
	
	//writing multiple constructors below
	
	Parent123() {
		a=10;
		b=20;
		System.out.println("Parent Constructor");
	}
	Parent123(int a, int b) {		//this constructor will not be executed because if it's not called in main method
		this.a = a;
		this.b = b;
		System.out.println("Parent Parameterized Constructor");
	}

}

class Child123 extends Parent123 {
	
	int x, y;
	
	//writing multiple constructors below
	
	Child123() {
		//super(); method is by default available. this method calls ParentClassConstructor
		//If this(); method is used instead of super(); method, then it calls same class constructor 
		//having two int values i.e below constructor having int x & int y. Try using as 
		//this(111,222); instead of super();
		
		this(111,222);
		//super();
		x=100;
		y=200;
	}
	Child123(int x, int y) {
		//super(); will be there for default. If this method is called explicitly and....
		// --> write super(x,y) & see values of a & b
		
		super(x,y);		//if we write this() method here, it will show error i.e recursion i.e it will go to above constructor again will come here
		this.x = x;
		this.y = y;
		System.out.println("===============");					//just added to see the results
	}
	
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}

public class LaunchConstrucutorInheritance2 {

	public static void main(String[] args) {
		
		Child123 ch = new Child123();
		ch.disp();
		
		Child123 c1 = new Child123(1000,2000);
		c1.disp();
		
		Parent123 p = new Parent123(1420,2014);
	}

}
