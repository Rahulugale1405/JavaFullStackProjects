package collection9thDec;

//09thDec recorded lecture 1st part --> watched on 30thJan2023 from 06:30AM onwards
/*	LinkedList follows doubly linked list data structure
 */

import java.util.*;

public class LaunchLinkedList1 {

	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(10);
		linkedlist.add("Krishna");
		linkedlist.add(1420);
		System.out.println(linkedlist);
		
		System.out.println("==========================1===========================");
		
		linkedlist.addFirst("Ram");
		System.out.println(linkedlist);
		
		System.out.println("==========================2===========================");
		
		linkedlist.add(2, "Hanuman");
		System.out.println(linkedlist);
		
		System.out.println("==========================3===========================");
		
		linkedlist.addLast("DevaRa");
		System.out.println(linkedlist);
		
		System.out.println("==========================4===========================");
		
		LinkedList link = new LinkedList();
		link.add(110101);
		link.add(2222);
		link.add(4444);
		link.add(33333);
		link.add(4444);
		
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.get(1));
		System.out.println(link.indexOf(4444));
		System.out.println(link.lastIndexOf(4444));
		link.offerFirst(9);			//or link.addFirst(9);
		link.offerLast(18);			//or link.addLast(18);
		link.addFirst(9);
		link.addLast(18);
		System.out.println(link);
		
		System.out.println("==========================5===========================");
		
		System.out.println(link.peekFirst());	//using this, first data ain't removed.
		System.out.println(link);
		System.out.println(link.pollFirst());	//using this, first data is removed. here 9 is removed from collection
		System.out.println(link);
		
		
		
		

	}

}
