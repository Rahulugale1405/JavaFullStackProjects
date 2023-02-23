package encapsulation;

//9thNov recorded lecture 1st part --> Practiced on 05thJan2023 from 08:00 AM onwards

class Student11 {
	
	private String name;
	private int age;
	private String city;
	
	public Student11 (String name, int age, String city) {
		
		//super(); --> this method is present by default in the constructor if not mentioned. super() method
		//invokes parent class/super class constructors & it should be always mentioned on the 1st line
		
		//this(); --> this method is not present by default in the constructor if not mentioned. this() method
		//invokes present class constructors i.e. Zero-Parameterized constructor &
		//it should be always mentioned on the 1st line
		
		//both super() & this() method cannot be mentioned at the same time or in the same line
		
		this();
		this.age = age;
		this.city = city;
		this.name = name;
	}
	
	public Student11 () {	//here two constructors with same name is called Constructor Overloading but they should have different parameters
		
		//name="Deva";
		this("Deva");			//this is called constructor chaining
		age=25;
		city="Netherlands";
	}
	
	public Student11 (String name) {
		this.name = name;
	}
		
	
	
	//here using source, I added only getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
}


public class Launch8UsingMultipleConstructor {

	public static void main(String[] args) {
		
		//Point1- no error here when constructor is called because JVM includes a default constructor
		//Point2 - error will throw if we pass any parameters in constructor because JVM will pass 0 parameters 
		//in default constructor & that is called Zero-Parameterized constructor. If we pass parameters, then 
		//it is called Parameterized constructor
		
		Student11 s11 = new Student11("Rahul", 26, "Nashik");
		System.out.println(s11.getCity());
		System.out.println(s11.getName());
		System.out.println(s11.getAge());
		
		Student11 s12 = new Student11();
		System.out.println(s12.getCity());
		System.out.println(s12.getName());
		System.out.println(s12.getAge());
		
	}

}
