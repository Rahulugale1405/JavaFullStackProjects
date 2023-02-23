package mt1stDec;

// 1stDec recorded lecture 2nd part --> practiced on 23rdJan2023 from 08:25PM onwards

/*	class Thread { 
 * 		public void start() {				--> start() is called as Heart Of MultiThreading
 * 			1. Register the thread with ThreadScheduler
 * 			2. All other mandatory low level activities
 * 			3. invoke or call run() method
 * 	}
 * 		public void run() {
 * 			// no implementation
 * 	}
 * }
 */


class MyThread extends Thread {			
	
	@Override
	public void run() {								//run method is from Thread class
		//task for userdefined thread
		for(int i=0; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Launch1 {

	public static void main(String[] args) { 
		
		MyThread mt = new MyThread();
		mt.start();		//this line will execute a new thread which is responsible to execute run().
		
		// from here two threads are started & eagerly waiting for CPU time, Scheduling is done by T.S(Thread Scheduler)
		//task for main thread
		for(int i=0; i<=10; i++) {
			System.out.println("Main Thread");
		}

	}

}
// run this program multiple times & observe the output