package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D07024 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2178 미로 탐색 => 월요일에 풀이 있음

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] maze = new char[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			maze[i] = str.toCharArray();
		}

ㅑ
	}

}
