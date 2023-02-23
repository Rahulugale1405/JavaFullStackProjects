package mt7thDec;

// 07thDec recorded lecture 1st part --> watched on 27thJan from 07:35AM onwards

class Display {
	public void wish(String name) {
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

class MyThread extends Thread {
	Display d;
	String name;
	
	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch1 {

	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread mt1 = new MyThread(d, "yuvi ");
		MyThread mt2 = new MyThread(d, "dhoni ");
		mt1.start();
		mt2.start();
	}

}
