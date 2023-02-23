package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

//This program is written using Thread Chaining. No need to create refrences for Thread/Runnable

public class Launch5 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					System.out.println("Child Thread");
				}	
			}	
		}).start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread");
		}

	}

}
