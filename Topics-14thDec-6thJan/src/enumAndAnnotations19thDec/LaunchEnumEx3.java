package enumAndAnnotations19thDec;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 03:57PM onwards

enum Course {
	JAVA, JEE, SPRINGBOOT, MICROSERVICES;
	
	int courseId;
	
	Course() {
		System.out.println("Constructor");
	}
	void setCourseId(int courseId) {		//setter method
		this.courseId = courseId;
	}
	int getCourseId() {						//getter method
		return courseId;
	}
}

public class LaunchEnumEx3 {

	public static void main(String[] args) {
		
		Course.JAVA.setCourseId(10);
		int cid = Course.JAVA.getCourseId();
		System.out.println(cid);
	}

}
