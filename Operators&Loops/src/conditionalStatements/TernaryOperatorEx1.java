package conditionalStatements;

public class TernaryOperatorEx1 {				//recorded lecture of 17thOct - the second half. Practicing on 21thDec morning

	public static void main(String[] args) {
		
		int a = 40;					//make a less than b
		int b = 20;
		
		int c = (a>b)? a : b ;
		System.out.println(c);
		
		System.out.println("-------------------1------------------");
		
		int x = 50;
		int y = 60;
		int z = 70;
		
		int res = (x<y) ? (x<z ? x:z) : (y<z ? y:z) ;					//try using (x.y) OR (x>z)
		System.out.println(res);
		
		System.out.println("-------------------2------------------");
		
		int num1 = 100;
		int num2 = 78; 
		int num3 = 56;
		
		int flag = (num1>num3) ? (num1>num3 ? num1:num3) : (num2<num3 ? num2:num3) ;	//also use (num1<num3)
		System.out.println(flag);

	}

}
