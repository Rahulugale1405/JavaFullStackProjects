package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

//Complex Code

class Display{
	public void wish(String name) {
		for(int i=1; i<=5; i++) {
			System.out.print("Hare Krishna, ");
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException ie) {
				
			}
			System.out.println(name);
		}
	}
}

class MyThread4 extends Thread {
	
	Display d;
	String name;
	
	MyThread4(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}

public class Launch6 {

	public static void main(String[] args) throws InterruptedException {
		
		Display d = new Display();
		MyThread4 mt1 = new MyThread4(d, "Hare Ram");
		//MyThread4 mt2 = new MyThread4(d, "Jai SiyaRam - RadheKrishna");
		mt1.start();
		//mt2.start();			//Don't comment these lines & see the output. There will be total 3 Threads

	}

}
