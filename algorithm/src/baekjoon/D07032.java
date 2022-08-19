package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class D07032 {

	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/1202 보석 도둑

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] mv = new int[n][2];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			mv[i][0] = Integer.parseInt(st.nextToken());
			mv[i][1] = Integer.parseInt(st.nextToken());
		}

		ArrayList<Integer> c = new ArrayList<Integer>();

		for (int i = 0; i < k; i++) {
			c.add(Integer.parseInt(br.readLine()));
		}

		Arrays.sort(mv, (o1, o2) -> {
			return Integer.compare(o2[1], o1[1]);
		});

		Collections.sort(c);

		int maxValue = 0;

		for (int i = 0; i < k; i++) {
			int size = c.size();

			c = findMatchingBag(mv[i][0], c);

			if (size != c.size()) {
				maxValue += mv[i][1];
			} else {
				i--;
			}

			if (c.size() == 0) {
				break;
			}
		}

		System.out.println(maxValue);

		br.close();

	}

	public static ArrayList<Integer> findMatchingBag(int m, ArrayList<Integer> c) {

		int maxWeight = c.get(c.size() - 1);

		if (m > maxWeight) {
			return c;
		} else {
			for (int i = 0; i < c.size(); i++) {
				if (c.get(i) >= m) {
					c.remove(i);
					break;
				}
			}

			return c;
		}

	}

}
