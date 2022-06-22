package baekjoon;

import java.util.Scanner;

public class D06201 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1026 보물
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];
		int[] C = new int[N];

		for (int i = 0; i < N; i++) { // 배열 A 저장
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) { // 배열 B,C 저장
			B[i] = sc.nextInt();
			C[i] = B[i];
		}

		int temp = 0;

		//S의 최소값을 만들기 위해선 각 배열의 최대값과 최소값이 곱해져야함
		for (int i = 0; i < N - 1; i++) {  // 배열 A와 C 각각 오름차순, 내림차순으로 정렬
			for (int j = 1; j < N - i; j++) {
				if (A[j - 1] > A[j]) {
					temp = A[j - 1];
					A[j - 1] = A[j];
					A[j] = temp;
				}
				if (C[j - 1] < C[j]) {
					temp = C[j - 1];
					C[j - 1] = C[j];
					C[j] = temp;
				}
			}
		}

		int min = 0;
		for (int i = 0; i < N; i++) { // A의 최소값 * C의 최대값부터  A의 최대값 * C의 최소값까지 배열을 모두 더한 값 min에 담음
			min += A[i] * C[i];
		}
		
		System.out.print(min); // min 출력
		
		sc.close();

	}

}