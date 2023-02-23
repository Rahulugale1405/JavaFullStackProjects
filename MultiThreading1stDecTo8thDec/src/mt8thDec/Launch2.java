package mt8thDec;

//8thDec Recorded lecture 1st Part --> watched on 29thJan2023 from 10:15AM onwards

class A1 {
	public synchronized void d1(B1 b) {
		System.out.println("Thread-1 starts execution of d1()");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException ie) {
			
		}
		System.out.println("Thread-1 trying to call b last() ");
		b.last();
	}
	public void last() {
		System.out.println("Inside A last() method");
	}
}

class B1 {
	public synchronized void d2(A1 a) {
		System.out.println("Thread-2 starts execution of d2()");
		try {
			Thread.sleep(5000); 
		} catch(InterruptedException ie) {
			
		}
		System.out.println("Thread-2 trying to call A last()");
		a.last();
	}
	public void last() {
		System.out.println("Inside B last() method");
	}
}
public class Launch2 extends Thread {
		
		A1 a = new A1();
		B1 b = new B1();
		
		public void m1() {
			this.start();
			a.d1(b);			//Executed by main thread
		}
		
		public void run() {
			b.d2(a);			//Executed by child thread
		}
		
		public static void main(String[] args) {
			Launch2 launch = new Launch2();
			launch.m1();
		}

}
