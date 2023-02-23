package mt2ndDec;

//2nd part of recorded lecture --> watched on 24thJan2023 from 08:15AM onwards

class MyThread8 extends Thread {
	
	
}

public class Launch6_4 {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println("main() is executed by Thread :: " + name);
		
		MyThread8 mt = new MyThread8();
		
		System.out.println(10/0);

	}

}
