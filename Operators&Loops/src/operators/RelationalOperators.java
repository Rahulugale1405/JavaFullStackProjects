package operators;				// recorded lecture of 17thOct. Practiced on 20thDec2022

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 14;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);			// "==" it is used to compare. It's a comparator operator
		System.out.println(a=b);			// "=" it is used for assigning RHS value to LHS side
		
		System.out.println("-------------------------1--------------------------");
		
		int c, d, e;
		e = d = c = 1420;
		System.out.println(d + " " + e);
		System.out.println(e);
		System.out.println(c + " " + d + " " + e);
		
		int x, y, z;
		z = y = x = 10 + 15;
		System.out.println(x + " " + y + " " + z);

		System.out.println("-------------------------2--------------------------");
		
		int abc = 5;
		abc = 10;
		System.out.println(abc);		// here variable can hold only one value at a time	
		
		System.out.println("-------------------------3--------------------------");
		
		int a1 = 2;
		a1+=10;
		System.out.println(a1);
		a1-=10;							// here now a will be "a1 = 12"
		System.out.println(a1);			// therefore a = 12 - 10 = 2
		a1*=10;
		System.out.println(a1);
		a1/=10;
		System.out.println(a1);
		a1%=10;
		System.out.println(a1);
		
		
	}

}
