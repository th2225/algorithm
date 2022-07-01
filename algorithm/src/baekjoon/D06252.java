package baekjoon;

import java.util.Scanner;

public class D06252 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/17478 재귀함수가 뭔가요?
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] story = { "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.",
				"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.",
				"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"", "\"재귀함수가 뭔가요?\"", "라고 답변하였지." };

		String[] storyEnd = new String[n];

		String dash = "";

		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		System.out.println("\"재귀함수가 뭔가요?\"");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < story.length; j++) {
				if (j < 3) {
					System.out.println(dash + story[j]);
				}

				if (j == 3) {
					dash += "____";
					System.out.println(dash + story[j]);
				}

				if (j == 4) {
					storyEnd[i] = dash + story[j];
				}
			}
		}

		System.out.println(dash + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");

		for (int i = n - 1; i >= 0; i--) {
			System.out.println(storyEnd[i]);
		}

		System.out.println("라고 답변하였지.");
		
		sc.close();
	}

}