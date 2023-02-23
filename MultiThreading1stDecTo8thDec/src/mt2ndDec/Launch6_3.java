package mt2ndDec;

//2nd part of recorded lecture --> watched on 24thJan2023 from 08:15AM onwards

class MyThread7 extends Thread {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("run() is executed by :: " + name);
	}
}

public class Launch6_3 {

	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		System.out.println("main() is executed by Thread :: " + name);
		
		MyThread7 mt = new MyThread7();
		mt.start();
		Thread.currentThread().setName("DevaRa's Thread");
		System.out.println("Name of main thread is changed to :: " + Thread.currentThread().getName());

	}

}
