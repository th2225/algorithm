package codeUp100;

import java.util.Scanner;

public class Q21to40 {
	public static void main(String[] args) {
		// 21. 단어 1개 입력받아 그대로 출력하기
		Scanner sc = new Scanner(System.in);

//		System.out.println("단어 입력 : ");
//		String word = sc.next();
//		System.out.println(word);

		// 22. 문장 1개 입력받아 그대로 출력하기
//		System.out.println("문장 입력 : ");
//		String para = sc.nextLine();
//		System.out.println(para);

		// 23. 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
		// 실수 1개가 입력된다. (단, 입력값은 절댓값이 10000을 넘지 않으며, 소수점 이하 자릿수는 최대 6자리까지이고 0이 아닌 숫자로
		// 시작한다.)
		// 첫 번째 줄에 정수 부분을, 두 번째 줄에 실수 부분을 출력한다.
//		System.out.println("실수 입력 : ");
//		String no = sc.next();
//		String[] noArr = no.split("\\.");
//		System.out.println(noArr[0] + "\n" + noArr[1]);

		// 24. 단어 1개 입력받아 나누어 출력하기
		// 단어(영어) 하나를 입력받는다. (단, 단어의 길이는 20자 이하이다.)
		// 단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩 ' '로 묶어서 출력한다.
//		System.out.println("단어 입력 : ");
//		String word = sc.next();
//		char[] c = word.toCharArray();
//		for (int i = 0; i < c.length; i++) {
//			System.out.println("\'" + c[i] + "\'");
//		}

		// 25. 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
		// 다섯 자리로 이루어진 1개의 정수를 입력받는다. (단, 10,000 <= 입력받는 수 <= 99,999 )
		// 각 자리의 숫자를 분리해 한 줄에 하나씩 [ ]속에 넣어 출력한다.
//		System.out.println("5자리 정수 입력 : ");
//		int no = sc.nextInt();
//		System.out.println("[" + no / 10000 * 10000 + "]\n[" + no % 10000 / 1000 * 1000 + "]\n[" + no % 1000 / 100 * 100
//				+ "]\n[" + no % 100 / 10 * 10 + "]\n[" + no % 10 + "]");

		// 26. 시분초 입력받아 분만 출력하기
		// 시 분 초가 시:분:초 형식으로 입력된다.
		// 분만 출력한다.
//		System.out.println("시:분:초 입력 : ");
//		String time = sc.next();
//		String[] timeArr = time.split(":");
//		System.out.println(timeArr[1]);

		// 27. 년월일(yyyy.mm.dd)를 입력받아, 일월년(dd-mm-yyyy)로 출력해보자.(단, 한 자리 일/월은 0을 붙여 두자리로,
		// 년도도 0을 붙여 네자리로 출력한다.)
		// 년월일이 '.'(닷)으로 구분되어 입력된다.
		// 년월일을 일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다
//		System.out.println("년.월.일 입력 : ");
//		String date = sc.next();
//		String[] dateArr = date.split("\\.");
//		int y = Integer.parseInt(dateArr[0]);
//		int m = Integer.parseInt(dateArr[1]);
//		int d = Integer.parseInt(dateArr[2]);
//
//		DecimalFormat dfy = new DecimalFormat("0000");
//		DecimalFormat dfmd = new DecimalFormat("00");
//
//		System.out.println(dfmd.format(d) + "-" + dfmd.format(m) + "-" + dfy.format(y));

		// 28. 정수 1개를 입력받아 그대로 출력해보자. (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)
//		System.out.println("정수 입력 : ");
//		Long l = sc.nextLong();
//		System.out.println(l);

		// 29. 실수 1개를 입력받아 그대로 출력해보자. (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
//		System.out.println("실수 입력 : ");
//		Double d = sc.nextDouble();
//		System.out.println(d);

		// 30. 정수 1개를 입력받아 그대로 출력해보자. 단, 입력되는 정수의 범위는 -9,223,372,036,854,775,808 ~
		// +9,223,372,036,854,775,807 이다.
//		System.out.println("정수 입력 : ");
//		long l = sc.nextLong();
//		System.out.println(l);

		// 31. 10진수를 입력받아 8진수(octal)로 출력해보자. 단, 입력되는 정수는 int 범위이다.
//		System.out.println("10진수 입력 : ");
//		int no = sc.nextInt();
//		String octal = Integer.toOctalString(no);
//		System.out.println(octal);

		// 32. 10진 정수 입력받아 16진수(소문자)로 출력하기
//		System.out.println("10진수 입력 : ");
//		int no = sc.nextInt();
//		String hex = Integer.toHexString(no);
//		System.out.println(hex);

		// 33. 10진 정수 입력받아 16진수(대문자)로 출력하기
//		System.out.println("10진수 입력 : ");
//		int no = sc.nextInt();
//		String hex = Integer.toHexString(no);
//		System.out.println(hex.toUpperCase());

		// 34. 8진 정수 1개 입력받아 10진수로 출력하기
//		System.out.println("8진수 입력 : ");
//		String no = sc.next();
//		int dec = Integer.valueOf(no, 8);
//		System.out.println(dec);

		// 35. 16진 정수 1개 입력받아 8진수로 출력하기
//		System.out.println("16진수 입력 : ");
//		String no = sc.next();
//		int dec = Integer.valueOf(no, 16); // 16 -> 10 변환
//		String oct = Integer.toOctalString(dec); // 10 -> 8 변환
//		System.out.println(oct);

		// 36. 영문자 1개 입력받아 10진수로 출력하기
//		System.out.println("영문자 입력 : ");
//		char c = sc.next().charAt(0);
//		int asc = (int) c;
//		System.out.println(asc);

		// 37. 10진 정수 1개를 입력받아 아스키 문자로 출력해보자. 단, 0 ~ 255 범위의 정수만 입력된다.
//		System.out.println("정수 입력 : ");
//		int no = sc.nextInt();
//		char c = (char)no;
//		System.out.println(c);

		// 38. 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자. (단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
		// 2개의 정수가 공백으로 구분되어 입력된다. ** 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
//		System.out.println("정수 입력 : ");
//		String a = sc.nextLine();
//		String[] aArr = a.split(" ");
//		System.out.println((long)Integer.parseInt(aArr[0]) + Integer.parseInt(aArr[1])); // int + int는 int 이므로 long이 되려면 하나를 long으로 변환해야 한다.

		// 39. 정수 2개를 입력받아 합을 출력해보자. 단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
		// 2개의 정수가 공백으로 구분되어 입력된다.
//		System.out.println("정수 입력 : ");
//		String a = sc.nextLine();
//		String[] aArr = a.split(" ");
//		System.out.println(Long.parseLong(aArr[0]) + Long.parseLong(aArr[1]));

		// 40. 입력된 정수의 부호를 바꿔 출력해보자. 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
		System.out.println("정수 입력 : ");
		long l = sc.nextLong();
		System.out.println(-l);

		
		sc.close();
	}

}
