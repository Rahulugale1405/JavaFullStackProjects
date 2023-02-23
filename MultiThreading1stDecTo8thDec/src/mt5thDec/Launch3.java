package mt5thDec;

//05thDec recorded lecture 1st Part --> practiced on 25thJan2023 from 06:50AM onwards

/* yield() method --> It pauses current executing thread to give chance for waiting threads of same priority
*/

class MyThread3 extends Thread {
	
	@Override
	public void run() {
		
		for(int i=1; i<=5; i++) {
			Thread.yield();						// this can be written anywhere inside the method body
			System.out.println("child thread");
		}
	}
}

public class Launch3 {

	public static void main(String[] args) {	
		MyThread3 mt = new MyThread3();
		mt.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("main thread");
		}

	}

}
