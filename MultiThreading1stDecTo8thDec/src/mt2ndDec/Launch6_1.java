package mt2ndDec;

//2nd part of recorded lecture --> watched on 24thJan2023 from 08:15AM onwards

class MyThread5 extends Thread {
	
}

public class Launch6_1 {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println("main() is executed by Thread :: " + name);
		
		MyThread5 mt = new MyThread5();
		System.out.println(mt);
		System.out.println("Name of Child Thread :: " + mt.getName());

	}

}
