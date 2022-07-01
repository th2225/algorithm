package baekjoon;

import java.util.Scanner;

public class D06301 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1002 터렛

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int[][] arr1 = new int[t][3];
		int[][] arr2 = new int[t][3];
		int result = 0;

		for (int i = 0; i < t; i++) {
			arr1[i][0] = sc.nextInt();
			arr1[i][1] = sc.nextInt();
			arr1[i][2] = sc.nextInt();
			arr2[i][0] = sc.nextInt();
			arr2[i][1] = sc.nextInt();
			arr2[i][2] = sc.nextInt();
		}

		for (int i = 0; i < t; i++) {
			int x1 = arr1[i][0];
			int x2 = arr2[i][0];
			int y1 = arr1[i][1];
			int y2 = arr2[i][1];
			int r1 = arr1[i][2];
			int r2 = arr2[i][2];

			int d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
			int radd = (r1 + r2) * (r1 + r2);
			int rsub = (r1 - r2) * (r1 - r2);

			if (x1 == x2 && y1 == y2 && r1 == r2) {
				result = -1;
			} else if (d < radd && d > rsub) {
				result = 2;
			} else if (d == radd || d == rsub) {
				result = 1;
			} else {
				result = 0;
			}

			System.out.println(result);
		}

		sc.close();

	}

}
