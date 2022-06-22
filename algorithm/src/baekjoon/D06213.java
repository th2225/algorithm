package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D06213 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/10610 30

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		String[] arr = new String[n.length()];

		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.substring(i, i + 1);
		}

		Arrays.sort(arr, Collections.reverseOrder());

		String strNo = "";
		int no = 0;

		for (int i = 0; i < n.length(); i++) {
			strNo += arr[i];
			no += Integer.parseInt(arr[i]);
		}

		if (!arr[n.length() - 1].equals("0") || no % 3 != 0) {
			System.out.println(-1);
		} else {
			System.out.println(strNo);
		}

		sc.close();

	}

}