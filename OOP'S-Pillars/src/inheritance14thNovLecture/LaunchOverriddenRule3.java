package inheritance14thNovLecture;

//14thNov recorded lecture 2ndPart from 01:45mins --> Practiced on 07thJan2023 07:29 PM onwards

class Interest {
	
}

class InterestPersonalLoan extends Interest {
	
}

class Loans {
	
	//here "it" return type is "Interest" & not void, so it's "public Interest interest". So this is called as 
	//co-variant return type
	public Interest interest() {
		Interest it = new Interest();
		return it;
	}
	
}

class PersonalLoan1  extends Loans {
	
	//here "ipl" return type is "InterestPersonalLoan" & not void, so it's "public InterestPersonalLoan". 
	//So this is called as co-variant return type
	public InterestPersonalLoan interest() {
		InterestPersonalLoan ipl = new InterestPersonalLoan();
		return ipl;
	}
	
}


public class LaunchOverriddenRule3 {

	public static void main(String[] args) {
		

	}

}
