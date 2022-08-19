package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D07091 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/2869 달팽이는 올라가고 싶다

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int cnt = 0;

		if (v == a) {
			cnt = 1;
		} else if ((v - a) < (a - b)) {
			cnt = 2;
		} else if ((v - a) / (a - b) != 0 && (v - a) % (a - b) != 0) {
			cnt = (v - a) / (a - b) + 2;
		} else {
			cnt = (v - a) / (a - b) + 1;
		}

		System.out.println(cnt);
		br.close();

	}

}
