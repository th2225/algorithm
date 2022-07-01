package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D06291 {
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1439 뒤집기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		// 연속되는 0 또는 1의 갯수가 작은 것을 돌리는게 최소 뒤집기 횟수
		// 따라서 0으로 이루어진 배열, 1로 이루어진 배열을 만듦
		String[] sArr0 = s.split("1"); 
		String[] sArr1 = s.split("0");
		int sArr0Length = 0;
		int sArr1Length = 0;

		// split을 하면 split한 문자 자리가 빈값으로 배열안에 들어가므로 값이 있는 인덱스의 갯수만 세기 위해 for문 돌림
		for (int i = 0; i < sArr0.length; i++) {
			if (!"".equals(sArr0[i])) {
				sArr0Length++;
			}
		}

		for (int i = 0; i < sArr1.length; i++) {
			if (!"".equals(sArr1[i])) {
				sArr1Length++;
			}
		}

		// 작은 수 출력
		System.out.println(sArr0Length > sArr1Length ? sArr1Length : sArr0Length);

		br.close();
	}

}
