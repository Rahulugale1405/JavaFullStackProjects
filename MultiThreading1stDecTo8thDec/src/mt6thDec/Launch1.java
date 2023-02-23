package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

class MyThread extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("I am a sleeping thread :: " + i);
				Thread.sleep(3000);			//removing the sleep here will waste interrupted call
			}
		}
		catch(Exception ie) {
			System.out.println("I got interrupted");
		}
	}
}

public class Launch1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread mt = new MyThread();
		mt.start();
		mt.interrupt();									//this method is used for interruption of child thread
		System.out.println("end of main thread");

	}
}
