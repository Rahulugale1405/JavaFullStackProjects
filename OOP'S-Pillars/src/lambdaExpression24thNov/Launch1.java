package lambdaExpression24thNov;

// 24thNov recorded lecture 2nd Part from 01:56 mins --> watched on 17thJan2023 from 10:30 AM onwards

@FunctionalInterface
interface Demo1 {
	
	void disp(); 
	
}

public class Launch1 {

	public static void main(String[] args) {

							//this is lambda expression
		Demo1 d1 = () -> System.out.println("Hare Krishna");
		d1.disp();
	}

}
