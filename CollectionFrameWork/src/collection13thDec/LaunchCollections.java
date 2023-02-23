package collection13thDec;

//13thDec recorded lecture 2nd part from 01:30 mins --> watched on 01stFeb2023 from 12:17PM onwards

import java.util.*;

public class LaunchCollections {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
		
		
		System.out.println("=====================================1=======================================");
		
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		
		
		System.out.println("=====================================2=======================================");
		
		
		
		/*	Collection is an interface which has other interfaces as well as classes
		 * 	Collections is a class
		 */
		Collections.sort(al);
		System.out.println(al);
		
		
		System.out.println("=====================================3=======================================");
		
		
		ArrayList<String> aa = new ArrayList<String>();
		//aa.add(28);
		aa.add("Krishna");
		aa.add("HANUMANA");
		aa.add("RAMA");
		//aa.add(1405);
		Collections.sort(aa);
		System.out.println(aa);

		
		System.out.println("=====================================4=======================================");
		
		
		ArrayList<Integer> aaa = new ArrayList<Integer>();
		aaa.add(1020);
		aaa.add(1405);
		//aaa.add("DevaRa");
		Collections.sort(aaa);
		System.out.println(aaa);
		
		
		System.out.println("=====================================5=======================================");
		
		
		//few more important inbuilt methods of Collections class
		
		ArrayList arrlist = new ArrayList();
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(50);
		int index = Collections.binarySearch(arrlist, 40); 		//binary search return type is int
		System.out.println("index of 40 is: " + index);
		
		Collections.shuffle(arrlist);
		System.out.println(arrlist);
		
		System.out.println(Collections.min(arrlist));
		System.out.println(Collections.max(arrlist));
		System.out.println(Collections.frequency(arrlist, 40));
		
		
		
		
	}

}
