package baekjoon;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class D06253 {
	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/2606 바이러스

		Scanner sc = new Scanner(System.in);

		int noOfComputer = sc.nextInt();
		int computerPair = sc.nextInt();
		int[][] pairArr = new int[computerPair][2];

		for (int i = 0; i < computerPair; i++) {
			pairArr[i][0] = sc.nextInt();
			pairArr[i][1] = sc.nextInt();
		}

		PriorityQueue<Integer> connectionListTemp = new PriorityQueue<Integer>(); // 바이러스 걸린 컴퓨터 for문 돌리고 삭제하는 용도
		ArrayList<Integer> connectionList = new ArrayList<Integer>(); // 바이러스 걸린 컴퓨터 계속 쌓일 리스트
		connectionListTemp.add(1);

		while (connectionListTemp.size() != 0) { // 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터들을 한번씩 다 확인할 때까지 반복

			int n = connectionListTemp.poll(); // poll 메서드는 값 꺼내면서 동시에 리스트에서 제거도 함
											   // 현재 다른 컴퓨터와의 연결 여부 확인하려는 바이러스 걸린 컴퓨터는 변수에 저장해 놓고
											   // connectionListTemp 에서는 삭제
			for (int i = 0; i < computerPair; i++) {
				
				// 다른 컴퓨터와의 연결 여부 확인
				// priorityQueue를 썼기때문에 배정된 번호가 작은 컴퓨터부터 연결여부를 확인하는데
				// 입력되는 배열이 작은번호, 큰번호 일 수도 있고, 큰번호, 작은번호 일 수도 있으니 if, else if 써서 둘 다 검사
				// ex) 1번 컴퓨터와의 연결 확인하는데 1,9 로 값이 입력될 수도 있고 9,1 로 입력될 수도 있음
				if (n == pairArr[i][0]) {

					if (!connectionList.contains(pairArr[i][1])) {
						connectionList.add(pairArr[i][1]);
						connectionListTemp.add(pairArr[i][1]);
					}

				} else if (n == pairArr[i][1]) {

					if (!connectionList.contains(pairArr[i][0])) {
						connectionList.add(pairArr[i][0]);
						connectionListTemp.add(pairArr[i][0]);
					}

				}
			}

		}

		// 1번은 for문 들어가기 전에 connectionListTemp 만 미리 입력되서 바로 제거됨 
		// 따라서 이후에 connectionList에 들어간 경우 제거되는 코드가 없으므로 출력할 때 1이 있다면 빼고 갯수 세서 출력
		System.out.println(connectionList.contains(1) ? connectionList.size() - 1 : connectionList.size());

		sc.close();

	}
}
