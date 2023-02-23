package mt7thDec;

// 07thDec recorded lecture 1st part --> watched on 27thJan from 07:35AM onwards

class Display4 {
	public void wish(String name) {
		;;;;;;;;;;
		;;;;;;;;;
		;;;;;;;;;	//1lakh lines of code
		
		synchronized(this) {		//this is object level lock
			System.out.println("Thread which is getting the lock is :: " + Thread.currentThread().getName());
			for(int i=1; i<=5; i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(2000);
				} catch(InterruptedException ie) {
				
				}
				System.out.println(name);
			}
		}
		System.out.println("Thread which is getting the lock is :: " + Thread.currentThread().getName());
	}
	;;;;;;;
	;;;;;;;
	;;;;;;; 	//1lakh lines of code
}

class MyThread4 extends Thread {
	Display4 d;
	String name;
	
	MyThread4(Display4 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch4 {

	public static void main(String[] args) {
		
		Display4 d1 = new Display4();
		Display4 d2 = new Display4();
		
		MyThread4 mt1 = new MyThread4(d1, "yuvi");
		MyThread4 mt2 = new MyThread4(d2, "dhoni");		//make d1 here
		
		mt1.setName("Yuvi Thread");
		mt2.setName("Dhoni Thread");
		
		mt1.start();
		mt2.start();
	}

}
