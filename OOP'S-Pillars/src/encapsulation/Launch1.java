package encapsulation;

//8thNov recorded lecture from 01:40mins onwards --> Practiced on 04thJan2023 from 11:00 AM onwards

class Student1 {
	
	private int age;						//these are called instance variables/data modifiers/properties
	private String name;
	private String city;
	
	void setAge (int a) {
		age = a;
	}
	int getAge () {
		return age;
	}
	
	void setName (String s1) {
		name = s1;
	}
	String getName () {
		return name;
	}
	
	void setCity (String s2) {
		city = s2;
	}
	String getCity () {
		return city;
	}
	
}

public class Launch1 {

	public static void main(String[] args) {
		
		Student1 st = new Student1();
		
		st.setAge(26);
		int age = st.getAge();
		System.out.println(age);
		
		st.setName("Rahul");
		String name = st.getName();
		System.out.println(name);
		
		st.setCity("Nashik");
		String city = st.getCity();
		System.out.println(city);
	}

}
