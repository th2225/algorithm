package baekjoon;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int sum = 0;

		// i가 짝수면 1/i에서 시작, i가 홀수면 i/1에서 시작
		for (int i = 1; i <= x; i++) {
			sum += i;

			if(sum - i < x && sum >= x) {
				if (i % 2 == 1) {
					System.out.println((1 + (sum - x)) + "/" + (i - (sum - x)));
					break;
				} else {
					System.out.println((i - (sum - x)) + "/" + (1 + (sum - x)));
					break;
				}

			}
		}

		sc.close();

	}

}
