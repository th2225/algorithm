package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D06204 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/10162 전자레인지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int[] arr = { 300, 60, 10 };
		int[] min = new int[3];

		if (t % 10 != 0) { // 가장 작은 수인 10으로 나눠지지 않으면 t초를 맞출 수 없으므로 -1을 출력하고 빠져나간다
			System.out.println(-1);
		} else { // 그 외의 경우 큰 수부터 차례대로 나눠 몫이 있으면 그 몫을 배열 min에 저장한다
			for (int i = 0; i < 3; i++) {
				if (t / arr[i] != 0) {
					min[i] = t / arr[i];
					if (t % arr[i] == 0) { // 큰수로 ㅁ완전히 나누어 떨어지면 더이상 진행할 필요 없으므로 for문 빠져나감
						break;
					} else {
						t = t - t / arr[i] * arr[i];  // 그 외의 경우 t를 t - t / arr[i] * arr[i] 로 변경 후 for문 계속 진행
					}
				}
			}

			for (int i = 0; i < 3; i++) {
				System.out.print(min[i] + " ");
			}
		}
		
		br.close();
	}
}