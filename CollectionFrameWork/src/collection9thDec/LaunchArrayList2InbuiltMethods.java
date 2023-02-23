package collection9thDec;

import java.util.ArrayList;

//09thDec recorded lecture 2nd part --> watched on 30thJan2023 from 06:30AM onwards

public class LaunchArrayList2InbuiltMethods {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		arr.add(44);
		System.out.println(arr);
		
		System.out.println("==========================1==========================");
		
		/*	boolean res = arr.contains(44);
		 *	System.out.println(res);
		*/ 
		//OR
		System.out.println(arr.contains(44));
		
		System.out.println("==========================2==========================");
		
		int index = arr.indexOf(22);
		System.out.println(index);
		
		System.out.println("==========================3==========================");
		
		System.out.println(arr.isEmpty());
		
		System.out.println("==========================4==========================");
		
		arr.ensureCapacity(10);
		System.out.println(arr.size());
		
		System.out.println("==========================5==========================");
		arr.trimToSize();
		System.out.println(arr);
		
		System.out.println("==========================6==========================");
		System.out.println(arr.getClass());
		
		System.out.println("==========================7==========================");
		arr.clear();
		System.out.println(arr);
		System.out.println(arr.size());
		
		System.out.println("==========================8==========================");
		
		
		
		
		
		
		
	}

}
