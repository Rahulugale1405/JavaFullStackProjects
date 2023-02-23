package exceptionHandling29thNov;

//29thNov recorded lecture from 01:18mins - practiced on 20thJan2023 from 12:23PM onwards

import java.util.Scanner;

class InvalidCustomerException extends Exception {		//write this class later
	
	public InvalidCustomerException(String msg) {
		super(msg);
	}
}

class ATM {
	
	int userid=1212;
	int password=1111;
	int pw;
	int uid;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kindly enter the userid");
		uid = scan.nextInt();
		System.out.println("Kindly enter the password");
		pw = scan.nextInt();
	}
	
	public void verify() throws InvalidCustomerException {
		if((userid == uid) && (password==pw)) {
			System.out.println("Take your cash");
		}
		else {
			InvalidCustomerException ice = new InvalidCustomerException("Are you sure? Try again bcz input provided is incorrect");
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
	
}

class Bank {
	
	public void initiate() {
		ATM atm = new ATM();
		
		try {
			atm.input();
			atm.verify();
		} 
		catch (InvalidCustomerException e1) {
			
			try {
				atm.input();
				atm.verify();
			} 
			catch (InvalidCustomerException e2) {
				
				try {
					atm.input();
					atm.verify();
				} 
				catch (InvalidCustomerException e3) {
					
					System.out.println("Oh chor dude, we caught you & the card is blocked");
					System.exit(0);
				}
			}
		}
	}
	
}

public class Launch1CustomException {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.initiate();

	}

}
