package mt7thDec;

//07thDec recorded lecture 1st part --> watched on 27thJan from 12:35AM onwards

class Thread1 extends Thread {
	int total =0;
	@Override
	public void run() {
		synchronized(this) {
			System.out.println("Child Thread started the calculation");		//step-2
			for(int i=1; i<=100; i++) {
				total+=i;
			}
			System.out.println("Child Thread giving notification call");	//step-3
			this.notify();
		}
	}
}
public class Launch6 {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t = new Thread1();
		t.start();
		synchronized(t) {
			System.out.println("Main Thread calling wait method");			//step-1
			t.wait();
			System.out.println("Main Thread got notification call");		//step-4
			System.out.println(t.total);
		}

	}

}
