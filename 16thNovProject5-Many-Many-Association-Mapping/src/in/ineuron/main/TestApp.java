package in.ineuron.main;

import in.ineuron.bean.Course;
import in.ineuron.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		
		Course c1 = new Course("A11", "Java", 1000);
		Course c2 = new Course("B11", "Python", 2000);
		Course c3 = new Course("C11", "BlockChain", 3000);
		
		Course[] course = new Course[3];
		course[0] = c1;
		course[1] = c2;
		course[2] = c3;
		
		Student s1 = new Student("IND10", "Sachin", "MI", course);
		Student s2 = new Student("IND7", "Dhoni", "CSK", course);
		Student s3 = new Student("IND18", "Kohli", "RCB", course);
		
		s1.getStudentDetials();
		s2.getStudentDetials();
		s3.getStudentDetials();
	}

}
