package varargsAndNewVsNewInstance_23rdNov;

class Demo4 {
	
	public void m1(int... x) {					//m1(int[] x) ==> default statement in switch
		System.out.println("Var-args method");
	}
	public void m1(int x) {
		System.out.println("int method");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Demo4 d4 = new Demo4();
		d4.m1();				//d4.m1(new int[]{};
		d4.m1(10,20);			//d4.m1(new int[]{10,20};
		d4.m1(10);				//this method specifically matches method with one argument

	}

}
