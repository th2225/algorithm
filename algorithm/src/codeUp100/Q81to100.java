package codeUp100;

import java.util.HashSet;
import java.util.Scanner;

public class Q81to100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");

		// 81. 1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
		// 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다. 단, n, m은 10이하의 자연수
		// 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다. 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int n = Integer.parseInt(strArr[0]);
//		int m = Integer.parseInt(strArr[1]);
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= m; j++) {
//				System.out.println(i + " " + j);
//			}
//		}

		// 82. A, B, C, D, E, F 중 하나가 입력될 때, 1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
		// 16진수로 한 자리 수가 입력된다. 단, A ~ F 까지만 입력된다.
		// 입력된 16진수에 1~F까지 순서대로 곱한, 16진수 구구단을 줄을 바꿔 출력한다. 계산 결과도 16진수로 출력해야 한다.
//		String str = sc.next();
//		int dec = Integer.parseInt(str, 16);
//		for (int i = 1; i < 16; i++) {
//			System.out.println(str + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(dec * i).toUpperCase());
//		}

		// 83. 3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
		// 10 보다 작은 정수 1개가 입력된다. (1 ~ 9)
		// 1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데, 3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
//		int a = sc.nextInt();
//		for (int i = 1; i <= a; i++) {
//			if (i % 3 == 0) {
//				System.out.print("X ");
//			} else {
//				System.out.print(i + " ");
//			}
//		}

		// 84. 빨강(red), 초록(green), 파랑(blue) 빛을 섞어 여러 가지 빛의 색을 만들어 내려고 한다.
		// 빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수
		// 있다.)
		// 주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과 총 가짓 수를 계산해보자.
		// 빨녹파(r, g, b) 각 빛의 강약에 따른 가짓수(0 ~ 128))가 공백을 사이에 두고 입력된다.
		// 예를 들어, 3 3 3 은 각 색깔 빛에 대해서 그 강약에 따라 0~2까지 3가지의 색이 있음을 의미한다.
		// 만들 수 있는 rgb 색의 정보를 오름차순(계단을 올라가는 순, 12345... abcde..., 가나다라마...)으로
		// 줄을 바꿔 모두 출력하고, 마지막에 그 개수를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int r = Integer.parseInt(strArr[0]);
//		int g = Integer.parseInt(strArr[1]);
//		int b = Integer.parseInt(strArr[2]);
//		int cnt = 0;
//		for (int i = 0; i < r; i++) {
//			for (int j = 0; j < g; j++) {
//				for (int k = 0; k < b; k++) {
//					System.out.println(i + " " + j + " " + k);
//					cnt ++;
//				}
//			}
//		}
//		System.out.println(cnt);

		// 85. 소리 파일 저장용량 계산하기
		// h, b, c, s 가 공백을 두고 입력된다.
		// h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
		// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
		// 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int h = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//		int s = Integer.parseInt(strArr[3]);
//
//		long bit = (long) h * b * c * s;
//		System.out.println(Math.round((bit / 8.0f / 1024.0f / 1024.0f) * 10.0f) / 10.0f + " MB");

		// 86. w, h, b 가 공백을 두고 입력된다.
		// 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
		// 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
		// 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int w = Integer.parseInt(strArr[0]);
//		int h = Integer.parseInt(strArr[1]);
//		int b = Integer.parseInt(strArr[2]);
//
//		long bit = (long) w * h * b;
//		System.out.println(Math.round((bit / 8.0f / 1024.0f / 1024.0f) * 100.0f) / 100.0f + " MB");

		// 87. 언제까지 합을 계산할 지, 정수 1개를 입력받는다.
		// 단, 입력되는 자연수는 100,000,000이하이다.
		// 1, 2, 3, 4, 5 ... 순서대로 계속 더해가다가, 그 합이 입력된 정수보다 커지거나 같아지는 경우,
		// 그때까지의 합을 출력한다.
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i < n; i++) {
//			if (sum >= n) {
//				System.out.println(sum);
//				break;
//			} else {
//				sum += i;
//			}
//		}

		// 88. 정수 1개를 입력받는다. (1 ~ 100)
		// 1부터 입력한 정수보다 작거나 같을 때까지 1씩 증가시켜 출력하되 3의 배수는 출력하지 않는다
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			if (i % 3 != 0) {
//				System.out.print(i + " ");
//			}
//		}

		// 89. 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 100)
		// n번째 수를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int d = Integer.parseInt(strArr[1]);
//		int n = Integer.parseInt(strArr[2]);

//		for (int i = 2; i <= n; i++) {  // 첫번째 수는 a값(시작값)이 그대로 있어야 하므로 i=2 부터 시작
//			a += d;
//		}
//		System.out.println(a);

		// 90. 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가 공백을 두고 입력된다.(모두 0 ~ 10)
		// n번째 수를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int r = Integer.parseInt(strArr[1]);
//		int n = Integer.parseInt(strArr[2]);
//
//		for (int i = 2; i <= n; i++) {
//			a *= r;
//		}
//		System.out.println(a);

		// 91. 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째 인지를 나타내는 정수(n)가
		// 공백을 두고 입력된다.(a, m, d는 -50 ~ +50, n은 10이하의 자연수)
		// n번째 수를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int m = Integer.parseInt(strArr[1]);
//		int d = Integer.parseInt(strArr[2]);
//		int n = Integer.parseInt(strArr[3]);
//
//		for (int i = 2; i <= n; i++) {
//			a *= m;
//			a += d;
//		}
//		System.out.println(a);

		// 92. 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는, 방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의
		// 자연수이다.)
		// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날(동시 가입/등업 후 며칠 후?)을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//
//		for (int i = 1; i < 100; i++) {
//			if (i % a == 0 && i % b == 0 && i % c == 0) {
//				System.out.println(i);
//				break;
//			}
//		}

		// 93. 첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
		// 두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.
		// 1번부터 번호가 불린 횟수를 순서대로 공백으로 구분하여 한 줄로 출력한다.
//		int n = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		String str = sc2.nextLine();
//		String[] strArr = str.split(" ");
//		int[] howMany = new int[23];
//		for (int i = 0; i < strArr.length; i++) {
//			howMany[Integer.parseInt(strArr[i])] += 1;
//		}
//		
//		for(int i=1; i<howMany.length; i++) {
//			System.out.print(howMany[i] + " ");
//		}
//		
//		sc2.close();

		// 94. 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
		// n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
		// 출석을 부른 번호 순서를 바꾸어 공백을 두고 출력한다.
//		int n = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		String str = sc2.nextLine();
//		String[] strArr = str.split(" ");
//
//		for (int i = strArr.length - 1; i >= 0; i--) {
//			System.out.print(strArr[i] + " ");
//		}
//		
//		sc2.close();

		// 95. 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
		// n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
		// 출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
//		int n = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		String str = sc2.nextLine();
//		String[] strArr = str.split(" ");
//		int min = 23;
//
//		for (int i = 0; i < strArr.length; i++) {
//			if (Integer.parseInt(strArr[i]) < min) {
//				min = Integer.parseInt(strArr[i]);
//			}
//		}
//		System.out.println(min);
//		
//		sc2.close();

		// 96. 바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
		// 둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
		// n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.
		// 흰 돌이 올려진 바둑판의 상황을 출력한다.
		// 흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.
//		int n = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		int[][] intArr = new int[19][19];
//		for (int i = 0; i < n; i++) {
//			String str = sc2.nextLine();
//			String[] strArr = str.split(" ");
//			intArr[Integer.parseInt(strArr[0])-1][Integer.parseInt(strArr[1])-1] = 1;
//		}
//
//		for (int i = 0; i < 19; i++) {
//			for (int j = 0; j < 19; j++) {
//				System.out.print(intArr[i][j] + " ");
//			}
//			System.out.println("");
//		}
//		
//		sc2.close();

		// 97. 바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
		// 십자 뒤집기 횟수(n)가 입력된다.
		// 십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
		// 십자 뒤집기 결과를 출력한다.
//		int[][] intArr = new int[19][19];
//		for (int i = 0; i < 19; i++) {
//			for (int j = 0; j < 19; j++) {
//				intArr[i][j] = sc.nextInt();
//			}
//		}
//		int n = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		for (int j = 0; j < n; j++) {
//			String str = sc2.nextLine();
//			String[] strArr = str.split(" ");
//
//			for (int i = 0; i < 19; i++) {
//				if (intArr[Integer.parseInt(strArr[0]) - 1][i] == 0) {
//					intArr[Integer.parseInt(strArr[0]) - 1][i] = 1;
//				} else {
//					intArr[Integer.parseInt(strArr[0]) - 1][i] = 0;
//				}
//				if (intArr[i][Integer.parseInt(strArr[1]) - 1] == 0) {
//					intArr[i][Integer.parseInt(strArr[1]) - 1] = 1;
//				} else {
//					intArr[i][Integer.parseInt(strArr[1]) - 1] = 0;
//				}
//			}
//		}
//
//		for (int i = 0; i < 19; i++) {
//			for (int j = 0; j < 19; j++) {
//				System.out.print(intArr[i][j] + " ");
//			}
//			System.out.println("");
//		}
//		
//		sc2.close();

		// 98. 첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
		// 두 번째 줄에 놓을 수 있는 막대의 개수(n)
		// 세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
		// 입력값의 정의역은 다음과 같다.
		// 1 <= w, h <= 100
		// 1 <= n <= 10
		// d = 0(가로) or 1(세로)
		// 1 <= x <= 100-h
		// 1 <= y <= 100-w
		// 모든 막대를 놓은 격자판의 상태를 출력한다.
		// 막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
		// 단, 각 숫자는 공백으로 구분하여 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int[][] board = new int[Integer.parseInt(strArr[0])][Integer.parseInt(strArr[1])];
//
//		int n = sc.nextInt();
//
//		Scanner sc2 = new Scanner(System.in);
//
//		for (int i = 0; i < n; i++) {
//			String str2 = sc2.nextLine();
//			String[] strArr2 = str2.split(" ");
//			int l = Integer.parseInt(strArr2[0]);
//			int d = Integer.parseInt(strArr2[1]);
//			int x = Integer.parseInt(strArr2[2]) - 1;  // 좌표는 1,1 부터인데 배열은 0,0 부터라 좌표값에서 1씩 빼줌 
//			int y = Integer.parseInt(strArr2[3]) - 1;
//
//			if (d == 0) {
//				for (int j = 0; j < l; j++) {
//					board[x][y + j] = 1;
//				}
//			} else {
//				for (int j = 0; j < l; j++) {
//					board[x + j][y] = 1;
//				}
//			}
//		}
//
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println("");
//		}

		// 99. 10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
		// 성실한 개미가 이동한 경로를 9로 표시해 출력한다.
		int[][] maze = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				maze[i][j] = sc.nextInt();
			}
		}

		int x = 1;
		int y = 1;

		for (int i = 0; i <= 8; i++) {
			System.out.println(x + ", " + (y+i));
			if (maze[x][y + i] == 2 || (x == 9 && y == 9)) {
				maze[x][y + i] = 9;
				break;
			} else if (maze[x][y + i] == 0) {
				maze[x][y + i] = 9;
			} else {
				x++;
				i-=2;
			}
		}

		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}