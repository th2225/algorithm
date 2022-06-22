package codeUp100;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");

		// 10. 정수 1개 입력받아 그대로 출력하기
//		int a = sc.nextInt();
//		System.out.println(a);

		// 13. 정수 2개 입력받아 그대로 출력하기
//		String str = sc.nextLine();
//		System.out.println(str);

		// 14. 문자 2개 입력받아 순서 바꿔 출력하기
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		char c = arr[0].charAt(0);
//		char d = arr[1].charAt(0);
//		System.out.println(d + " " + c);

		// 15. 실수 입력받아 둘째 자리까지 출력하기
//		float f = sc.nextFloat();
//		System.out.println(Math.round(f * 100f) / 100f);

		// 19. 연월일 입력받아 그대로 출력하기
//		String str = sc.next();
//		String[] arr = str.split("\\.");
//		int year = Integer.parseInt(arr[0]);
//		int month = Integer.parseInt(arr[1]);
//		int date = Integer.parseInt(arr[2]);
//		DecimalFormat df = new DecimalFormat("00");
//		System.out.println(year + "." + df.format(month) + "." + df.format(date));

		// 31. 10진 정수 1개 입력받아 8진수로 출력하기
//		int dec = sc.nextInt();
//		String oct = Integer.toOctalString(dec);
//		System.out.println(oct);

		// 34. 8진 정수 1개 입력받아 10진수로 출력하기
//		String oct = sc.next();
//		int dec = Integer.valueOf(oct, 8);
//		System.out.println(dec);

		// 36. 영문자 1개 입력받아 10진수로 출력하기
//		char c = sc.next().charAt(0);
//		System.out.println((int)c);

		// 39. 정수 2개 입력받아 합 출력하기2
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		long a = Long.parseLong(arr[0]);
//		long b = Long.parseLong(arr[1]);
//		System.out.println(a + b);
		
		// 45. 정수 2개 입력받아 자동 계산하기
		// 첫 줄에 합
		// 둘째 줄에 차,
		// 셋째 줄에 곱,
		// 넷째 줄에 몫,
		// 다섯째 줄에 나머지,
		// 여섯째 줄에 나눈 값을 순서대로 출력한다.
		// (실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		int a = Integer.parseInt(arr[0]);
//		int b = Integer.parseInt(arr[1]);
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
//		System.out.println(Math.round(a*100f/b)/100f);
		
		// 47. 정수 1개 입력받아 2배 곱해 출력하기(비트시프트연산)
//		int i = sc.nextInt();
//		System.out.println(i<<1);
		
		// 59. 비트단위로 NOT 하여 출력하기
//		int i = sc.nextInt();
//		System.out.println(~i);
		
		// 60. 비트단위로 AND 하여 출력하기
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		int a = Integer.parseInt(arr[0]);
//		int b = Integer.parseInt(arr[1]);
//		System.out.println(a&b);
		
		// 61. 비트단위로 OR 하여 출력하기
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		int a = Integer.parseInt(arr[0]);
//		int b = Integer.parseInt(arr[1]);
//		System.out.println(a|b);
		
		// 62. 비트단위로 XOR 하여 출력하기
//		String str = sc.nextLine();
//		String[] arr = str.split(" ");
//		int a = Integer.parseInt(arr[0]);
//		int b = Integer.parseInt(arr[1]);
//		System.out.println(a^b);
		
		// 69. 평가 입력받아 다르게 출력하기
		// 평가 : 내용
		// A : best!!!
		// B : good!!
		// C : run!
		// D : slowly~
		// 나머지 문자들 : what?
		char grade = sc.next().charAt(0);
		switch (grade) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
		
		sc.close();
	}
}
