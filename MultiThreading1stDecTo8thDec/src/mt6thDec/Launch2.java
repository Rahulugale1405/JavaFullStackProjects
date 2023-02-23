package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

class MyThread2 extends Thread {
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("I am a lazy thread");
		}
		System.out.println("Entering into sleeping state");
		try {
			Thread.sleep(3000);	
		}
		catch(Exception ie) {
			System.out.println("I got interrupted");
		}
	}
}

public class Launch2 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread2 mt = new MyThread2();
		mt.start();
		mt.interrupt();			//this means main thread is performing interruption for the child thread
		System.out.println("end of main thread");

	}
}
