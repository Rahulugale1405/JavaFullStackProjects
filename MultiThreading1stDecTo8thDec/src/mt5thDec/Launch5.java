package mt5thDec;

//05thDec recorded lecture 2nd Part --> practiced on 25thJan2023 from 08:15AM onwards

class MyThread5 extends Thread {
	 static Thread t;
	 
	 @Override
	 public void run() {
		try {
			t.join();							//child thread is waiting for main thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1; i<=5; i++) {
			System.out.println("Child Thread");
		}
		 
	 }
}
public class Launch5 {

	public static void main(String[] args) throws InterruptedException  {
		MyThread5.t = Thread.currentThread();
		MyThread5 mt = new MyThread5();
		mt.start();

		for(int i=1; i<=5; i++) {
			Thread.sleep(2000);
			System.out.println("main thread");
		}
	}

}
