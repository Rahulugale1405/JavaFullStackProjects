package enumAndAnnotations19thDec;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 03:57PM onwards

/*	EAST WEST NORTH SOUTH
 * 	MON TUE WED THUR FRI SAT SUN
 * 	JAN FEB MAR APR MAY JUN JUL AUG SEPT OCT NOV DEC
 * 	MALE FEMAL OTHERS
 * 	
 * 	Whenever we want to create data with similar constants like shown above, we write enum
 */

enum Result {
	//By below constants are static & final
	PASS, FAIL, NR;
	
	/*	Inside enum, we can have instance variables(fields or properties), methods, constructors
	 */
}

//enum Gender {
//	//here Gender is the data for below constants
//	MALE, FEMALE, OTHERS;
//}
//
//enum Compass {
//	EAST, WEST, NORTH, SOUTH;
//}
//
//class Demo {
//	final int PASS = 35;
//}

public class LaunchEnumEx1 {

	enum Gender {
	//here Gender is the data for below constants
	MALE, FEMALE, OTHERS;
	}
	
	public static void main(String[] args) {
		

	}

}
