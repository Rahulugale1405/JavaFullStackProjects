package mt6thDec;

//6thDec recorded lecture 1st part --> practiced on 26thJan2023 from 01:56PM onwards

//This code is written using lambda expression

public class Launch3 {

	public static void main(String[] args) {
		
		Runnable r = ()-> {												//Using lambda expression
							for(int i=1; i<=5; i++) {
								System.out.println("Child Thread");
							}
						};
						
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main Thread");
		}

	}

}
