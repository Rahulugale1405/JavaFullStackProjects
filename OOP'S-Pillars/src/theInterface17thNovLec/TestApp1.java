package theInterface17thNovLec;

//17thNov Recorded lecture 2ndPart --> practiced on 11thJan2023 from 07:45 AM onwards

interface ISample{
	
	/*100% abstract class
	 * methods by default public & abstract
	 */
	void m1();
	void m2();
}

class SampleImp1 implements ISample {

	@Override
	public void m1() {
		System.out.println("Hey, implementation given for method m1");
	}
	
	
	/*If the below method is not implemented, then it will be by default abstract method.
	 * ---> public abstract void m2();
	 *Therefore, if the method is abstract, then the class should be abstract.
	 *
	 *Overridden rules: If the methods are overridden, then the methods in class should 
	 *have public access modifiers because if we don't have we decrease visibility
	 */
	
	@Override
	public void m2() {
		System.out.println("Hey, implementation given for method m2");
	}
	
}


public class TestApp1 {

	public static void main(String[] args) {
		
		ISample sample = new SampleImp1();			//loose coupling
		sample.m1();
		sample.m2();

	}

}
