package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D06184 {
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1931 회의실 배정

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 좀더 빠른 실행을 위해 Scanner대신
																					// BufferedReader 사용
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine()); // 회의 갯수 넣기
		int[][] I = new int[N][2]; // 회의 시작,종료 시간 넣을 변수

		for (int i = 0; i < N; i++) { // 회의 시작,종료 시간 넣기
			st = new StringTokenizer(br.readLine());

			I[i][0] = Integer.parseInt(st.nextToken());
			I[i][1] = Integer.parseInt(st.nextToken());
		}

		// 종료시간이 빠른 회의를 가능한 순서대로 진행하는게 가장 많이 회의 진행 할 수 있음 => 종료시간 빠른 순으로 재배열
		Arrays.sort(I, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		// 다음 회의 시작시간이 이전 회의 종료시간 전이 아닌것중에 종료시간이 빠른것 선택 -> 반복
		int max = 1; // 회의를 1개는 무조건 할 수 있으므로 1을 기본값으로 줌
		int endTime = I[0][1]; // 기본값은 배열의 첫번째값

		for (int i = 1; i < N; i++) { // 배열의 두번째값부터 비교 시작
			if (endTime <= I[i][0]) { // 새 회의의 시작시간이 현재 회의의 종료시간과 같거나 크다면 그 회의 진행 가능
				max++; // 회의 갯수 증가시킴
				endTime = I[i][1]; // 종료시간을 새로운 회의의 종료시간으로 바꿈
			}
		}

		System.out.println(max);

		br.close();
	}
}
