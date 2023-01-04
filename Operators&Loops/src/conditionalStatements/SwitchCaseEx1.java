package conditionalStatements;

public class SwitchCaseEx1 {		//recorded lecture of 17thOct - the second half. Practicing on 21thDec morning

	public static void main(String[] args) {
		
		int num1 = 100;
		
		switch(num1) {
		
		case 10: System.out.println("1st case");
		case 20: System.out.println("2nd case");
		case 100: System.out.println("3rd case");
		}	
		
		System.out.println("------------------1---------------------");
		
		int num2 = 100;
		
		switch(num2) {
		
		case 100: System.out.println("1st case");
		case 20: System.out.println("2nd case");
		case 10: System.out.println("3rd case");
		
		}
		
		System.out.println("------------------2---------------------");
		
		int num3 = 100;
		
		switch(num3) {
		
		case 10: System.out.println("1st case");
		case 100: System.out.println("2nd case");
		case 20: System.out.println("3rd case");
		
		}
	
		System.out.println("------------------3---------------------");
		
		int num4 = 100;
		
		switch(num4) {
		
		case 10: System.out.println("1st case");
		case 100: System.out.println("2nd case");				//try --> case 105:
		case 20: System.out.println("3rd case");
		default: System.out.println("let's print nothing");
		
		}
	}

}
