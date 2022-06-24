package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class D06214 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1715 카드 정렬하기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++) {
			pq.add(Integer.parseInt(br.readLine())); // 프라이오리티큐는 값을 넣으면 우선 순위순(오름차순)으로 정렬해줌
		}

		int sum = 0;

		while (pq.size() != 1) { // 프라이오리티큐 배열의 값이 1개만 남을 때까지 앞에꺼 두개 더해서 다시 배열로 넣음
			int a = pq.poll();
			int b = pq.poll();
			sum += a + b; // 최소합계 구하기 위해 더한 값은 sum 값에 계속 추가해서 더해줌
			pq.add(a+b);
		}
		
		System.out.println(sum);
		
		br.close();

	}

}
