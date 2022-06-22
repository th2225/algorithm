package codeUp100;

import java.util.Scanner;

public class Q61to80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");

		// 61. 입력된 정수 두 개를 비트단위로 or 연산한 후 그 결과를 정수로 출력해보자.
		// 2개의 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
		// 두 정수를 비트단위(bitwise)로 or 계산을 수행한 결과를 10진수로 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);		
//		System.out.println(a|b);  // 비트단위(bitwise) 연산자 |(or, vertical bar, 버티컬바)를 사용하면 된다.

		// 62. 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
		// 2개의 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
		// 두 정수를 비트단위(bitwise)로 xor 계산을 수행한 결과를 10진수로 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a^b); // 비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.

		// 63. 입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자. 단, 조건문을 사용하지 않고 3항 연산자를 사용한다.
		// 2개의 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
		// 두 정수 중 큰 값을 10진수로 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a > b ? a : b);

		// 64. 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자. 단, 조건문을 사용하지 않고 3항 연산자를 사용한다.
		// 3개의 정수가 공백으로 구분되어 입력된다. -2147483648 ~ +2147483648
		// 가장 작은 값을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//		System.out.println(a > b ? (b > c ? c : b) : (a > c ? c : a));

		// 65. 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
		// 세 정수 a, b, c 가 공백을 두고 입력된다.
		// 짝수만 순서대로 줄을 바꿔 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//		if (a % 2 == 0) {
//			System.out.println(a);
//		}
//		if (b % 2 == 0) {
//			System.out.println(b);
//		}
//		if (c % 2 == 0) {
//			System.out.println(c);
//		}

		// 66. 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
		// 세 정수 a, b, c 가 공백을 두고 입력된다. 0 <= a, b, c <= +2147483647
		// 입력된 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//		if (a % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		if (b % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}
//		if (c % 2 == 0) {
//			System.out.println("even");
//		} else {
//			System.out.println("odd");
//		}

		// 67. 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
		// 정수 1개가 입력된다. -2147483648 ~ +2147483647, 단 0은 입력되지 않는다.
		// 입력된 정수에 대해 첫 줄에 minus 나 plus 를 출력하고, 두 번째 줄에 odd 나 even 을 출력한다.
//		int i = sc.nextInt();
//		if (i > 0) {
//			System.out.println("plus");
//			if (i % 2 == 0) {
//				System.out.println("even");
//			} else {
//				System.out.println("odd");
//			}
//		} else {
//			System.out.println("minus");
//			if (i % 2 == 0) {
//				System.out.println("even");
//			} else {
//				System.out.println("odd");
//			}
//		}

		// 68. 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
		// 정수(0 ~ 100) 1개가 입력된다.
		// 평가 결과를 출력한다.
		// 평가 기준
		// 90 ~ 100 : A
		// 70 ~ 89 : B
		// 40 ~ 69 : C
		// 0 ~ 39 : D
//		int i = sc.nextInt();
//
//		if (i >= 90 && i <= 100) {
//			System.out.println("A");
//		} else if (i >= 70 && i <= 89) {
//			System.out.println("B");
//		} else if (i >= 40 && i <= 69) {
//			System.out.println("C");
//		} else {
//			System.out.println("D");
//		}

		// 69. 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
		// 영문자 1개가 입력된다.(A, B, C, D 등의 한 문자가 입력된다.)
		// 평가내용에 따라 다른 내용이 출력된다.
		// 평가 내용
		// A : best!!!
		// B : good!!
		// C : run!
		// D : slowly~
		// 나머지 문자들 : what?
//		String str = sc.next();
//		switch (str) {
//		case "A":
//			System.out.println("best!!!");
//			break;
//		case "B":
//			System.out.println("good!!!");
//			break;
//		case "C":
//			System.out.println("run!");
//			break;
//		case "D":
//			System.out.println("slowly~");
//			break;
//		default:
//			System.out.println("what?");
//			break;
//		}

		// 70. 월이 입력될 때 계절 이름이 출력되도록 해보자.
		// 월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
		// 계절 이름을 출력한다.
		// 12, 1, 2 : winter
		// 3, 4, 5 : spring
		// 6, 7, 8 : summer
		// 9, 10, 11 : fall

