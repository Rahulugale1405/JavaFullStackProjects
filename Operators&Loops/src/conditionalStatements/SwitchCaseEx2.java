package conditionalStatements;

public class SwitchCaseEx2 {		//recorded lecture of 17thOct - the second half. Practicing on 21thDec morning

	public static void main(String[] args) {
		
		int a = 200;
		
		switch(a) {
		
		case 200: System.out.println("print a for case 200 = " + a);
			break;		
		case 108: System.out.println("print a for case 108 = " + a);
			break;
		case 105: System.out.println("print a for case 105 = " + a);
			break;
		default: System.out.println("print nothing");
		}
		
		System.out.println("--------------------------------1----------------------------------");
		
		int a1 = 500;
		
		switch(a1) {
		
		case 119: System.out.println("print a for case 119 = " + a1);
			break;		
		case 500: System.out.println("print a for case 500 = " + a1);
			break;
		case 105: System.out.println("print a for case 105 = " + a1);
			break;
		default: System.out.println("print nothing");
		}
		
		System.out.println("--------------------------------2----------------------------------");
		
		int a2 = 10000;
		
		switch(a2) {
		
		case 119: System.out.println("print a for case 119 = " + a2);
			break;		
		case 500: System.out.println("print a for case 500 = " + a2);
			break;
		case 105: System.out.println("print a for case 105 = " + a2);
			break;
		default: System.out.println("nothing to print for a2");
		}
	}

}
