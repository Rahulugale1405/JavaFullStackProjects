package collection13thDec;

//13thDec recorded lecture 2nd part from 01:30 mins --> watched on 01stFeb2023 from 08:20AM onwards

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchConcurrentModification {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		arraylist.add(500);
		System.out.println(arraylist);
		
		System.out.println("==========================1===========================");
		
//		for(int i=0; i<arraylist.size(); i++) {
//			System.out.println(i);
//			arraylist.add(123);			//program will go into infinite loop because of dynamic arraylist structure
//		}
		
		
		
		//FailFast
		Iterator itr = arraylist.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
			//arraylist.add(123);						//this will throw exception
		}
		
		
		
		System.out.println();
		System.out.println("==========================2===========================");
		
		
		
		//FailSafe - when structural modification is done, concurrent modification exception is not shown
		CopyOnWriteArrayList copy = new CopyOnWriteArrayList();
		copy.add(1000);
		copy.add(2000);
		copy.add(3000);
		copy.add(4000);
		copy.add(5000);
		
		Iterator itrr = copy.iterator();
		while(itrr.hasNext()) {
			System.out.print(itrr.next() + " ");
			copy.add(1100);								//no exception. no infinite time loop
		}
		
	}

}
