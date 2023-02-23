package allAboutStringPart2;

//7thNov recorded lecture 1st part --> Practiced on 03rdJan2023 from 11:47 AM onwards

public class Ex5StringMethodChaining {

	public static void main(String[] args) {
		
		String name = "DevaRa";
		String data = name.toUpperCase();
		int count = data .length();
		System.out.println(count);
		
		System.out.println("=================1=================");
		
		

		
		//This is called as Method chaining
		
		System.out.println(name.toUpperCase().length());
		
		System.out.println("=================2=================");
		
		StringBuffer sb = new StringBuffer("Deva");
		sb.append("Krishna").insert(11, "Rahul");
		System.out.println(sb);
		
		System.out.println("=================3=================");
		
		StringBuffer sb1 = new StringBuffer("Virat");
		sb1.append("Kohli").insert(10, "Anushka").reverse().append("IND").insert(sb1.length(), "RCB");
		System.out.println(sb1);
		
		System.out.println("=================4=================");
		
		StringBuffer sb2 = new StringBuffer("Virat");
		sb2.append("Kohli").insert(10, "Anushka").reverse().append("IND").insert(sb2.length(), "RCB").reverse();
		System.out.println(sb2);
		
		System.out.println("=================5=================");
		
		StringBuffer sb3 = new StringBuffer("Virat");
		sb3.append("Kohli").insert(10, "Anushka").reverse().append("IND").insert(sb3.length(), "RCB").reverse().delete(0, 6);
		System.out.println(sb3);
		
		System.out.println("=================6=================");
		
		StringBuffer sb4 = new StringBuffer("dhoni");
		//sb4.length().append("CSK"); 					//Remove // & it will show error
		
	}

}
