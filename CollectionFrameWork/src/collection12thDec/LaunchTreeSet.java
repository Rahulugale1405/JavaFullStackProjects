package collection12thDec;

import java.util.TreeSet;

//12thDec2022 recorded lecture 1st Part --> watched on 31stJan2023 from 06:45AM onwards
/*	Data in TreeSet is in Ascending sorted order
 * 	Index based ordering 
 * 	In TreeSet, index based data insertion or deletion is not allowed
 */
public class LaunchTreeSet {

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
		
		System.out.println("============================1===========================");
		
		System.out.println(ts.ceiling(50));
		System.out.println(ts.higher(50));
		System.out.println(ts.floor(50));
		System.out.println(ts.lower(50));
		
		System.out.println("============================2===========================");
		
		System.out.println(ts.ceiling(40));	//if this object is not present, it will give the higher object
		System.out.println(ts.higher(40));
		System.out.println(ts.floor(40));	//if this object is not present, it will give the lower object
		System.out.println(ts.lower(40));

	}

}
