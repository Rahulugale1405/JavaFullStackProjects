package inheritance11thNovLecture;

//11thNov recorded lecture 1stPart from 01:12 mins of video --> Practiced on 07thJan2023 from 09:48 AM onwards

class Demo111 {
	String name = "Bhai-Bhai";
	int age = 25;
	
	void disp() {
		System.out.println("Demo111 " + age + name);
	}
	
}

class Demo112 extends Demo111 {
	
	
}

class Demo113 extends Demo112 {
	
	
}

class Demo114 extends Demo112 {
	//Demo114 can extend Demo112
}


public class LaunchHierarchy {

	public static void main(String[] args) {
		

	}

}
