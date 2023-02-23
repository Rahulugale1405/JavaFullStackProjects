package staticKeywordUse;

//10thNov Recorded video 2ndPart from 01:45mins -> watched on 06thJan2023 from 10:00AM onwards

public class Launch5StaticBlock {

	static int a;
	
	
	//this is called static block / initialization block
	 static {
		 a = 10;
		 System.out.println("Static Block 1");
	 }
	 
	 
	public static void main(String[] args) {
		
		System.out.println("This is the Main Method");

	}

}
