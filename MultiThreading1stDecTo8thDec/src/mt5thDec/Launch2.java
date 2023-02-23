package mt5thDec;

//05thDec recorded lecture 1st Part --> practiced on 25thJan2023 from 06:50AM onwards

/*	public static final int MIN_PRIORITY = 1;
	public static final int NORM_PRIORITY = 5;
	public static final int MAX_PRIORITY = 10;
	
	More the priority, quickly T.S will allocate CPU time
*/

class MyThread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Priority of Child Thread is :: " + Thread.currentThread().getPriority());
		for(int i=1; i<=5; i++) {
			System.out.println("child thread");
		}
	}
}

public class Launch2 {

	public static void main(String[] args) {
		
		
		MyThread2 mt = new MyThread2();
		mt.setPriority(10);				//giving priority for child thread
		mt.start();
		// OR mt.setPriority(10);				//giving priority for child thread
		
		System.out.println("Priority of Main Thread is :: " + Thread.currentThread().getPriority());
		for(int i=1; i<=5; i++) {
			System.out.println("main thread");
		}

	}

}
