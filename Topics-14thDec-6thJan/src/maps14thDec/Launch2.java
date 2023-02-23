package maps14thDec;

//14thDec recorded lecture 1st part --> practiced on 02ndFeb2023 from 07:30AM onwards

import java.util.*;
import java.util.Map.Entry;


class Student {
	private String name;
	private int age;
	private String city;
	
	
	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}


public class Launch2 {

	public static void main(String[] args) {
		Student student1 = new Student("Rahul", 27, "Nashik");
		Student student2 = new Student("Abhijeet", 28, "Nandurbar");
		Student student3 = new Student("Parimal", 26, "Bhusawal");

		HashMap hashmap = new HashMap();
		hashmap.put(12, student1);
		hashmap.put(23, student2);
		hashmap.put(34, student3);
		
		System.out.println(hashmap);
		
		System.out.println("==================1===================");
		
		Collection collect = hashmap.values();				//values() method return type is Collection
		Iterator iterator1 = collect.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		System.out.println("==================2===================");
		
		Set setKey1 = hashmap.keySet();						//keySet() method return type is Set
		Iterator iterator2 = setKey1.iterator();
		while(iterator2.hasNext()) {
			System.out.println("Key of Student is: " + iterator2.next());
		}
		
		System.out.println("==================3===================");
		
		Set setKey2 = hashmap.entrySet();									//entrySet() method return type is Set
		Iterator iterator3 = setKey2.iterator();
		while(iterator3.hasNext()) {
			Map.Entry data = (Entry) iterator3.next();						//type casting Entry
			System.out.println(data.getKey() + " : " + data.getValue() + " ");
		}
	}

}
