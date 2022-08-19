package baekjoon;

import java.util.Scanner;

public class D07031 {

	public static void main(String[] args) {
		// https://www.acmicpc.net/problem/1541 잃어버린 괄호
		// -가 많을 수록 최소값이 됨 => -를 만나면 괄호 시작해서 뒤에 있는 +들을 -로 만들고 다음 -전에 괄호 닫으면 됨

		Scanner sc = new Scanner(System.in);

		String formula = sc.next();

		// 부호 여러개와 숫자들로 이루어진 문자열을 부호1개랑 숫자로 이루어진 문자열로 만들기 위해 부호를 공백+부호 형식으로 변경해주고 공백 기준으로 split 해서 formulaArr라는 배열 만듦
		// ex) 10+20-10+30 => 10 +20 -10 +30 => [10,+20,-10,+30] 
		String[] formulaArr = formula.replace("+", " +").replace("-", " -").split(" ");

		int sum = 0; // 입력 식의 최소값을 넣을 변수
		int count = 0; // 처음 만나는 -를 캐치할 변수

		for (int i = 0; i < formulaArr.length; i++) { // 입력식에서 파생된 부호+숫자의 갯수만큼 for문 돌림
			if (count == 0) { // -를 처음 만나기 전까지
				sum += Integer.parseInt(formulaArr[i]); // formulaArr[i]의 값 sum에 추가
				
				if (formulaArr[i].contains("-")) { // -부호를 가진 숫자를 처음 만나면 count를 1로 증가시킴
					count++;
				}
			} else { // count가 1이 되면 뒤에 부호는 모두 -가 되야 하므로
				if (formulaArr[i].contains("-")) { // 이미 -부호를 가진 숫자는 그대로 더해주고
					sum += Integer.parseInt(formulaArr[i]);
				} else { // +부호를 가진 숫자는 -해줌
					sum -= Integer.parseInt(formulaArr[i]);
				}
			}
		}

		System.out.println(sum); // 계산 된 최종 값 출력
		
		sc.close();

	}

}
