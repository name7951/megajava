package exercise;

import java.util.Random;

public class RandomCoin {

	public static void main(String[] args) {

		Random r = new Random();

		int[] coin = new int[100000];
		int zero = 0;

		for (int i = 0; i < coin.length; i++) {
			coin[i] = r.nextInt(2);
			if (coin[i] == 0) {
				zero++;
			}
		}

		System.out.println("Numbers of 0 : " + zero);
		System.out.println("Numbers of 1 : " + (coin.length - zero));

	}

}
