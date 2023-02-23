package methods;
//21stOct recording --> practiced on 24thDec from 10:30PM onwards

class Calculator2 {
	int res;
	void add (int a, int b) {
		 res = a+b;
		System.out.println(res);
	}
}

public class LaunchCalc2 {

	public static void main(String[] args) {
		
		Calculator2 calc2 = new Calculator2();
		calc2.add(10, 20);

	}

}
