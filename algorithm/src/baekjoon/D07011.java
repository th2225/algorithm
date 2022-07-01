package baekjoon;

import java.util.Scanner;

public class D07011 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/16953 A → B
		
		// a를 b로 만드는 방법은 a의 끝자리에 1을 더하거나 a*2를 하는 방법뿐이므로 b의 끝자리는 1 또는 짝수만 와야한다(1이외에 다른 홀수가 오면 만들 수 없는 숫자)	
		// b를 a로 만드는 최단 경로 == a로 b만드는 최단 경로 
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int countSum = 1;

			
		while (a != b) {
			int alength = (int) (Math.log10(a) + 1); // 정수 a의 자리수 구하기
			int blength = (int) (Math.log10(b) + 1); // 정수 b의 자리수 구하기

			if (alength < blength) { // a의 끝에 1더해서 b 만드는 것은 b의 자리수가 a보다 클 때만 가능하므로 자리수 비교
				if (b % 10 == 1) { // b의 끝자리가 1이면 끝자리 1 빼서 자리수 줄이고 연산 횟수 ++
					b = b / 10;
					countSum++;
				} else if (b % 2 == 0) { // b의 끝자리가 짝수면 2로 나눠 숫자 줄이고 연산 횟수 ++
					b = b / 2;
					countSum++;
				} else { // b의 끝자리가 1 또는 짝수가 아닌 경우 못만드는 숫자이므로 연산 횟수 -1로 주고 반복문 빠져나가기
					countSum = -1;
					break;
				}
			} else if (alength == blength) { // a와 b의 자리수가 같은 경우는 *2 해서 만들 수 밖에 없음 == b는 짝수여야함
				if (b % 2 == 0 && b >= a) { // b가 짝수이고 b가 a보다 크거나 같은 경우
					b = b / 2; // 2로 나누고 연산 횟수 ++
					countSum++;
				} else { // 그렇지 않은 경우(b가 홀수인 경우)
					countSum = -1; // 만들 수 없는 숫자이므로 연산횟수 -1로 주고 반복문 빠져나가기
					break;
				}
			} else { // 위쪽의 if, else if문 거친 후 b의 자리수가 a의 자리수보다 작아지는 경우 만들 수 없는 숫자이므로 연산횟수 -1로 주고 반복문 빠져나가기
				countSum = -1;
				break;
			}
		}

		System.out.println(countSum);

		sc.close();

	}

}
