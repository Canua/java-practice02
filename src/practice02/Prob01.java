package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] result = new int[10];
		String[] won = { "50000원", "10000원", "5000원", "1000원", "500원", "100원", "50원", "10원", "5원", "1원" };
		System.out.print("금액 : ");
		Scanner s = new Scanner(System.in);
		int input_money = s.nextInt();
		for (int i = 0; i < MONEYS.length; i++) {
			result[i] = input_money / MONEYS[i];
			input_money = input_money % MONEYS[i];
			System.out.println(won[i] + " : " + result[i] +"원");
		}
	}

}
