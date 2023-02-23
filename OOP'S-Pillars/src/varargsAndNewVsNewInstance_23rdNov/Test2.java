package varargsAndNewVsNewInstance_23rdNov;

//23rdNov recording 1st part ---> watched on 15thJan2023 from 11:00 AM onwards

class Demo2 {
	
	public void add(int... x) {
		
		int total = 0;
		for(int ele:x) {
			total+=ele;
		}
		System.out.println("The sum is :: " + total);
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		d2.add();
		d2.add(10);
		d2.add(10,20);
		d2.add(10,20,30);
		d2.add(10,20,30,40);
		d2.add(10,20,30,40,50);

	}

}
