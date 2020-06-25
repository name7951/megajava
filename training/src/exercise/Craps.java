package exercise;

import java.util.Random;
import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int num;
		int answer;

		System.out.print("Enter 0 to roll the dice : ");
		while (true) {
			num = sc.nextInt();
			int dice = r.nextInt(11) + 2;
			if (dice == 7 | dice == 11) {
				System.out.println("You rolled a " + dice);
				System.out.println("You win");
				System.out.print("Play again? Enter 1 for yes : ");
				answer = sc.nextInt();
				if (answer == 1) {
					System.out.print("Enter 0 to roll the dice : ");
					System.out.println("");
				} else if (answer == 0) {
					System.out.println("Bye");
					break;
				}
			} else if (dice == 4 | dice == 5 | dice == 6 | dice == 8 | dice == 9 | dice == 10) {
				System.out.println("You rolled a " + dice);
				System.out.println("Your point is " + dice + ". Continue rolling");
				System.out.print("Enter 0 to roll the dice : ");
				num = sc.nextInt();
				if (dice == 4 | dice == 5 | dice == 6 | dice == 8 | dice == 9 | dice == 10) {
					System.out.println("You rolled a " + dice);
					System.out.println("You win");
				} else if (dice == 7 | dice == 11) {
					System.out.println("You rolled a " + dice);
					System.out.println("You lose");
					System.out.print("Play again? Enter 1 for yes : ");
					answer = sc.nextInt();
					if (answer == 1) {
						System.out.print("Enter 0 to roll the dice : ");
						System.out.println("");
					} else if (answer == 0) {
						System.out.println("Bye");
						break;
					}
				} else {
					System.out.println("You rolled a " + dice);
					System.out.print("Enter 0 to roll the dice : ");
				}
			} else {
				System.out.println("You rolled a " + dice);
				System.out.println("You lose");
				System.out.print("Play again? Enter 1 for yes : ");
				answer = sc.nextInt();
				if (answer == 1) {
					System.out.print("Enter 0 to roll the dice : ");
					System.out.println("");
				} else if (answer == 0) {
					System.out.println("Bye");
					break;
				}
			}
		}

	}

}
