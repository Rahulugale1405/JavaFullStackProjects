package in.ineuron.bean;

//16thNov recording 2nd part from 02:11 mins of video - watched on 09thJan2023 from 11:39PM onwards

//Target Object
public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	//HAS-A variable
	private Course[] course;

	//Constructor Injection
	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	
	public void getStudentDetials() {
		System.out.println("Student details are: ");
		System.out.println("Student ID is :: " + sid);
		System.out.println("Student name is :: " + sname);
		System.out.println("Student address is :: " + saddr);
		System.out.println("Course Details are: ");
		
		System.out.println("-------------------------");
		
		for (Course c: course) {
			System.out.println("Course ID is :: " + c.cid);
			System.out.println("Course name is :: " + c.cname);
			System.out.println("Course cost is :: " + c.ccost);
		}
		System.out.println("====================================");
	}
	
}
