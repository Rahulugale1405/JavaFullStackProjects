package collection12thDec;

import java.util.HashSet;
import java.util.LinkedHashSet;

//12thDec2022 recorded lecture 2nd Part --> watched on 31stJan2023 from 08:20AM onwards

/*	1. In HashSet, order of insertion is not preserved/maintained. To maintain this order, there is a subclass
 * 	   or ChildClass of HashSet called as LinkedHashSet.
 * 	2. HashSet works on hashing algorithm
 * 
 */
public class LaunchHashSet {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(125);
		System.out.println(hs);
		
		System.out.println("=========================1==========================");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(125);
		System.out.println(lhs);	//order of insertion is maintained

	}

}
