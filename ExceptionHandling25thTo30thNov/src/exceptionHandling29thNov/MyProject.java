package exceptionHandling29thNov;

import java.util.Scanner;

class AnnaLaPaisePahijeException extends Exception {
	public AnnaLaPaisePahijeException(String message) {
		super(message);
	}
}

class AnnaLaPasieDileException extends Exception {
	public AnnaLaPasieDileException(String message) {
		super(message);
	}
}

class Money {
	
	int money;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Poranno mla 400rupay dya");
		money = scan.nextInt();
	}
	
	public void moneyToTake() throws AnnaLaPaisePahijeException, AnnaLaPasieDileException {
		if(money<400)  {
			AnnaLaPaisePahijeException alppe = new AnnaLaPaisePahijeException("Poranno... 400 rupay peksha ek rupaye kami ghenar nahi");
			System.out.println(alppe.getMessage());
			throw alppe;
		}
		else if(money>400) {
			AnnaLaPasieDileException alpde = new AnnaLaPasieDileException("Nusta paisach paisa arrra arrrraaa"); 
			System.out.println(alpde.getMessage());
			throw alpde;
		}
		else {
			System.out.println("Vishay sampla.... paisa vasoool");
		}
	
	}
}

class ReturnMoney {
	public void initiatePaisa() {
		Money m = new Money();
		try {
		m.input();
		m.moneyToTake();
		}
		catch(AnnaLaPaisePahijeException | AnnaLaPasieDileException e1) {
			try {
				m.input();
				m.moneyToTake();
			}
			catch(AnnaLaPaisePahijeException | AnnaLaPasieDileException e2) {
					System.out.println("Parat kadhi gaadi kadhnar nahi me");
					System.exit(0);
			}
		}
	}
}

public class MyProject {

	public static void main(String[] args) {
		
		ReturnMoney rm = new ReturnMoney();
		rm.initiatePaisa();
	}

}
