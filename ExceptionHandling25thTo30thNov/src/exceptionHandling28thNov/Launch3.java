package exceptionHandling28thNov;

//25thNov recorded lecture 1st part --> watched on 19thJan2023 From 06:45AM onwards

/*	1. UncheckedException - not checked during the compile time by the compiler, directly it will occur at runtime 
 * 	   & the java developer has to identify the risky code
 * 	2. CheckedException - it will be checked by the compiler 
 */
public class Launch3 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Before sleeping");
		Thread.sleep(4000);
		System.out.println("After a nap");

	}

}
