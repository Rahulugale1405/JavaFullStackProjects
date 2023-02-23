package methodOverloading;

// Can we overload main method? 

public class LaunchEx5 {

	public static void main(String[] args) {
		System.out.println("It's actual main method");
	}
	
	public static void main(int[] args) {
		System.out.println("accepting int args");
	}
	
	public static void main(double d) {
		System.out.println("double value");
	}
}
