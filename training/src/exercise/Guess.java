package exercise;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer;

		System.out.println("You will guess a secret number between 1 and n");
		System.out.print("Give me a value for n : ");
		int n = sc.nextInt();
		System.out.println("OK, I am thinking of a number between 1 and " + n);

		int number = (int) (n * Math.random()) + 1;
		int guess;
		int action = 0;

		while (true) {
			System.out.print("Your guess : ");
			guess = sc.nextInt();
			action++;
			if (guess > number) {
				System.out.println("Too high");
			} else if (guess < number) {
				System.out.println("Too low");
			} else {
				System.out.println("That's it!");
				System.out.println("Score : " + action + "guesses");
				break;
			}
		}

	}

}
