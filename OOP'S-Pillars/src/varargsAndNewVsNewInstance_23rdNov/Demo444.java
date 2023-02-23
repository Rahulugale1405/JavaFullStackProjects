package varargsAndNewVsNewInstance_23rdNov;

//23rdNov Recorded lecture 2ndPart ==> Watched on 15thJan2023 from 06:30PM 
//Autoboxing vs var-args method

public class Demo444 {

	public static void methodOne(Long l) {
		System.out.println("Long");
	}
	
	public static void main(String[] args) {
		
		int x=10;
		//methodOne(x);		//int ==> type casting ==> float, double, long
							//int ==> AutoBoxing ==> Integer
	}

}
