package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

public class D06242 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// https://www.acmicpc.net/problem/1339 단어 수학
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] word = new String[n];

		for (int i = 0; i < n; i++) {
			word[i] = br.readLine();			
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < word.length; i++) {
			char[] c = word[i].toCharArray();

			// 알파벳이 있는 자리수에 숫자 부여해서 키와 밸류로 hashmap에 저장 ex) ABCDE 가 있으면 A는 만의 자리에 있으므로 A,10000으로 저장
			for (int j = 0; j < c.length; j++) { 
				if (map.containsKey(c[j])) { // 이미 등록된 알파벳이 또 들어온다면 
					map.replace(c[j], map.get(c[j]) + (int) Math.pow(10, c.length - (j + 1))); // 밸류값을 기존값 + 새로운 값으로 교체해서 저장
				} else { // 그 외에는 그냥 알파벳과 자리수 숫자로 저장
					map.put(c[j], (int) Math.pow(10, c.length - (j + 1)));
				}
			}
		}
		

		// 밸류 값이 큰 수부터 정렬하기 위해 priorityQueue(Collections.reverseOrder()) 사용
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		// key값이 뭔지 정확히 모르는 상태에서 밸류값 모두 빼오기 위해 iterator 사용
		Iterator<Character> it = map.keySet().iterator(); 
		System.out.println(it);

		while (it.hasNext()) { // 빼낸 밸류값을 priorityQueue 에 저장하여 내림차순 정렬되게 함
			char key = it.next();
			pq.add(map.get(key));
		}

		int sum = 0;
		int num = 9;
		while (pq.size() != 0) { // priorityQueue에서 큰 수부터 작은수까지 하나씩 빼와서 9~0까지 하나씩 곱해 sum에 저장
			sum += pq.poll() * num;
			num--;
		}

		System.out.println(sum); // sum 출력

		br.close();
	}

}
