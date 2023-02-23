package inheritance11thNovLecture;

//11thNov recorded lecture 1stPart from 44 mins of video --> Practiced on 07thJan2023 from 09:48 AM onwards
//This is PART 1 ---> is-A Relationship of inheritance

class Demo11 {							//this Parent Class is by default extending Object class
	String name = "Bhau";
	int age = 25;
	
	void disp() {
		System.out.println("Demo11 " + age + name);
	}
}

class Demo12 extends Demo11 {
	
	
}

class Demo13 extends Demo12 {
	
	
}
public class LaunchMultiLevelInheritance1 {

	public static void main(String[] args) {
		
		Demo13 d13 = new Demo13();
		d13.disp();
		
	}

}
