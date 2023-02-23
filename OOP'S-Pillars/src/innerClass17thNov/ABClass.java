package innerClass17thNov;

//17thNov Recorded lecture --> practiced on 11thJan2023 from 06:00 AM onwards

public class ABClass {

	int num;
	
	// InnerClass1 ic1 = new InnerClass1();			//or object of inner classes can be created here 
	
	public void show () {
		System.out.println("In show " + num);
		
		InnerClass1 ic1 = new InnerClass1();			//or object of inner classes can be created here 
		ic1.config1();
	}
	
	class InnerClass1 {
		public void config1() {
			System.out.println("I'm in inner class 1 " + num);
		}
	}
	
	//ORR
	
	//If these InnerClass is static, then we can call it by creating object in a normal way in main method
	class InnerClass2 {
		public void config2( ) {
			System.out.println("I'm in inner class 2 ");
		}
	}
	
	public static void main(String[] args) {
		
		ABClass abc = new ABClass();
		abc.show();
		
		ABClass.InnerClass2 ic2 = abc.new InnerClass2();	//to create object of InnerClass2
		ic2.config2();
		
	
	
	}

}
