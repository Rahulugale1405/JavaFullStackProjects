package collection12thDec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//12thDec2022 recorded lecture 2nd Part --> watched on 31stJan2023 from 12:50PM onwards

public class LaunchImportant {

	public static void main(String[] args) {
		
		ArrayList arraylist1 = new ArrayList();
		arraylist1.add(10);				//arraylist1.add(new Integer(10)); //auto boxing
		arraylist1.add(10.5);			//arraylist1.add(new Double(10.5)); //auto boxing
		arraylist1.add('c');			//arraylist1.add(new Character('c')); //auto boxing
		arraylist1.add(10.5f);			//arraylist1.add(new Float(10.5f)); //auto boxing
		System.out.println(arraylist1);
		
		System.out.println("=========================1============================");

		ArrayList arraylist2 = new ArrayList();
		arraylist2.add(10);
		arraylist2.add(20);
		arraylist2.add(30);
		arraylist2.add(40);
		arraylist2.add(50);
		System.out.println(arraylist2);
		
		System.out.println("=========================2============================");
		
		/*	Different ways to access data present within collection
		 * 	1. loop normal as shown below
		 */
		System.out.println(arraylist2.size());
		for(int i=0; i<arraylist2.size(); i++) {
			System.out.print(arraylist2.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("=========================3============================");
		
		
		/*	2. for loop as shown below
		 */
		
		for(Object obj:arraylist2) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
		System.out.println("=========================3============================");
		
		
		/*	3. Using Iterator as shown below
		 */
		
		Iterator itr1 = arraylist2.iterator();
		while(itr1.hasNext()) {
			// Integer i = (Integer) itr1.next();				//casting
			// Object obj1 = itr1.next();
			System.out.print(itr1.next() + " ");
		}
		
		System.out.println();
		System.out.println("=========================4============================");
		
		ListIterator litr = arraylist2.listIterator(arraylist2.size());
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		
	}

}
