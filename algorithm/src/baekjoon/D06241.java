package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class D06241 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1946 신입 사원
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] max = new int[t];

		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			int[][] grade = new int[n][2];

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				grade[j][0] = Integer.parseInt(st.nextToken());
				grade[j][1] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(grade, Comparator.comparing(o1 -> o1[0])); // 서류 심사 순으로 정렬

			int min = grade[0][1]; // 서류 심사 1등 이후 순위의 지원자는 면접에서 서류 1등보다 잘해야지만 선정 될 수 있으므로 서류 심사 1등의 면점 등수를 최소 값으로 저장

			for (int j = 1; j < n; j++) { // 지원자들은 차례로 자신의 등수를 현재 최소값과 비교
				if (grade[j][1] < min) { // 최소값보다 잘 했으면
					max[i]++; // 1명이 선정됨
					min = grade[j][1]; // 더 면접을 잘 본 지원자의 면접 등수를 최소값으로 지정 => 반복
				}
			}

		}

		for (int i = 0; i < max.length; i++) {
			System.out.println(max[i] + 1); // 서류 1등은 무조건 뽑히므로 max[i] 값에 +1 해줌
		}

		br.close();

	}
}
