package generics16th_19thAnd20thDec;

import java.util.ArrayList;

//16thDec recorded lecture --> practiced on 04thFeb2023 from 08:00AM onwards

public class LaunchEx1_16thDec {

	public static void main(String[] args) {
		
		//Arrays are TypeSafety
		String[] s = new String[600];
		s[0] = "sachin";
		s[1] = "dhoni";
	//	s[2] = new Integer(10);			//C.E -> incompatible types
		
		
		//Collection are not TypeSafety
		//Collection --> TypeSafety & TypeCasting is not required then use Generics features available from JDK1.5
		ArrayList al = new ArrayList();
		al.add("sachin");
		al.add("dhoni");
		al.add(new Integer(10));
			;;;;
			;;;;
			;;;;
		//We assume the elements present inside ArrayList is String & we do retrieval
		String name1 = (String) al.get(0);				//added type casting
		String name2 = (String) al.get(1);
		String name3 = (String) al.get(2);
		
		
		
		
	}

}
