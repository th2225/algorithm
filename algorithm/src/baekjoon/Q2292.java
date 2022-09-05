package baekjoon;

import java.util.Scanner;

public class Q2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += i;

			if (6 * sum >= n - 1) {
				System.out.println(i + 1);
				break;
			}
		}

		sc.close();

	}

}
