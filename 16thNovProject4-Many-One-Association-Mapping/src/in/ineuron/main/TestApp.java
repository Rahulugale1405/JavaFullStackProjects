package in.ineuron.main;

import in.ineuron.bean.Branch;
import in.ineuron.bean.Student;

public class TestApp {

	public static void main(String[] args) {
		
		Branch branch = new Branch();
		branch.setBid("IND100");
		branch.setBname("Nashik");
		
		Student s1 = new Student();
		s1.setSid("10");
		s1.setSname("Sachin");
		s1.setSaddr("MI");
		s1.setBranch(branch);
		
		Student s2 = new Student();
		s2.setSid("18");
		s2.setSname("Kohli");
		s2.setSaddr("RCB");
		s2.setBranch(branch);

		Student s3 = new Student();
		s3.setSid("07");
		s3.setSname("Dhoni");
		s3.setSaddr("CSK");
		s3.setBranch(branch);
		
		System.out.println("Details of Students:: ");
		System.out.println("----------------------");
		System.out.println("ID :: " + s1.getSid());
		System.out.println("Name :: " + s1.getSname());
		System.out.println("Address :: " + s1.getSaddr());
		System.out.println("Branch ID :: " + s1.getBranch().getBid());
		System.out.println("Branch Name :: " + s1.getBranch().getBname());
		
		System.out.println("=======================1========================");
		
		System.out.println("Details of Students:: ");
		System.out.println("ID :: " + s2.getSid());
		System.out.println("Name :: " + s2.getSname());
		System.out.println("Address :: " + s2.getSaddr());
		System.out.println("Branch ID :: " + s2.getBranch().getBid());
		System.out.println("Branch Name :: " + s2.getBranch().getBname());
		
		System.out.println("=======================2========================");
		
		System.out.println("Details of Students:: ");
		System.out.println("ID :: " + s3.getSid());
		System.out.println("Name :: " + s3.getSname());
		System.out.println("Address :: " + s3.getSaddr());
		System.out.println("Branch ID :: " + s3.getBranch().getBid());
		System.out.println("Branch Name :: " + s3.getBranch().getBname());
	}

}
