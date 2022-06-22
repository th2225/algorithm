package baekjoon;

import java.util.Scanner;

public class D06202 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/5585 거스름돈

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = { 500, 100, 50, 10, 5, 1 };
		int min = 0;

		for (int i = 0; i < arr.length; i++) { // 거스름돈 큰 동전부터 나눔
			if ((1000 - n) / arr[i] != 0) { // 몫이 있으면 min에 저장
				min += (1000 - n) / arr[i];
				if ((1000 - n) % arr[i] == 0) { // 딱 나누어 떨어지면 더이상 for문 진행하지 않고 빠져나감
					break;
				} else { // 그 외 for 문 반복
					n += (1000 - n) / arr[i] * arr[i]; // 이때 n의 값은 기존 거스름돈에서 큰 동전으로 거슬러 준만큼을 뺀 값으로 재설정한다
				}
			}
		}

		System.out.println(min);

		sc.close();
	}

}