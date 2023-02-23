package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

//Complex Code

class Display1{
	public synchronized void wish(String name) {
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

class MyThread5 extends Thread {
	
	Display1 d;
	String name;
	
	MyThread5(Display1 d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch7 {

	public static void main(String[] args) throws InterruptedException {
		
		Display1 d = new Display1();
		MyThread5 mt1 = new MyThread5(d, "Hare Ram");
		MyThread5 mt2 = new MyThread5(d, "Jai SiyaRam - RadheKrishna");
		mt1.start();
		mt2.start();			//Don't comment these lines & see the output. There will be total 3 Threads

	}

}
