package mt2ndDec;

//2ndDec recorded lecture 1st part --> practiced on 24thJan2023 from 06:00AM onwards

class MyThread extends Thread {
	
	public void run() {
		System.out.println("No arg run method");
		// or run(5); ---> from main method
	}
	public void run(int i) {
		System.out.println("int arg run method");
	}
}

public class Launch1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//creating a new thread & starting a new thread which calls run() method
		mt.start();
		//explicitly making a call & executed by main thread
		mt.run(5);
		
		//task for main thread
		for(int i=0; i<=10; i++) {
			System.out.println("main method");
		}
	}

}
