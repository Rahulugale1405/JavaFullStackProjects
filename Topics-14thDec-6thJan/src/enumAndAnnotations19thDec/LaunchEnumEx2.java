package enumAndAnnotations19thDec;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 03:57PM onwards

/*	Whenever we create an enum, one internal class will be generated in heap area
 */

enum Results {
	PASS, FAIL, NR;
	
	Results() {						//here constructor can't be public. It will throw error
		System.out.println("Constructor is called");
	}
}
public class LaunchEnumEx2 {

	public static void main(String[] args) {
		
		Results result = Results.PASS;		//return type for Results.PASS is --> Result
		System.out.println(result);

		System.out.println("==============================1=================================");
		
		//here it can be PASS/FAIL/NR
		Results[] resultArray = Results.FAIL.values();		//return type for values() method is Results[]
		for(Results rahul:resultArray) {
			System.out.println(rahul.ordinal() + " : " + rahul.name());
		}
		
	}

}
