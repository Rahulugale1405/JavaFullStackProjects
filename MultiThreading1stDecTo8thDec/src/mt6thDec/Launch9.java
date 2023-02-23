package mt6thDec;

//6thDec recorded lecture 2nd part --> practiced on 27thJan2023 from 06:35AM onwards

//Complex Code

class Display11 {
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

class MyThread11 extends Thread {
	Display11 d;
	MyThread11(Display11 d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayNumbers();
	}
}

class MyThread22 extends Thread {
	Display11 d;
	MyThread22(Display11 d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayCharacters();
	}
}
public class Launch9 {

	public static void main(String[] args) throws InterruptedException {
		
		Display11 d1 = new Display11();
		MyThread11 mt1 = new MyThread11(d1);
		MyThread22 mt2 = new MyThread22(d1);
		mt1.start();
		mt2.start();
	}

}
