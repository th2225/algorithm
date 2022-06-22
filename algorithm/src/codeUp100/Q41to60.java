package codeUp100;

import java.util.Scanner;

public class Q41to60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");

		// 41. 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
//		char c = sc.next().charAt(0);		
//		System.out.println((char)(c+1));

		// 42. 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자. 단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.
		// 정수 2개(a, b)가 공백을 두고 입력된다.
		// a를 b로 나눈 몫을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a/b);

		// 43. 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자. 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
		// 정수 2개(a, b)가 공백을 두고 입력된다.
		// a 를 b로 나눈 나머지를 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a%b);

		// 44. 정수를 1개 입력받아 1만큼 더해 출력해보자. 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
//		long l = sc.nextInt();
//		System.out.println(l+1);

		// 45. 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자. 단 0 <= a, b <= 2147483647, b는 0이 아니다.
		// 정수 2개가 공백을 두고 입력된다.
		// 첫 줄에 합, 둘째 줄에 차, 셋째 줄에 곱, 넷째 줄에 몫, 다섯째 줄에 나머지, 여섯째 줄에 나눈 값을 순서대로 출력한다.(실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println((a + b) + "\n" + (a - b) + "\n" + (a * b) + "\n" + (a / b) + "\n" + (a % b) + "\n" + Math.round(a*100.0f / b)/100.0f );

		// 46. 정수 3개를 입력받아 합과 평균을 출력해보자. 단, -2147483648 ~ +2147483647
		// 정수 3개가 공백을 두고 입력된다.
		// 합과 평균을 줄을 바꿔 출력한다. 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		int c = Integer.parseInt(strArr[2]);
//		System.out.println((a + b + c) + "\n" + Math.round((a + b + c) * 10.0f / 3.0f) / 10.0f);
		
		// 47. 정수 1개 입력받아 2배 곱해 출력하기
		// 정수 한 개가 입력된다. 단, -1073741824 ~ +1073741823
		// 2배 곱한 정수를 출력한다.
//		int i = sc.nextInt();
//		System.out.println(i<<1); // 쉬프트 연산자 이용
//		System.out.println(i*2);
		
		// 48. 정수 2개(a, b)를 입력받아 a를 2^b배 곱한 값으로 출력해보자. 0 <= a <= 10, 0 <= b <= 10
		// 정수 2개가 공백을 두고 입력된다.
		// a 를 2^b배 만큼 곱한 값을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a * (2 << b-1)); // 2^2이 2<<1 이기때문에 2^b가 되려면 2<<b-1이 되어야 한다
		
		// 49. 두 정수(a, b)를 입력받아 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.
		// 두 정수 a, b가 공백을 두고 입력된다. -2147483648 <= a, b <= +2147483647
		// a가 b보다 큰 경우 1을, 그렇지 않은 경우 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a > b ? 1 : 0);
		
		// 50. 두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
		// 두 정수 a, b가 공백을 두고 입력된다. -2147483648 <= a, b <= +2147483647
		// a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a == b ? 1 : 0);
		
		// 51. 두 정수(a, b)를 입력받아 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(b >= a ? 1 : 0);
		
		// 52. 두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(b != a ? 1 : 0);
		
		// 53. 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때 반대로 출력하는 프로그램을 작성해보자.
		// 정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
		// 입력된 값이 0이면 1, 1이면 0을 출력한다.
//		int i = sc.nextInt();		
//		System.out.println(i == 1 ? 0 : 1);
		
		// 54. 두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
		// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
		// 둘 다 참(1)일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a==1 && b==1 ? 1 : 0);
		
		// 55. 두 개의 참(1) 또는 거짓(0)이 입력될 때, 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
		// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
		// 하나라도 참일 경우 1을 출력하고, 그 외의 경우에는 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a==1 || b==1 ? 1 : 0);
		
		// 56. 두 가지의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.
		// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
		// 참/거짓이 서로 다를 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a != b? 1 : 0);
		
		// 57. 참/거짓이 서로 같을 때에만 참 출력하기
		// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
		// 참/거짓이 서로 같을 때에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a == b? 1 : 0);
		
		// 58. 두 개의 참(1) 또는 거짓(0)이 입력될 때, 모두 거짓일 때에만 참이 계산되는 프로그램을 작성해보자.
		// 1 또는 0의 값만 가지는 2개의 정수가 공백을 두고 입력된다.
		// 둘 다 거짓일 경우에만 1을 출력하고, 그 외의 경우에는 0을 출력한다.
//		String str = sc.nextLine();
//		String[] strArr = str.split(" ");
//		int a = Integer.parseInt(strArr[0]);
//		int b = Integer.parseInt(strArr[1]);
//		System.out.println(a == 0 && b == 0? 1 : 0);
		
		// 59. 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자. 
		// 정수 1개가 입력된다. -2147483648 ~ +2147483647
		// 비트 단위로 1 -> 0, 0 -> 1로 바꾼 후 그 값을 10진수로 출력한다.
//		int i = sc.nextInt();
//		System.out.println(~i);  // 비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
		
		// 60. 입력된 정수 두 개를 비트단위로 and 연산한 후 그 결과를 정수로 출력해보자.
		// 2개의 정수가 공백을 두고 입력된다. -2147483648 ~ +2147483647
		// 두 정수를 비트단위(bitwise)로 and 계산을 수행한 결과를 10진수로 출력한다.
		String str = sc.nextLine();
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		System.out.println(a & b);  // 비트단위(bitwise)연산자 &를 사용하면 된다.(and, ampersand, 앰퍼센드라고 읽는다.)
		
		
		sc.close();

	}
}
