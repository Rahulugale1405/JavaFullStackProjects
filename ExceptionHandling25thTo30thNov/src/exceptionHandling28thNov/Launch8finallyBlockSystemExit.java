package exceptionHandling28thNov;

//28thNov recorded lecture 2nd part from 01:50mins ---> practiced on 19thJan2023 from 09:30PM onwards

/*	System.exit() method is used to terminate the entire java program below it
 */
class Demo1 {

	void disp() {
		try {
		System.out.println("Method started");
		System.exit(0);			
		}	
		finally {
		System.out.println("Method ended");
		}
	}
}

public class Launch8finallyBlockSystemExit {

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.disp();

	}

}
