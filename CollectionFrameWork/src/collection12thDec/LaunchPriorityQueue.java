package collection12thDec;

import java.util.PriorityQueue;

//12thDec2022 recorded lecture 1st Part --> watched on 31stJan2023 from 06:45AM onwards

/*	In PriorityQueue index based data insertion or deletion is not allowed
 * 	It follows min-heap data structure
 * 	Order of insertion is not maintained in PrioirtyQueue
 * 	Highest priority(here it is 50) element/object is automatically added at the beginning of the collection
 * 	Lowest priority(here it is 175) element/object is automatically added at the end of the collection
 */

public class LaunchPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(50);
		pq.add(150);
		pq.add(25);
		pq.add(75);
		pq.add(125);
		pq.add(175);
		System.out.println(pq);
		pq.add(25);
		System.out.println(pq);
		
	
		
		
		
		
		
		
		
	}

}
