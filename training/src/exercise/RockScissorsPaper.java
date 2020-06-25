package exercise;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int rock = 0;
		int scissors = 1;
		int paper = 2;
		int player, computer;
		int answer;

		while (true) {
			System.out.print("Rock: 0, Scissors: 1, Paper: 2  Choose >>> ");
			player = sc.nextInt();
			computer = (int) (3 * Math.random());
			System.out.println("The computer's choice is " + computer);
			System.out.println("-----------------------------------------------");
			if (player == computer) {
				System.out.println("It's a tie!");
			} else {
				if (player == 0) {
					if (computer == 1) {
						System.out.println(" Player: ROCK \n Computer: SCISSORS \n Player wins");
					} else {
						System.out.println(" Player: ROCK \n Computer : PAPER \n Computer wins");
					}
				} else if (player == 1) {
					if (computer == 0) {
						System.out.println(" Player: SCISSORS \n Computer: ROCK \n Computer wins");
					} else {
						System.out.println(" Player: SCISSORS \n Computer: PAPER \n Player wins");
					}
				} else {
					if (computer == 0) {
						System.out.println(" Player: PAPER \n Computer: ROCK \n Player wins");
					} else {
						System.out.println(" Player: PAPER \n Computer: SCISSORS \n Computer wins");
					}
				}
			}

			System.out.print("Play again? Enter 1 for yes, 0 for no >> ");
			answer = sc.nextInt();

			if (answer == 1) {
				System.out.println("");
			} else {
				System.out.println("Thank's for playing");
				break;
			}

		}

	}

}
