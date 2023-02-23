package maps14thDec;

//14thDec recorded lecture 2nd part --> practiced on 02ndFeb2023 from 10:22PM onwards
import java.util.*;
import java.util.Map.Entry;

class Information {
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	
	public Information(String name, int age, String fatherName, String city) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Information - [name=" + name + ", age=" + age + ", fatherName=" + 
				fatherName + ", city=" + city + "]";
	}
	
}

public class Launch3PassportEx {

	public static void main(String[] args) {
		
		Information info1 = new Information("Rahul", 27, "Ramrao", "Nashik");
		Information info2 = new Information("Vishal", 24, "Shamrao", "Pune");
		Information info3 = new Information("Kunal", 27, "Aashish", "Ozar");
		
		HashMap hashmap = new HashMap();
		hashmap.put("Maths@14", info1);
		hashmap.put("Physics@20", info2);
		hashmap.put("Bio@21", info3);
		
		Set set1 = hashmap.entrySet();
		Iterator iterator1 = set1.iterator();
		while(iterator1.hasNext()) {
			Map.Entry passport = (Entry) iterator1.next();					//type casting
			System.out.println("Passport Number - " + passport.getKey() + " : " + passport.getValue());
		}
		
	}

}
