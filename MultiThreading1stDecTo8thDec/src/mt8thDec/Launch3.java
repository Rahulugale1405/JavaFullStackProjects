package mt8thDec;

//8thDec Recorded lecture 1st Part --> watched on 29thJan2023 from 10:15AM onwards

class A3 {
	public synchronized void d1(B3 b) {
		System.out.println("Thread-1 starts execution of d1()");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			
		}
		System.out.println("Thread-1 trying to call b last() ");
		b.last();
	}
	public synchronized void last() {								//if synchronized, it results in deadlock
		System.out.println("Inside A last() method");
	}
}

class B3 {
	public synchronized void d2(A3 a) {
		System.out.println("Thread-2 starts execution of d2()");
		try {
			Thread.sleep(5000); 
		} catch(InterruptedException ie) {
			
		}
		System.out.println("Thread-2 trying to call A last()");
		a.last();
	}
	public synchronized void last() {								//if synchronized, it results in deadlock
		System.out.println("Inside B last() method");
	}
}
public class Launch3 extends Thread {
		
		A3 a = new A3();
		B3 b = new B3();
		
		public void m1() {
			this.start();
			a.d1(b);			//Executed by main thread
		}
		
		public void run() {
			b.d2(a);			//Executed by child thread
		}
		
		public static void main(String[] args) {
			Launch3 launch = new Launch3();
			launch.m1();
		}

}
