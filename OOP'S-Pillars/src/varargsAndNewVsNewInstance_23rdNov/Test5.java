package varargsAndNewVsNewInstance_23rdNov;

class Demo5 {
	public void m1(int[]... x) {
		
		System.out.println(x);
		
		for(int[] a:x) {
			
			System.out.println(a);			//[I@...
			
			for(int elem:a) {
				
				System.out.println(elem);
			}
		}
		System.out.println();
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		
		int[] x = {10,20,30};
		int[] y = {40,50};
		
		Demo5 d5 = new Demo5();
		d5.m1(x,y);
	}

}
