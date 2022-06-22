package codeUp100;

import java.util.Scanner;

public class Q01to20 {
	public static void main(String[] args) {

		// 01. 다음 단어를 출력하시오. Hello
		System.out.println("hello");

		// 02. 이번에는 공백()을 포함한 문장을 출력한다. Hello World
		System.out.println("Hello World");

		// 03. 이번에는 줄을 바꿔 출력하는 출력문을 연습해보자. 다음과 같이 줄을 바꿔 출력해야 한다.
		// Hello
		// World
		System.out.println("Hello\nWorld");

		// 04. 이번에는 작은 따옴표(single quotation mark)가 들어있는 특수한 형태의 출력문에 대한 연습을 해보자. 'Hello'
		System.out.println("\'Hello\'");

		// 05. 이번에는 큰따옴표(double quotation mark)가 포함된 출력문을 연습해보자. "Hello World"
		System.out.println("\"Hello World\"");

		// 06. 다음 문장을 출력하시오. "!@#$%^&*()"
		System.out.println("\"!@#$%^&*()\"");

		// 07. 다음 경로를 출력하시오. "C:\Download\hello.cpp"
		System.out.println("\"C:\\Download\\hello.cpp\"");

		// 08. 키보드로 입력할 수 없는 다음 모양을 출력해보자.
		// ┌┬┐
		// ├┼┤
		// └┴┘
		System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518");

		// 10. 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 :");
//		int i = sc.nextInt();
//		System.out.println(i);

		// 11. 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력해보자.
//		System.out.print("문자 입력 : ");
//		char c = sc.next().charAt(0);
//		System.out.println(c);

		// 12. 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
//		System.out.print("실수 입력 : ");
//		float f = sc.nextFloat();
//		System.out.println(f);

		// 13. 정수(int) 2개를 입력받아 그대로 출력해보자.
//		System.out.println("정수 입력 : ");
//		int a = sc.nextInt();
//		System.out.println("정수 입력 : ");
//		int b = sc.nextInt();
//		System.out.println(a + "," + b);

		// 14. 2개의 문자를 입력받아서 순서를 바꿔 출력해보자.
//		System.out.println("문자 입력 : ");
//		char a = sc.next().charAt(0);
//		System.out.println("문자 입력 : ");
//		char b = sc.next().charAt(0);
//		System.out.println(b + "," + a);

		// 15. 실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지
		// 출력하시오.
//		System.out.println("실수 입력 : ");
//		float f = sc.nextFloat();
//		System.out.println(Math.round(f*100)/100f);

		// 17. int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.
//		System.out.println("정수 입력 : ");
//		int i = sc.nextInt();
//		System.out.println(i + " " + i + " " + i);

		// 18. 시간 입력받아 그대로 출력하기
//		System.out.println("시간 입력 : ");
//		String time = sc.next();
//		System.out.println(time);

		// 19. 연월일 입력받아 그대로 출력하기
		// 연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
		// 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다. 한 자리 수인 경우 앞에 0을 붙여 출력한다.
//		System.out.println("날짜 입력 : ");
//		String now = sc.next();
//		String[] dateArr = now.split("\\.");
//		DecimalFormat df = new DecimalFormat("00");
//		int year = Integer.parseInt(dateArr[0]);
//		int month = Integer.parseInt(dateArr[1]);
//		int date = Integer.parseInt(dateArr[2]);
//		System.out.println(year + "." + df.format(month) + "." + df.format(date));

		// 20. 주민번호를 입력받아 형태를 바꿔 출력해보자. '-'를 제외한 주민번호 13자리를 모두 붙여 출력한다.
		System.out.println("주민번호 입력 : ");
		String idno = sc.next();
		String idno2 = idno.replace("-", "");
		System.out.println(idno2);

		sc.close();
	}

}
