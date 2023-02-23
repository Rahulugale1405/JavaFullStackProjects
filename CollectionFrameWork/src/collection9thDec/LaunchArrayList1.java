package collection9thDec;
import java.util.*;

//09thDec recorded lecture 1st part --> watched on 30thJan2023 from 06:30AM onwards
/*	ArrayList follows Dynamic array data structure
 */

public class LaunchArrayList1 {

	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		//above is homogeneous type of data-
		System.out.println(al1);
		
		System.out.println("===================1===================");
		
		ArrayList al2 = new ArrayList();
		al2.add("DevaRa");
		al2.add(1420);
		al2.add('d');
		al2.add(99.99);
		al2.add(99.99);				//duplicates are allowed in ArrayList & LinkedList
		//above is heterogeneous type of data-
		System.out.println(al2);
				
		System.out.println("===================2===================");
		
		ArrayList al3 = new ArrayList();
		//here we can add entire collection into another collection
		al3.addAll(al2);
		System.out.println(al3);
		
		System.out.println("===================3===================");
		
		ArrayList al4 = new ArrayList();
		al4.add(11);
		al4.add(22);
		al4.add(33);
		al4.add(44);
		System.out.println("Existing data " + al4);
		
		al4.add(2, 28);
		System.out.println("After adding data in 2nd Index " + al4);
		
		al4.add(0, 5);
		System.out.println("After adding data in 0th Index " + al4);
		
		al4.add(55);
		System.out.println("After adding data in rear end " + al4);
		/*	here existing data is growing because it follows dynamic array data structure
		 * 	Size is growing  - we are able to add object in ArrayList at any given index
		 */
		
		al4.add(1, al2);
		System.out.println("After adding data of al2 in al4 " + al4);
		
		
		
		}

}