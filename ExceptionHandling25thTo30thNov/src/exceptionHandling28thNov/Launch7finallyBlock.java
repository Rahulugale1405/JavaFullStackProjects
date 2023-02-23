package exceptionHandling28thNov;

//28thNov recorded lecture 2nd part from 01:50mins ---> practiced on 19thJan2023 from 09:30PM onwards

/*	here in disp() method, if we write return statement, then below codes of return won't be executed.
 * 	to make this happen, we use finally block. & this block can't be used alone. try block is must
 */
class Demo {

	int disp() {
		try {
		System.out.println("Method started");
		return 10;			
		}	
		finally {
		System.out.println("Method ended");
		}
	}
}

public class Launch7finallyBlock {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.disp();

	}

}
