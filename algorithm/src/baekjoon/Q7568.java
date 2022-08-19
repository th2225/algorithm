package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int[][] xylist = new int[n][2];

		int[] rank = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			xylist[i][0] = Integer.parseInt(st.nextToken());
			xylist[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (xylist[i][0] < xylist[j][0]) {
					if (xylist[i][1] < xylist[j][1]) {
						rank[i]++;
					}
				} else if (xylist[i][0] > xylist[j][0]) {
					if (xylist[i][1] > xylist[j][1]) {
						rank[j]++;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(rank[i] + 1 + " ");
		}

		br.close();

	}

}
