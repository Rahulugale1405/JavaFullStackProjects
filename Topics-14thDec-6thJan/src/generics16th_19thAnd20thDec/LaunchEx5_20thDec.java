package generics16th_19thAnd20thDec;

//20thDec recorded lecture 1st part from 01:00mins - watched on 07thFeb2023 from 03:25PM onwards

import java.util.*;

public class LaunchEx5_20thDec {

	public static void main(String[] args) {
		
		//working with generic code (JDK1.5V)
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Sachin");
//CE->	arr.add(new Integer(10));
//CE->	arr.add(new Boolean(true));
		
		m1(arr);
		System.out.println(arr);
	}

	
		//working with non-generic code (JDK1.4)
		//here ArrayList al is --> ArrayList<String> arr = new ArrayList<String>();
		public static void m1(ArrayList al) {			//making this static to access this method in main method
			al.add(10);
			al.add("virat");
			al.add(true);
		}
		
}
