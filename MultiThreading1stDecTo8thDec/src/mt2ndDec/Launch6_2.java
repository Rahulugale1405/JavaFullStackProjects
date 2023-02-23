package mt2ndDec;

//2nd part of recorded lecture --> watched on 24thJan2023 from 08:15AM onwards

class MyThread6 extends Thread {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("run() is executed by :: " + name);
	}
}

public class Launch6_2 {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println("main() is executed by Thread :: " + name);
		
		MyThread6 mt = new MyThread6();
		mt.start();

	}

}
