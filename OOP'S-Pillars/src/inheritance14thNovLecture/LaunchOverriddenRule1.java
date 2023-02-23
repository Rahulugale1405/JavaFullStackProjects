package inheritance14thNovLecture;

//14thNov recorded lecture 1stPart from 01:17mins --> Practiced on 07thJan2023 06:51 PM onwards

class Demo1 {
	
	//here in below method public access modifier is not added. In Child class it is added
	void disp1() {
		System.out.println("Demo in Parent");
	}
	
	//here in below method public access modifier is added. In Child class, if it is removed then we can't
	//increase visibility
	public void disp2() {
		
	}
	
}

class Demo2 extends Demo1 {
	
	//here in below method, public access modifier added to increase the visibility
	public void disp1() {
		System.out.println("Demo in Child class");
	}
	
	//here in below method, if public access modifier is removed, then the visibility decreases
	public void disp2() {
		
	}
	
}
public class LaunchOverriddenRule1 {

	public static void main(String[] args) {
		
		Demo2 d = new Demo2();
		d.disp1();
		

	}

}
