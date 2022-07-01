package baekjoon;

import java.util.Scanner;

public class D06251 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/14659 한조서열정리하고옴ㅋㅋ
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] peek = new int[n];

		for (int i = 0; i < n; i++) {
			peek[i] = sc.nextInt();
		}

		int archer = peek[0]; // 첫 활잡이는 무조건 배열의 첫 인덱스
		int best = 0;
		int attack = 0;

		for (int i = 1; i < n; i++) { // // 다음 활잡이가 있는 봉우리랑 높이 비교
			if (archer > peek[i]) { // archer로 저장되어 있는 활잡이의 봉우리가 높으면
				attack++; // 공격 1++
			} else {
				if (best < attack) { // 그렇지 않으면 attack에 쌓여 있는 값과 best로 저장되어 있는 값 비교 후
					best = attack; // best가 attack보다 작을때만 best의 값을 attack의 값으로 변경
				}
				archer = peek[i]; // archer는 더 높은 봉우리에 있는 활잡이로 교체됨
				attack = 0; // 새로운 archer의 공격 횟수 저장하기 위해 attack 의 값 초기화
			}

		}

		// 마지막까지 쭉 사냥할 수 있는 활잡이의 경우의 수를 놓쳤음. 
		// 마지막까지 쭉 사냥할 경우 best에 attack의 값이 못들어가고 for문을 빠져나오므로 출력전에 attack과 best의 값을 비교해 큰 쪽을 출력
		System.out.println(best > attack ? best : attack); 

		sc.close();

	}

}
