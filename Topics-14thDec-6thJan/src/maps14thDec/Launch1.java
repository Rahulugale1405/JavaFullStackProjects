package maps14thDec;

//14thDec recorded lecture 1st part --> practiced on 02ndFeb2023 from 07:30M onwards
import java.util.*;
import java.util.Map.Entry;

/*	HashMap doesn't maintain the order of insertion although it follows algorithm
 * 	LinkedHashMap maintains order of insertion
 */
public class Launch1 {

	public static void main(String[] args) {
		
		//jdk 1.2
		HashMap hm = new HashMap();
		hm.put(10, "Sachin");
		hm.put(7, "MSD");				//here one key-value is one Entry
		hm.put(18, "Kohli");
		System.out.println(hm);
		
		System.out.println(hm.get(18));
		
		
		System.out.println("=====================================1====================================");
		
		
		Collection collect = hm.values();				//return type of values() method is Collection
		Iterator iterator1 = collect.iterator();
		while(iterator1.hasNext()) {
			//System.out.print(iterator1.next() + " ");				//OR 		below this line
			//System.out.println();
			String s = (String) iterator1.next();				//type casting performed
			System.out.print("String object value: " + s + " ");
		}
		
		System.out.println();
		
		Set set1 = hm.keySet();							//return type of keySet() method is Set
		Iterator iterator2 = set1.iterator();
		while(iterator2.hasNext()) {
			//System.out.print(iterator2.next() + " ");				//OR 		below this line
			//System.out.println();
			Integer i = (Integer) iterator2.next();				//type casting performed
			System.out.print("Integer key value: " + i + " ");
		}
		
		System.out.println();
		
		Set set2 = hm.entrySet();						//return type of entrySet() method is Set
		Iterator iterator3 = set2.iterator();
		while(iterator3.hasNext()) {
			//System.out.print(iterator3.next() + " ");
			Map.Entry data = (Entry) iterator3.next();			//type casting Entry
			System.out.print(data.getKey() + ":" + data.getValue() + " ");
		}
		
		
		
		System.out.println();
		System.out.println("=====================================2====================================");
		
		
		
		//jdk 1.4
		//LinkedHashMap maintains order of insertion
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10, "Sachin");
		lhm.put(7, "MSD");
		lhm.put(18, "Kohli");
		System.out.println(lhm);
		

	}

}
