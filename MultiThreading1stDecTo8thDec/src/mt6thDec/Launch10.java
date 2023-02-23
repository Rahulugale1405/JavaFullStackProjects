package mt6thDec;

//6thDec recorded lecture 2nd part --> practiced on 27thJan2023 from 06:35AM onwards

//Complex Code

class Display111 {
	public static synchronized void displayNumbers() {	//remove synchronized & see the output. Add synchronized or static synchronized
		for (int i=1; i<=10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
			}
		}
	}
	public synchronized void displayCharacters() {	//remove or add synchronized & see the output. Add synchronized or static synchronized
		for(int i=65; i<=75; i++) {
			System.out.print((char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
			}
		}
	}
}

class MyThread111 extends Thread {
	Display111 d;
	MyThread111(Display111 d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayNumbers();
	}
}

class MyThread222 extends Thread {
	Display111 d;
	MyThread222(Display111 d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayCharacters();
	}
}
public class Launch10 {

	public static void main(String[] args) throws InterruptedException {
		
		Integer x = 48;			//try giving int instead of Integer
		synchronized(x) {
			System.out.println(x);
		}
	}

}
