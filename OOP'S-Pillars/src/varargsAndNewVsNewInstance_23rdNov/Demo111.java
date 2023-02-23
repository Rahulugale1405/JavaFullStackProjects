package varargsAndNewVsNewInstance_23rdNov;

//Widening vs AutoBoxing

public class Demo111 {

	public static void methodOne(long l) {
		System.out.println("widening");
	}
	public static void methodOne(Integer i) {
		System.out.println("autoboxing");
	}
	
	public static void main(String[] args) {
		
		int x=10;
		methodOne(x);		//primitive ==> typeCasting ==> found ==> long(binding happens by compiler
	}

}
