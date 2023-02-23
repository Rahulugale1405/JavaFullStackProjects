package lambdaExpression24thNov;

// 24thNov recorded lecture 2nd Part from 01:56 mins --> watched on 17thJan2023 from 10:30 AM onwards

/*	Notes:
 * 	1. To use lambda expression we use lambda operator "->"
 * 	2. Lambda operator is divided into two parts to write lambda expression
 * 	3. to the left side of lambda operator, we write parameters required
 * 	4. To the right side, we right body or implementation
 * 	5. For left side parameters, data type is optional
 * 	6. For right side, if implementation or body has one statement then {} is optional
 * 	7. At left side, if parameter is single, then () & type of data both are optional
 * 	8. Right side body, if it is single line implementation, then return statement is also optional
 * 
 */

@FunctionalInterface
interface Demo2 {
	
	void add(int a, int b);
	
}

@FunctionalInterface
interface Demo3 {
	
	int subtract(int num1);
}

public class Launch2 {

	public static void main(String[] args) {

		Demo2 d2 = (a,b)->{
			int result1=a+b;
			System.out.println(result1);
		};
		d2.add(14, 20);
		
		
		Demo3 d3 = num1 -> num1-5;
		d3.subtract(20);
	}

}
