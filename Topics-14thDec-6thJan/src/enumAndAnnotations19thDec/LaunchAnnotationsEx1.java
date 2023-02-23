package enumAndAnnotations19thDec;

//19thDec recorded lecture 1st Part --> watched on 06thFeb2023 from 07:13PM onwards

//@CricketPlayer
//class Virat {
//	
//	void display() {
//		
//	}
//}

/*	Annotations --> Annotation  --> Parent of all Annotations
 * 	Annotation is an additional info which we are embedding in our source code
 * 	Annotations --> Build-in / Custom / User-Defined
 * 	
 * 	Annotations we can apply to :-
 * 		1. Class
 * 		2. interface
 * 		3. method
 * 		4. fields (instance variables)
 * 		5. local variables
 * 		6. Constructors
 * 		7. Parameters
 * 		8. enums
 * 
 * 
 */

@FunctionalInterface
interface Trial {
	int getNum();
	//void disp();
}

class JavaLearning {
	public void display1() {
		System.out.println("Parent Display");
	}
}

class Focus extends JavaLearning {
	
	@Override
	public void display1() {
		System.out.println("Focus is Key");
	}
}

public class LaunchAnnotationsEx1 {

	public static void main(String[] args) {

		Trial t = ()-> {
			return 10;
		};
		
	}

}
