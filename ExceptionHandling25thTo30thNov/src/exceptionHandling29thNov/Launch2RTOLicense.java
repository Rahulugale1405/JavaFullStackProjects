package exceptionHandling29thNov;

//29thNov recorded lecture from 01:55mins - practiced on 20thJan2023 from 12:23PM onwards

import java.util.Scanner;

class UnderAgeException extends Exception {
	
	public UnderAgeException(String message) {
		super(message);
	}	
}

class OverAgeException extends Exception {
	
	public OverAgeException(String message) {
		super(message);
	}
}


class Applicant {
	
	int age;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();
	}
	//void verify() throws Exception {
	void verify() throws UnderAgeException, OverAgeException  {
		
		if(age<18) {
			UnderAgeException uae = new UnderAgeException("Ohh dude! Calm down, your time will come");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae = new OverAgeException("Your time is near! Calm down & pray");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("You're are eligible");
		}
	}	
}

class RTO {
	
	public void initiate() {
		Applicant a = new Applicant();
		try {
		a.input();
		a.verify();
		}
		catch (UnderAgeException | OverAgeException e1) {
			try {
				a.input();
				a.verify();
			}
			catch (UnderAgeException | OverAgeException e2) {
				System.out.println("Don't ever try again! Read rules & regulations");
				System.exit(0);
			}
		}
	}
}

public class Launch2RTOLicense {

	public static void main(String[] args) {
		
		RTO rto = new RTO();
		rto.initiate();

	}

}
