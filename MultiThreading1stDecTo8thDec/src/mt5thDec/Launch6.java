package mt5thDec;

//05thDec recorded lecture 2nd Part --> practiced on 25thJan2023 from 09:35PM onwards

class MyThread6 extends Thread {
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
public class Launch6 {

	public static void main(String[] args) throws InterruptedException  {

		Thread.currentThread().join();	
		//no output will get because there will be an infinite wait which is called dead-lock & this is 
		//dangerous for MultiThreading
	}

}
