package mt5thDec;

//05thDec recorded lecture 1st Part --> practiced on 25thJan2023 from 06:50AM onwards

/*	public static final int MIN_PRIORITY = 1;
  	public static final int NORM_PRIORITY = 5;
 	public static final int MAX_PRIORITY = 10;
 	
 	More the priority, quickly T.S will allocate CPU time
 */
class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Priority of Child Thread is :: " + Thread.currentThread().getPriority());
	}
}

public class Launch1 {

	public static void main(String[] args) {
		
		System.out.println("Priority of Main Thread is :: " + Thread.currentThread().getPriority());
		MyThread mt = new MyThread();
		mt.setPriority(10);				//giving priority for child thread
		mt.start();

	}

}
