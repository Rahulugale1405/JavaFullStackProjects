package varargsAndNewVsNewInstance_23rdNov;

//Widening vs Vr-args method

public class Demo222 {

	public static void methodOne(long l) {
		System.out.println("widening");
	}
	public static void methodOne(int... i) {
		System.out.println("var-args method");
	}
	
	public static void main(String[] args) {
		
		int x=10;
		methodOne(x);		//primitive ==> typeCasting ==> found ==> long(binding happens by compiler
	}

}
