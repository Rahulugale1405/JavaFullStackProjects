package varargsAndNewVsNewInstance_23rdNov;

//23rdNov Recorded lecture 2ndPart ==> Watched on 15thJan2023 from 06:30PM 
//Autoboxing vs var-args method

public class Demo333 {

	public static void methodOne(Integer i) {
		System.out.println("AutoBoxing");
	}
	public static void methodOne(int... i) {
		System.out.println("var-args method");
	}
	
	public static void main(String[] args) {
		
		int x=10;
		methodOne(x);		//int ==> Implicit type casting ==> float, double, long
							//int ==> AutoBoxing ==> Integer
	}

}
