package methodOverloading;

//27thOct recording. Practiced on 26thDec 09AM onwards
//Method overloading/Early Binding/Compile Time Polymorphism

class CalculationEx1 {				
	
	int add (int a, int b) {
		return a+b;
	}
	
	int add (int a, int b, int c) {
		return a+b+c;	
	}
	
	float add (int a, float b) {
		return a+b;
	}
	
	float add (float a, float b) {
		return a+b;
	}
	
	float add (int a, float b, float c) {
		return a+b+c;
	}
	
	double add (int a, double b, double c) {
		return a+b+c;
	}
	
	double add (double a, double b, double c) {
		return a+b+c;
	}
	
}

// 27thOct recording. Practiced on 26thDec 09AM onwards
//Method overloading/Early Binding/Compile Time Polymorphism

public class LaunchEx1 {

	public static void main(String[] args) {
		
		CalculationEx1 res = new CalculationEx1();
		int a=10, b=30, c=20;
		float m=10.5f, n=20.5f, p=30.5f;
		double x=15.5d, y=25.5d, z=35.5;
		
		System.out.println("HELLO");
		System.out.println(a);
		System.out.println(res.add(a, b));
		System.out.println(res.add(m, n));
		System.out.println(res.add(a, b, c));
		System.out.println(res.add(x, y, z));
		System.out.println(res.add(a, y, z));
	}

}
