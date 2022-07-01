package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class D07012 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/4796 캠핑
		// 쉬운거라 주석 굳이 필요 없을 듯

		Scanner sc = new Scanner(System.in);

		ArrayList<int[]> list = new ArrayList<int[]>();

		boolean flag = true;

		while (flag) {
			int[] lpv = new int[3];
			lpv[0] = sc.nextInt();
			lpv[1] = sc.nextInt();
			lpv[2] = sc.nextInt();

			list.add(lpv);

			if (lpv[0] == 0 && lpv[1] == 0 && lpv[2] == 0) {
				flag = false;
			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			int l = list.get(i)[0]; // 연속하는 일자 수 중 숙박 가능일자 수
			int p = list.get(i)[1]; // 연속하는 일자 수
			int v = list.get(i)[2]; // 휴가 일자 수
			int rest = v % p > l ? l : v % p;
			System.out.println("Case " + (i + 1) + ": " + (v / p * l + rest));
		}

		sc.close();
	}

}
