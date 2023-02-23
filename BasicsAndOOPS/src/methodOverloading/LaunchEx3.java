package methodOverloading;

//Method overloading with Numeric type promotion. See main method. 10 is int data type & stored in float a in first method

class Calculator3 {
	
	float add (float a, int b) {
		return a+b;
	}
	
	float add (float a, int b, float c) {
		return a+b+c;
		
	}
	
}



public class LaunchEx3 {

	public static void main(String[] args) {
		
		Calculator3 calc3 = new Calculator3();
		System.out.println(calc3.add(10, 20));
	} 
	
}
