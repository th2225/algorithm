package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D06211 {
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/13305 주유소
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int n = Integer.parseInt(br.readLine());
		int[] distance = new int[n - 1];
		int[] price = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n - 1; i++) {
			distance[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}

		int minPricePerLiter = price[0];
		
		// 1리터당 가격과 도시간 거리의 최대값이 1,000,000,000 이므로 곱하고 합한값은 int의 범위를 넘어감, 따라서 변수를 long형으로 만듦
		long gasToFill = distance[0];
		long minPriceTotal = 0l;

		for (int i = 1; i < n; i++) {
			if (i == n - 1) { // 마지막 도시의 주유가격은 무시해도 되므로 i가 n-1이면 최소 주유금액 계산하고 for문 바로 빠져나감
				minPriceTotal += minPricePerLiter * gasToFill;
				break;
			} else { // i가 n-1 이 아닌 경우에는 최소 주유가격과 다음 도시들의 주유 가격을 비교해
				if (minPricePerLiter > price[i]) { // 최소 주유가격이 다음 도시 주유 가격보다 높으면 
					minPriceTotal += minPricePerLiter * gasToFill; // 다음 도시까지의 거리만 현재 최소 가격으로 주유
					minPricePerLiter = price[i]; // 최소 주유가격은 다음 도시의 주유가격으로 변경
					gasToFill = distance[i]; // 누적거리 초기화
				} else { //  최소 주유가격이 낮으면 
					gasToFill += distance[i]; // 다음 도시까지의 거리를 누적거리로 저장
				}
			}
		}

		System.out.println(minPriceTotal);

		br.close();

	}

}