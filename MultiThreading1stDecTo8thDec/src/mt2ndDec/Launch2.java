package mt2ndDec;

//2ndDec recorded lecture 1st part --> practiced on 24thJan2023 from 06:00AM onwards

class MyThread1 extends Thread {
	
	@Override
	public void start() {
		System.out.println("start method called");
	}
	@Override
	public void run() {
		System.out.println("No arg run method");
	}

}

public class Launch2 {

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		//since our class start() method is called so n new thread is created
		mt.start();

		//task for main thread. this is optional just for better understanding
		for(int i=0; i<=10; i++) {
			System.out.println("main method");
		}
	}

}
