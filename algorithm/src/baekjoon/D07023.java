package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class D07023 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/11659 구간 합 구하기 4
		// a번부터 b번까지의 구간 합은 1번부터 b번까지의 구간합 - 1번부터 a-1번까지의 구간 합
		// ex) 3~5번까지의 구간합 = 1~5번 구간합 - 1~2번 구간합

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] num = new int[n + 1]; // 일상에서는 0번이 아닌 1번부터 말하므로 인덱스 0번을 제외하려 배열의 크기를 n+1 로 지정함
		num[0] = 0; // 인덱스 0번은 계산 결과에 영향 미치지 않도록 0으로 값 부여

		int sum = 0;

		for (int i = 0; i < n; i++) { // 입력값 받아와서 num배열에 1~i+1번까지의 구간합 저장
			sum += Integer.parseInt(st.nextToken());
			num[i + 1] = sum;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 구간a
			int b = Integer.parseInt(st.nextToken()); // 구간b

			bw.write((num[b] - num[a - 1]) + "\n"); //  a번부터 b번까지의 구간 합은 1번부터 b번까지의 구간합 - 1번부터 a-1번까지의 구간 합
		}

		bw.flush();
		bw.close();
		br.close();

	}

}
