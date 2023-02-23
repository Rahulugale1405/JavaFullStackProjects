package varargsAndNewVsNewInstance_23rdNov;

//23rdNov recording 1st part ---> watched on 15thJan2023 from 11:00 AM onwards

class Demo3 {
	
	public void add(String data, int... x) {
		System.out.println(data);
	}
}

public class Test3 {

	public static void main(String[] args) {
	
		Demo3 d3 = new Demo3();
		d3.add("Hare Krishna", 9);
		d3.add("DevaRa", 14, 20);
		d3.add("Rahul", 14, 05, 1996);

	}

}
