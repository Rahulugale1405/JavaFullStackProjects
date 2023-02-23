package encapsulation;

//9thNov recorded lecture 1st part --> Practiced on 05thJan2023 from 08:00 AM onwards

class Student3 {
	
	private int age;						//these are called instance variables/data modifiers/properties
	private String name;
	private String city;
	
	
	public int getAge() {					//shortcutForMethods --> rightClick -> Source -> generate getters & setters
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}

public class Launch3UsingTHISkeyword {

	public static void main(String[] args) {
		
		Student3 st = new Student3();
		
		st.setAge(26);
		System.out.println(st.getAge());			//Shadowing problem is overcome using this keyword
		
		st.setName("Rahul");
		System.out.println(st.getName());			//Shadowing problem is overcome using this keyword
		
		st.setCity("Nashik");
		System.out.println(st.getCity());			//Shadowing problem is overcome using this keyword

	}

}
