package encapsulation;

//8thNov recorded lecture from 01:40mins onwards --> Practiced on 04thJan2023 from 11:00 AM onwards

class Student2 {
	
	private int age;						//these are called instance variables/data modifiers/properties
	private String name;
	private String city;
	
	void setAge (int age) {
		age = age;
	}
	int getAge () {
		return age;
	}
	
	void setName (String name) {
		name = name;
	}
	String getName () {
		return name;
	}
	
	void setCity (String city) {
		city = city;
	}
	String getCity () {
		return city;
	}
	
}

public class Launch2 {

	public static void main(String[] args) {
		
		Student2 st = new Student2();
		
		st.setAge(26);
		System.out.println(st.getAge());			//this will show -> Shadowing problem -> See this in Launch1
		
		st.setName("Rahul");
		System.out.println(st.getName());			//this will show -> Shadowing problem -> See this in Launch1
		
		st.setCity("Nashik");
		System.out.println(st.getCity());			//this will show -> Shadowing problem -> See this in Launch1
	}

}
