package mt7thDec;

// 07thDec recorded lecture 1st part --> watched on 27thJan from 07:35AM onwards

class Display5 {
	public void wish(String name) {
		;;;;;;;;;;
		;;;;;;;;;
		;;;;;;;;;	//1lakh lines of code
		
		//this is class level lock so only thread can access this region as it is critical
		synchronized(Display.class) {
			System.out.println("Thread which is getting the lock is :: " + Thread.currentThread().getName());
			for(int i=1; i<=5; i++) {
				System.out.print("Good Morning:");
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

class MyThread5 extends Thread {
	Display5 d;
	String name;
	
	MyThread5(Display5 d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch5 {

	public static void main(String[] args) {
		
		Display5 d1 = new Display5();
		Display5 d2 = new Display5();
		
		MyThread5 mt1 = new MyThread5(d1, "yuvi");
		MyThread5 mt2 = new MyThread5(d2, "dhoni");		//make d1 here
		
		mt1.setName("Yuvi Thread");
		mt2.setName("Dhoni Thread");
		
		mt1.start();
		mt2.start();
	}

}
