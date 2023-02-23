package mt2ndDec;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}	
}

public class Launch5 {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		//this line we will have 2 threads --> main thread & user defined thread
		for(int i=1; i<=10; i++) {
			System.out.println("main Thread");
		}

	}

}
