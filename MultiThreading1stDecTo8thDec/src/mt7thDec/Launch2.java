package mt7thDec;

// 07thDec recorded lecture 1st part --> watched on 27thJan from 07:35AM onwards

class Display2 {
	public void wish(String name) {
		System.out.println("Thread which is getting the lock is :: " + Thread.currentThread().getName());
		synchronized(this) {
			for(int i=1; i<=5; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(2000);
				} catch(InterruptedException ie) {
				
				}
				System.out.println(name);
			}
		}
	}
}

class MyThread2 extends Thread {
	Display2 d;
	String name;
	
	MyThread2(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch2 {

	public static void main(String[] args) {
		
		Display2 d = new Display2();
		
		MyThread2 mt1 = new MyThread2(d, "yuvi ");
		MyThread2 mt2 = new MyThread2(d, "dhoni ");
		
		mt1.setName("Yuvi Thread");
		mt2.setName("Dhoni Thread");
		
		mt1.start();
		mt2.start();
	}

}
