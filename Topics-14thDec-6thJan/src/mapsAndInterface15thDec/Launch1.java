package mapsAndInterface15thDec;

//15thDec recorded lecture 1st part --> practiced on 03rdFeb2023 from 08:00AM onwards

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


public class Launch1 {

	public static void main(String[] args) {
		
		Information info1 = new Information("Rahul", 27, "Ramrao", "Nashik");
		Information info2 = new Information("Vishal", 24, "Shamrao", "Pune");
		Information info3 = new Information("Kunal", 27, "Aashish", "Ozar");
		
		HashMap hashmap = new HashMap();
		hashmap.put(111, info1);
		hashmap.put(222, info2);
		hashmap.put(333, info3);
		
		System.out.println("Welcome to Passport details App");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the password number (password key):");
		Integer k = scan.nextInt();
		boolean flag = false;
		
		Set set1 = hashmap.entrySet();
		Iterator iterator1 = set1.iterator();
		
		while(iterator1.hasNext()) {
			Map.Entry passport = (Entry) iterator1.next();					//type casting
			Integer key = (Integer) passport.getKey();						//type casting
			if(k==key) {
			System.out.println( "Passport Info : " + passport.getValue());
			flag = true;
			}
		}
		
		if(flag==false) {
			System.out.println("Passport number not found");
		}
		
	}

}
