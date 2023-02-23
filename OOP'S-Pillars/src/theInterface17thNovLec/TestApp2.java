package theInterface17thNovLec;

//17thNov Recorded lecture 2ndPart --> practiced on 11thJan2023 from 07:45 AM onwards

interface IISample{
	
	/*100% abstract class
	 * methods by default public & abstract
	 */
	void m1();
	void m2();
}

abstract class SSampleImpl implements IISample {

	public void m1() {
		System.out.println("Hey, implementation given for method m1");
	}
}
	
class SubSampleImpl extends SSampleImpl{
	
	public void m2() {
		System.out.println("Hey, implementation given for method m2");
	}
	
}


public class TestApp2 {

	public static void main(String[] args) {
		
		IISample sample = new SubSampleImpl();			//loose coupling
		sample.m1();
		sample.m2();

	}

}
