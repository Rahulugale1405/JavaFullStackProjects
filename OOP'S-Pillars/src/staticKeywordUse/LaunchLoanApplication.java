package staticKeywordUse;

import java.util.Scanner;

//11thNov Recorded video 1stPart -> watched on 07thJan2023 from 09:00AM onwards

class Farmer {
	
	//here; pa->principalAmount, td->timeDuration, si->simpleInterest, ri->rateOfInterest
	private float pa;
	private float td;
	private float si;
	private static float ri;						//making this static because ri is same for all
	
	static {										//Static Block with static variable value
		ri=2.5f;
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kindly enter the principal amount");
		pa=scan.nextFloat();
		System.out.println("Kindly mention time duration required");
		td=scan.nextFloat();
	}
	void compute() {
		si=(pa*td*ri)/100;
	}
	void disp() {
		System.out.println("Simple Interest is " + si);
	}
}

public class LaunchLoanApplication {

	public static void main(String[] args) {
		
		Farmer f1 = new Farmer();
		Farmer f2 = new Farmer();
		
		f1.input();
		f1.compute();
		f1.disp();
		f2.input();
		f2.compute();
		f2.disp();

	}

}
