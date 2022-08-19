package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class D07021 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1920 수 찾기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n = br.readLine();

		StringTokenizer st = new StringTokenizer(br.readLine());

		HashSet<String> hs = new HashSet<String>();

		for (int i = 0; i < Integer.parseInt(n); i++) {
			hs.add(st.nextToken());  // n개의 정수 hashset에 입력
		}

		String m = br.readLine();

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < Integer.parseInt(m); i++) {
			if (hs.contains(st.nextToken())) { // n개의 정수 안에 포함되어 있는 숫자인지 알아볼 m개의 정수 중 1개
				System.out.println(1); // m개의 정수 중 1개의 값이 hashset 안에 존재하면 1 출력
			} else {
				System.out.println(0); // m개의 정수 중 1개의 값이 hashset 안에 존재하지 않으면 0 출력
			}
		}

		br.close();

	}

}
