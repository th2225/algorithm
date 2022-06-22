package baekjoon;

import java.util.Scanner;

public class D06212 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1789 수들의 합
		
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();
		int max = 0;

		// 작은 수들부터 하나씩 합해서 s의 값을 넘으면 빠져나가면 됨
		for (int i = 1; i <= s; i++) {
			if (s < 0) {
				break;
			}
			s -= i;
			max++;
		}

		System.out.println(max);

		sc.close();

	}

}