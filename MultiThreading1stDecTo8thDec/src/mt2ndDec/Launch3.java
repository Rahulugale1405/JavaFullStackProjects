package mt2ndDec;

//2ndDec recorded lecture 1st part --> practiced on 24thJan2023 from 06:00AM onwards

class MyThread2 extends Thread {
	
	@Override
	public void start() {
		//new thread is created which will execute "no arg run method"
		super.start();
		System.out.println("start method called");
	}
	@Override
	public void run() {
		System.out.println("No arg run method");		//this is executed by user defined thread
	}

}

public class Launch3 {

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		//since our class start() method is called so n new thread is created
		mt.start();

		System.out.println("main method");
		
	}

}
