package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

//This program is written using inner class i.e in main method we have written inner class which is 
//inside Runnable Interface
public class Launch4 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i=1; i<=5; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for (int i=1; i<=5; i++) {
			System.out.println("Main Thread");
		}

	}

}
