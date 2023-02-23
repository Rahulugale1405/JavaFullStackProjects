package mapsAndInterface15thDec;

//15thDec recorded lecture 1st part --> practiced on 03rdFeb2023 from 01:15PM onwards

import java.util.*;

/*	Hashtable was a legacy call. It was from Java 1.0
 * 	It was added later into the Map interface
 * 	Hashtable(Java1.0) & HashMap(Java 1.2) are same
 * 
 * 	HashMap - all methods are non-synchronized so multithreading possible
 * 	Hashtable - all methods are synchronized so multithreading not possible
 * 
 * 	HashMap - Not safe
 * 	Hashtable - ThreadSsafe
 * 	
 * 	HashMap - high performance
 * 	Hashtable - low performance
 */

class INeuron {
	int i;
	
	public INeuron(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "INeuron [i=" + i + "]";
	}
	
	
}

public class Launch3Hashtable {

	public static void main(String[] args) {
		
		Hashtable hashtable1 = new Hashtable();
		hashtable1.put(20, "Deva");
		hashtable1.put(14, "Rahul");
		System.out.println(hashtable1);

		System.out.println("========================1=============================");
		
		Hashtable hashtable2 = new Hashtable();
		hashtable2.put(new INeuron(20), "Krishna");
		hashtable2.put(new INeuron(14), "Rama");
		hashtable2.put(new INeuron(1420), "Hanumana");
		System.out.println(hashtable2);
		
	}

}
