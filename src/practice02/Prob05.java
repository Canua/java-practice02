package practice02;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		int num = (int) (Math.random() * 100) + 1;
		int count = 1;
		int min_num = 1;
		int max_num = 100;

		while (true) {
			System.out.println(min_num + " - " + max_num);
			System.out.print(count + ">>");
			int correct = input.nextInt();
			if (num == correct) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String answer = scanner.next();
				if (answer.equals("y")) {
					num = (int) (Math.random() * 100) + 1;
					min_num = 1;
					max_num = 100;
				} else if (answer.equals("n")) {
					break;
				}

			} else {
				if (min_num > correct || max_num < correct) {
					System.out.println("범위를 벋어남");
				} else if (correct < num) {
					System.out.println("더 높게");
					min_num = correct;
				} else {
					System.out.println("더 낮게");
					max_num = correct;
				}
			}
		}
	}
}
