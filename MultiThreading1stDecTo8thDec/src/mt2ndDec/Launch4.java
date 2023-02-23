package mt2ndDec;

//2ndDec recorded lecture 1st part --> practiced on 24thJan2023 from 06:00AM onwards

class MyThread3 extends Thread {
	public void run() {
		System.out.println("no arg method");
	}
}
public class Launch4 {

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		mt.start();
		mt.start();
		
		System.out.println("Main thread");

	}

}
