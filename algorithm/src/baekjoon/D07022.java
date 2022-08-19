package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D07022 {
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/10816 숫자 카드 2

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int nt = Integer.parseInt(st.nextToken());

			 // 상근이가 숫자카드 몇을 몇장씩 가지고 있는지 HashMap에 key(숫자카드번호), value(갯수) 로 저장
			if (hm.containsKey(nt)) {
				hm.put(nt, hm.get(nt) + 1); // hashmap에 이미 있는 key 값이면 들어가면서 value를 +1 해줌
			} else {
				hm.put(nt, 1); // 처음 들어가는건 value 1 로 해서 들어감
			}
		}

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine()); 

		for (int i = 0; i < m; i++) {
			int nt = Integer.parseInt(st.nextToken());  // 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 m개의 정수 중 1개

			bw.write((hm.get(nt) != null ? hm.get(nt) : 0) + " "); // nt가 hashmap에 key값으로 들어가 있는 숫자이면 그 value 출력, hashmap에 없는 숫자이면(null 이면) 0 출력
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}
