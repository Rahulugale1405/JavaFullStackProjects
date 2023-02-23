package collection12thDec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

//12thDec2022 recorded lecture 2nd Part --> watched on 31stJan2023 from 06:30PM onwards

public class LaunchImportant2 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()==true) {
			Integer i = (Integer) it.next();
			System.out.println("TreeSet Collection is " + i);
		}
		
		System.out.println("===================1===================");
		
		System.out.println("Added LinkedList ");
		
		LinkedList ll = new LinkedList();
		ll.addAll(ts);
		System.out.println(ll);
		
		ListIterator litr = ll.listIterator(ll.size());
		System.out.println("Ordering TreeSet data in reverse:");
		while(litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		
	}

}
