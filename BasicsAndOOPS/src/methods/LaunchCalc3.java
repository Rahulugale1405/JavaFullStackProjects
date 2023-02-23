package methods;
//21stOct recording --> practiced on 24thDec from 10:30PM onwards

class Calculator3 {
	int a, b, res;
	int add() {				//here int data type used because (res) uses int data type
		a = 10;
		b = 20;
		res = a+b;
		return res;
	}
}


public class LaunchCalc3 {

	public static void main(String[] args) {
		
		Calculator3 calc3 = new Calculator3();
		int c = calc3.add();
		System.out.println(c);

	}

}
