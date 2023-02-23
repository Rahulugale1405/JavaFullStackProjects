package mt5thDec;

//05thDec recorded lecture 2nd Part --> practiced on 25thJan2023 from 08:15AM onwards

class MyThread4 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			System.out.println("Rama thread");
			try {
				Thread.sleep(2000);				//pause the execution for 2secs
			}
			catch(InterruptedException ie) {
				
			}
		}
	}
}

public class Launch4 {

	public static void main(String[] args) throws InterruptedException {	
		MyThread4 mt = new MyThread4();
		mt.start();
		mt.join();					//this will ask to "throws InterruptedException" in main method.
		// or mt.join(1000);		//mian thread is waiting for child thread
		// or mt.join(100,10);
		for(int i=1; i<=5; i++) {
			System.out.println("Sita thread");
		}

	}

}
