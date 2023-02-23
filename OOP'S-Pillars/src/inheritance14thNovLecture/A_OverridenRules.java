package inheritance14thNovLecture;

//14thNov recorded lecture 1stPart from 01:17mins --> Practiced on 07thJan2023 06:51 PM onwards

//Below are some rules to override methods
//	1. We cannot reduce visibility of overridden methods but we can increase it.
//	2. Return type of overridden methods must be same as that of overriding methods.
//	3. Return type of overridden methods in child class can be different as that of parent class if it is 
//	   co-variant return type (return type is-A relationship)
//	4. Parameters of overridden methods must be same as that of parent else it will be considered as 
//	   specialized method considering method overloading concept.


class Loan {
	void disp() {
		System.out.println("Welcome to INeuron Bank");
	}
	
}

class PersonalLoan extends Loan {
	void disp() {
		System.out.println("Personal loan application");
	}
	
}


public class A_OverridenRules {

	public static void main(String[] args) {
		
		PersonalLoan pl = new PersonalLoan();
		pl.disp();

	}

}
