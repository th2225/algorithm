package baekjoon;

import java.util.Scanner;

public class D06182 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/11399 ATM

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 인출하는 사람수 저장
		int[] P = new int[N]; // 인출 시간 저장
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}

		int temp = 0;

		for (int i = 0; i < N; i++) {  // 배열의 앞 순서일 수록 많이 더해지게 되므로 시간합의 최소값은 작은수부터 순차 정렬 -> 정렬시키기
			for (int j = 1; j < (N - i); j++) { 
				if (P[j - 1] > P[j]) {
					temp = P[j - 1];
					P[j - 1] = P[j];
					P[j] = temp;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < N; i++) {  // P[0] + P[0] + P[1] + P[0] + P[1] + P[2].... 이런식으로 더해서 sum에 넣음
			for (int j = 0; j <= i; j++) {
				sum += P[j];
			}
		}

		System.out.println(sum); // sum 출력

		sc.close();
	}

}
