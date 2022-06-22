package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D06203 {
	public static void main(String[] args) throws IOException {
		// https://www.acmicpc.net/problem/2217 로프

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] maxWeightPerN = new int[N];

		for (int i = 0; i < N; i++) {
			maxWeightPerN[i] = Integer.parseInt(br.readLine());
		}

//		가장 큰수부터의 범위 차이만큼을 숫자에 곱한값이 가장 큰게 최대 무게....(말로 설명하기가 너무 어렵다)
//		ex) 1 3 5 7 9 가 있으면 1*5  3*4  5*3  7*2  9*1  중 가장 큰 값이 로프들을 이용하여 들 수 있는 최대 무게
//		    따라서 위 예제의 경우 15가 최대 무게
		Arrays.sort(maxWeightPerN); // 따라서 로프당 들 수 있는 무게값 정렬 필요

		int maxWeight = 0;
		for (int i = 0; i < N; i++) { 
			if (maxWeightPerN[i] * (N - i) > maxWeight) { // 각각의 숫자에 큰수까지의 차이값 곱해서 그 값이 이전 값과 비교해 더 크다면 최대무게로 저장
				maxWeight = maxWeightPerN[i] * (N - i);
			}
		}
		System.out.println(maxWeight);

		br.close();
	}

}