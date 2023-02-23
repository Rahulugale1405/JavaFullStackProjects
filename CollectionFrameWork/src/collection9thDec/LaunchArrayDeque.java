package collection9thDec;

//09thDec recorded lecture 2nd part --> watched on 30thJan2023 from 05:45PM onwards

import java.util.ArrayDeque;

/*	In ArrayQeque index based data insertion or deletion is not allowed
 * 	It follows double end queue data structure
 * 	Insertion at front end & rear end is allowed
 * 	Duplicates are allowed
 * 	It implements Deque Interface
 * 	Order of insertion is maintained in ArrayDeque
 */

public class LaunchArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(10);
		ad.add(30);
		System.out.println(ad);
		
		System.out.println("===========================1==============================");
		ad.addFirst(5);
		ad.addLast(45);
		System.out.println(ad);
	}

}