//		int i = sc.nextInt();

		// ## if문
//		if (i == 12 || i == 1 || i == 2) {
//			System.out.println("winter");
//		} else if (i == 3 || i == 4 || i == 5) {
//			System.out.println("spring");
//		} else if (i == 6 || i == 7 || i == 8) {
//			System.out.println("summer");
//		} else if (i == 9 || i == 10 || i == 11){
//			System.out.println("fall");
//		}

		// ## switch-case문
//		switch (i) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("winter");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("spring");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("summer");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("fall");
//			break;
//		}

		// 71. 정수가 순서대로 입력된다. -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
		// 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자. while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.
		// ** 자바에선 while( ), for( ), do~while( ) 써야함
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//
//		for (int i = 0; i < strArr.length; i++) {
//			if (Integer.parseInt(strArr[i]) != 0) {
//				System.out.println(strArr[i]);
//			} else {
//				break;
//			}
//		}

		// 72. n개의 정수가 순서대로 입력된다. -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다. n개의 입력된
		// 정수를 순서대로 출력해보자.
		// 첫 줄에 정수의 개수 n이 입력되고, 두 번째 줄에 n개의 정수가 공백을 두고 입력된다.
		// n개의 정수를 한 개씩 줄을 바꿔 출력한다.
//		int a = sc.nextInt();
//		
//		Scanner sc2 = new Scanner(System.in); // 스캐너 하나가지고 두줄로 입력이 안돼서 두개 만듦. 하나가지고는 안되는건가...???
//		System.out.println("입력 : ");
//		String str = sc2.nextLine();
//		String[] strArr = str.split(" ");
//		
//		for (int i = 0; i < a; i++) {
//			System.out.println(strArr[i]);
//		}
//
//		sc2.close();

		// 73. 자바에는 goto 가 없어서 71번이랑 풀이가 똑같으므로 패스

		// 74. 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		// 정수 1개가 입력된다.(1 ~ 100)
		// 1씩 줄이면서 한 줄에 하나씩 1이 될 때까지 출력한다. 예) 입력 5 출력 5 4 3 2 1
//		int a = sc.nextInt();
//
//		while (a != 0) {
//			System.out.println(a);
//			a--;
//		}

		// 75. 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
		// 정수 1개가 입력된다.(1 ~ 100)
		// 1씩 줄이면서 한 줄에 하나씩 0이 될 때까지 출력한다. 예) 입력 5 출력 4 3 2 1 0
//		int a = sc.nextInt();
//
//		while (a > 0) {
//			a--;
//			System.out.println(a);
//		}

		// 76. 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
		// 영문자 1개가 입력된다. (a ~ z)
		// a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
//		char c = sc.next().charAt(0);
//		for(int i = 97; i<=c; i++) {
//			System.out.print((char)i + " ");
//		}

		// 77. 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
		// 정수 1개가 입력된다.(0 ~ 100)
		// 0부터 그 수까지 줄을 바꿔 한 개씩 출력한다.
//		int a = sc.nextInt();
//
//		for (int i = 0; i <= a; i++) {
//			System.out.println(i);
//		}

		// 78. 정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
		// 정수 1개가 입력된다.(0 ~ 100)
		// 1부터 입력된 수까지 짝수의 합을 출력한다.
//		int a = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= a; i++) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// 79. 'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
		// 문자들이 1개씩 계속해서 입력된다.
		// 'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
//		while (sc.hasNext()) {
//			String str = sc.next();
//			if (str.equals("q")) {
//				break;
//			}
//			System.out.println(str);
//		}

		// 80. 1, 2, 3 ... 을 계속 더해 나갈 때, 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지 계속 더하는 프로그램을 작성해보자.
		// 정수 1개가 입력된다.
		// 1, 2, 3, 4, 5 ... 를 순서대로 계속 더해 합을 만들어가다가, 입력된 정수와 같거나 커졌을 때, 마지막에 더한 정수를 출력한다.
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < a; i++) {
			sum += i;
			if (sum >= a) {
				System.out.println(i);
				break;				
			} 
		}
		
		sc.close();

	}

}
