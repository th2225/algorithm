package baekjoon;

import java.util.Scanner;

public class D06183 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/11047 동전 0
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		int min = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = N - 1; i >= 0; i--) { // 큰 동전부터 나눔
			if (K / A[i] != 0) { // 나눴을때 몫이 나오는 가장 큰 동전이 나오면
				min += K / A[i];  // 그 몫을 min에 추가
				if (K % A[i] == 0) {  // 나머지가 없으면 그대로 min 출력
					break;
				} else {  // 나머지가 있다면 그 다음으로 큰 동전으로 나눠지는지 확인작업 반복
					K = K % A[i];
				}
			}
		}

		System.out.println(min);
		
		sc.close();	

	}
}
