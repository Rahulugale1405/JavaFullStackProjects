package collection13thDec;

import java.util.Iterator;
import java.util.LinkedList;

//13thDec recorded lecture 1st part --> watched on 01stFeb2023 from 06:45AM onwards

/*	Iterator is in every classes
 * 	ListIterator is in ArrayList & LinkedList
 * 	DescendingIterator is in 3 classes --> LinkedList, ArrayDeque, TreeSet
 */
public class LaunchImp1 {

	public static void main(String[] args) {
		
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.add(100);
		linkedlist1.add(200);
		linkedlist1.add(300);
		linkedlist1.add(400);
		System.out.println(linkedlist1);
		
		System.out.println("====================1====================");
		
		Iterator iterator = linkedlist1.descendingIterator();
		while(iterator.hasNext()) {
			//Integer integer = (Integer) iterator.next();			//downcasting or typecasting here
			System.out.print(iterator.next() + " ");
		}

	}

}
