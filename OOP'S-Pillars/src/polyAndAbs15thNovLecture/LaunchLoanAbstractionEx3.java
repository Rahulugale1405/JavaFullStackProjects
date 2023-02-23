package polyAndAbs15thNovLecture;

//15thNov recorded lecture 2ndPart from 01:50 mins onwards --> Practiced on 08thJan2023 12:53 PM onwards

abstract class Loan1 {
	
	abstract public void dispInterest();
	public void welcomeNote() {
		System.out.println("Welcome in the Bank");
		
	}
}

class HomeLoan1 extends Loan1 {

	public void dispInterest() {
		System.out.println("Rate of Interest is 14%");
	}
	
}
class EducationLoan1 extends Loan1 {

	public void dispInterest() {
		System.out.println("Rate of interest is 10%");
	}
	
}
public class LaunchLoanAbstractionEx3 {

	public static void main(String[] args) {
		
		//Loan1 l = new Loan1();				//we cannot create object of Abstract class
		
		Loan1 loan1 = new HomeLoan1();
		//we can create reference of abstract class
		loan1.dispInterest();
		loan1.welcomeNote();
		
		Loan1 loan2 = new EducationLoan1();
		loan2.dispInterest();
		loan2.welcomeNote();
	}

}
