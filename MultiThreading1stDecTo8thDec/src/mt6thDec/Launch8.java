package mt6thDec;

//6thDec recorded lecture 2nd part --> practiced on 26thJan2023 from 01:56PM onwards

//Complex Code

class Display2{
	public synchronized void wish(String name) {		//remove synchronized & see the output
		for(int i=1; i<=5; i++) {
			System.out.print("Hare Krishna, ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				
			}
			System.out.println(name);
		}
	}
}

class MyThread6 extends Thread {
	
	Display2 d;
	String name;
	
	MyThread6(Display2 d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch8 {

	public static void main(String[] args) throws InterruptedException {
		
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread6 mt1 = new MyThread6(d1, "Hare Ram");
		MyThread6 mt2 = new MyThread6(d2, "Jai SiyaRam - RadheKrishna");
		mt1.start();
		mt2.start();			//Don't comment these lines & see the output. There will be total 3 Threads

	}

}
