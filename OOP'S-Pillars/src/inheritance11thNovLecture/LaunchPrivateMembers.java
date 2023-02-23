package inheritance11thNovLecture;

//11thNov recorded lecture 1stPart from 01:32 mins of video --> Practiced on 07thJan2023 from 10:48 52 onwards

class Parent11 {
	private String name;
	
	void disp1() {
		System.out.println("Parent ");
	}
	
}

class Child11 extends Parent11 {
	
	void disp2() {
		//name = "Rahul";
		
		//here above, remove // & it will show error because private is used in class Parent11
		//the purpose of inheritance is to give direct access to the data variables 
	}
	
}


public class LaunchPrivateMembers {

	public static void main(String[] args) {
		
		Child11 c = new Child11();
		c.disp1();

	}

}
