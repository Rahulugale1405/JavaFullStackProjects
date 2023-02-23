package gameProject;
//02ndNov recording -> from 01:20 mins onwards --> practiced on 30thDec 10:14PM onwards

import java.util.Scanner;

class GuesserNana {
	int guessNum;
	int guessNum() {
	Scanner scan = new Scanner (System.in);
	System.out.println("DheriPatil la wardrobe mdhye fekaycha");
	guessNum = scan.nextInt();
	return guessNum;
	}
}

class PlayerNana {
	int guessNum;
	int guessNum() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ready to throw");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class UmpireNana {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		GuesserNana g = new GuesserNana();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers () {
		PlayerNana p1 = new PlayerNana();
		numFromPlayer1 = p1.guessNum();
		PlayerNana p2 = new PlayerNana();
		numFromPlayer2 = p2.guessNum();
		PlayerNana p3 = new PlayerNana();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() {
		
		if (numFromGuesser==numFromPlayer1) {
			if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("DheriPatil la wardrobe mdhye fekla wohooooo!");
			}
			else if (numFromGuesser==numFromPlayer2) {
				System.out.println("Player1 & Player2 won the Game");
			}
			else if (numFromGuesser==numFromPlayer3) {
				System.out.println("Player1 & Player3 won the Game");
			}
			else {
				System.out.println("Player1 won the Game");
			}
		}
		
		else if (numFromGuesser==numFromPlayer2) {
			if (numFromGuesser==numFromPlayer3) {
				System.out.println("Player2 & Player3 won the Game");
			}
		}
		
		else if (numFromGuesser==numFromPlayer3) {
			System.out.println("Player3 won the Game");
		}
		
		else {
			System.out.println("Game lost! Try Again");
		}
		
	}
}


public class LaunchGame2 {

	public static void main(String[] args) {
		
		UmpireNana u = new UmpireNana();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}

}
