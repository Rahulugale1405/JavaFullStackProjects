package mt2ndDec;

//2nd part of recorded lecture --> watched on 24thJan2023 from 08:15AM onwards

class MyThread10 extends Thread {
	
	@Override
	public void run() {
		Thread.currentThread().setName("DevaRa");
		System.out.println("run() is executed by :: " + Thread.currentThread().getName());
		int[] a = new int[5];
		for(int i=1; i<=5; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class Launch6_6 {

	public static void main(String[] args) {
		
		//String name = Thread.currentThread().getName();
		//System.out.println("main() is executed by Thread :: " + name);
		
		MyThread10 mt = new MyThread10();
		mt.start();

		Thread.currentThread().setName("DevaRa");
		System.out.println("main() is executed by :: " + Thread.currentThread().getName());
		
		int a = 10/0;
	}

}
