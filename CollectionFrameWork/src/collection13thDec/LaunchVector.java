package collection13thDec;

//13thDec recorded lecture 1st part --> watched on 01stFeb2023 from 06:45AM onwards

/*	Vector is a legacy class
 * 	Enumeration is used only if Vector class is used
 */

import java.util.*;
import java.util.Vector;

public class LaunchVector {

	public static void main(String[] args) {
		
		Vector vector = new Vector();
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		
		/*	Enumeration enum = vector.elements();
		 * 	while(enum.hasMoreElements()) {
		 * 		System.out.println(enum.nextElement());
		 * 	}
		 * 
		 * 
		 * 	here, 
		 * 	Enumeration works the same as Iterator
		 * 	elements() --> 
		 * 	hasMoreElements() --> hasNext();
		 * 	nextElement() --> next();
		 * 
		 */
		

	}

}
