package varargsAndNewVsNewInstance_23rdNov;

//23rdNov recording 1st part ---> watched on 15thJan2023 from 11:00 AM onwards

class Demo1 {
	
	public void add(int... x) {
		System.out.println("Var-args approach");
		//System.out.println(x);					try printing this statement
		
		for(int ele:x) {
			System.out.println(ele);
		}
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		d1.add();
		d1.add(10);
		d1.add(10,20);
		d1.add(10,20,30);
		d1.add(10,20,30,40);
		d1.add(10,20,30,40,50);

	}

}
