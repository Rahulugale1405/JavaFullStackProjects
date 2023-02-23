package methods;
// 21stOct recording --> practiced on 24thDec from 10:30PM onwards

class Calculator1 {
	
	int a, b, c;			// These are called instance variables/fields/properties	
	void add () {	
		a = 4;
		b = 5;
		c = a+b; 
		System.out.println(c);	
		}
 }

public class LaunchCalc1 {

	public static void main(String[] args) {
		
		Calculator1 calc= new Calculator1();
		calc.add();
	}

}
