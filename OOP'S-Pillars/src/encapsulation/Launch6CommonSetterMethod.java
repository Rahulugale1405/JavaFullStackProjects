package encapsulation;

//9thNov recorded lecture 1st part --> Practiced on 05thJan2023 from 08:00 AM onwards

class Student {
	
	private String name;
	private int age;
	private String city;
	
	public Student(String name, int age, String city) {	//here we have common setters for all variables
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


public class Launch6CommonSetterMethod {

	public static void main(String[] args) {
		
		Student s = new Student("Rahul", 26, "Nashik");
		
		System.out.println(s.getAge());
		System.out.println(s.getCity());
		System.out.println(s.getName());

	}

}
