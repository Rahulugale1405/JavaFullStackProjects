package gameProject;
//02ndNov recording -> from 01:20 mins onwards --> practiced on 30thDec 10:14PM onwards

import java.util.Scanner;

class Guesser {
	int guessNum;
	int guessNum() {
	Scanner scan = new Scanner (System.in);
	System.out.println("Guesser, kindly guess the number");
	guessNum = scan.nextInt();
	return guessNum;
	}
}

class Player {
	int guessNum;
	int guessNum() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Player, kindly guess the number");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers () {
		Player p1 = new Player();
		numFromPlayer1 = p1.guessNum();
		Player p2 = new Player();
		numFromPlayer2 = p2.guessNum();
		Player p3 = new Player();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() {
		
		if (numFromGuesser==numFromPlayer1) {
			if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All Players won the Game");
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


public class LaunchGame1 {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
	}

}
