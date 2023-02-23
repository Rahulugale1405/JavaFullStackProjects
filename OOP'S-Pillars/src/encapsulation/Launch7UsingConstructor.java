package encapsulation;

//9thNov recorded lecture 1st part --> Practiced on 05thJan2023 from 08:00 AM onwards

class Student10 {
	
	private String name;
	private int age;
	private String city;
	
	//here constructor is a specialized method whose name is same as ClassName
	//Constructor doesn't have return type
	public Student10(String name, int age, String city) {	//here we have used constructor as method
		this.name = name;
		this.age = age;
		this.city = city;	
	}
	
	
	public String getName() {									//here using source, I added only getters
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
}


public class Launch7UsingConstructor {

	public static void main(String[] args) {
		
		//used constructor. While creating this object, constructor is initiated automatically
		Student10 s = new Student10("Rahul", 26, "Nashik");
		
		System.out.println(s.getCity());
		System.out.println(s.getName());
		System.out.println(s.getAge());

	}

}
