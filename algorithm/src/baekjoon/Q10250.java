package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());
		int[][] hwn = new int[t][3];
		String[] rooms = new String[t];

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			hwn[i][0] = Integer.parseInt(st.nextToken());
			hwn[i][1] = Integer.parseInt(st.nextToken());
			hwn[i][2] = Integer.parseInt(st.nextToken());

			int y = hwn[i][2] % hwn[i][0] == 0 ? hwn[i][0] : hwn[i][2] % hwn[i][0];
			int x = hwn[i][2] % hwn[i][0] == 0 ? hwn[i][2] / hwn[i][0] : hwn[i][2] / hwn[i][0] + 1;

			String yy = y + "";
			String xx = x < 10 ? "0" + x : x + "";

			rooms[i] = yy + xx;

		}

		for (int i = 0; i < t; i++) {
			System.out.println(rooms[i]);
		}

		br.close();
	}
}
