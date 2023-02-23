package mt7thDec;

// 07thDec recorded lecture 1st part --> watched on 27thJan from 07:35AM onwards

class Display3 {
	public void wish(String name) {
		;;;;;;;;;;
		;;;;;;;;;
		;;;;;;;;;	//1lakh lines of code
		
		synchronized(this) {
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
	}
	;;;;;;;
	;;;;;;;
	;;;;;;; 	//1lakh lines of code
}

class MyThread3 extends Thread {
	Display3 d;
	String name;
	
	MyThread3(Display3 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch3 {

	public static void main(String[] args) {
		
		Display3 d = new Display3();
		
		MyThread3 mt1 = new MyThread3(d, "yuvi ");
		MyThread3 mt2 = new MyThread3(d, "dhoni ");
		
		mt1.setName("Yuvi Thread");
		mt2.setName("Dhoni Thread");
		
		mt1.start();
		mt2.start();
	}

}
