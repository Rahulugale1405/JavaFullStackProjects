package encapsulation;

//8thNov recorded lecture from 01:40mins onwards --> Practiced on 04thJan2023 from 12:00 PM onwards

class Student4 {
	
	private int age;						//these are called instance variables/data modifiers/properties
	private String name;
	private String city;
	private boolean married;
	
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
	
	public void setMarried(String notMarried) {
		this.married = married;
	}
	public boolean ismarried() {				//this is getter. "is" recommended to use
		return married;
	
}
}
public class Launch4UsingBoolean {

	public static void main(String[] args) {
		
		Student4 st = new Student4();
		
		st.setAge(26);
		System.out.println(st.getAge());			//Shadowing problem is overcome using this keyword
		
		st.setName("Rahul");
		System.out.println(st.getName());			//Shadowing problem is overcome using this keyword
		
		st.setCity("Nashik");
		System.out.println(st.getCity());			//Shadowing problem is overcome using this keyword
		
		st.setMarried("I wanna get married");
		System.out.println(st.ismarried());
	}

}
