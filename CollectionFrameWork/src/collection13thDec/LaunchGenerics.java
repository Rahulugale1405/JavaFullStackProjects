package collection13thDec;

//13thDec recorded lecture 2nd part from 01:30 mins --> watched on 01stFeb2023 from 12:17PM onwards
import java.util.*;

class Student{
	private int age;
	private int marks;
	private String name;
	
	public Student(int age, int marks, String name) {
		this.age = age;
		this.marks = marks;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
}

public class LaunchGenerics {

	public static void main(String[] args) {
		
		Student student1 = new Student(9,18,"Rahul");
		Student student2 = new Student(54,99,"Bhau");
		Student student3 = new Student(63,81,"Ugale");
		
		ArrayList<Student> arraylist1 = new ArrayList<Student>();
		arraylist1.add(student1);
		arraylist1.add(student2);
		arraylist1.add(student3);
		//arraylist1.add(100);								//added newly so error will occur
		//arraylist1.add("DEVA KRISHNA RAMA HANUMANA");		//added newly so error will occur
		
		System.out.println(arraylist1);

	}

}
