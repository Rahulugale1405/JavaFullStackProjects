package methodOverloading;

//27thOct recording. Practiced on 26thDec 09AM onwards

class Calculator2 {
	
	int add (int a, int b) {	//return type has no role to play. Only method name & parameters play role
		return a+b;
	}
	
	void add1 (int a, int b) {			// keep same method name. We get Error because method name can't be same
		int res = a+b;
		System.out.println(res);
	}
	
	float add (int a, int b, float c) {
		return a+b+c;
	}
}
public class LaunchEx2 {

	public static void main(String[] args) {
		
		Calculator2 calc2 = new Calculator2();
		calc2.add(10, 20);

	}

}
