package allAboutStringPart2;

//7thNov recorded lecture 1st part --> Practiced on 03rdJan2023 from 08:45 AM onwards

public class Ex4InsertMethods {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2, "xyz");
		sb.insert(9, 11);
		System.out.println(sb);
		
		System.out.println("=======================1=======================");
		
		sb.insert(sb.length(), "dhoni");
		System.out.println(sb);
	
		System.out.println("=======================2=======================");
		
		StringBuffer sb1 = new StringBuffer("sachinrameshtendulkar");
		sb1.delete(2, 4);
		System.out.println(sb1);
		
		System.out.println("=======================3=======================");
		
		StringBuffer sbr = new StringBuffer("sachin@14");
		sbr.deleteCharAt(6);
		System.out.println(sbr);
		
		System.out.println("=======================4=======================");
		
		StringBuffer sb3 = new StringBuffer("DevaRa");
		sb3.reverse();
		System.out.println(sb3);
		
		System.out.println("=======================5=======================");
		
		StringBuffer sb4 = new StringBuffer("DevaRaKrishna");
		System.out.println(sb4);
		sb4.setLength(6);
		System.out.println(sb4);
		
		System.out.println("=======================6=======================");
		
		StringBuffer sb5 = new StringBuffer(1000);
		System.out.println(sb5.capacity());
		sb5.append("DevaRa");
		System.out.println(sb5.capacity());
		System.out.println(sb5.capacity());
		
		System.out.println("=======================7=======================");
		
		StringBuffer sb6 = new StringBuffer();
		System.out.println(sb6.capacity());
		;;;;
		;;;;
		;;;;
		;;;
		;;;
		sb6.ensureCapacity(1000);
		System.out.println(sb6.capacity());
	}

}
