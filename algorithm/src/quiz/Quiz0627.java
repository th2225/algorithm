package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Quiz0627 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\dev\\eclipse\\git_algorithm\\algorithm\\src\\quiz\\info.txtwls"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<String> listInput = new ArrayList<String>();
		
		String line = "";
		
		while ((line = br.readLine()) != null) {
			listInput.add(line);
		}

		for (String str : listInput) {
			String origin = str;
			String change = str.replace("-", "").replace(" ", "");

			if (change.matches("[0-9]+") && change.length() == 13) {
				int[] intArr = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
				int sum = 0;

				for (int i = 0; i < change.length() - 1; i++) {
					sum += Integer.parseInt(change.substring(i, i + 1)) * intArr[i];
				}
				
				if (11 - (sum % 11) == Integer.parseInt(change.substring(12))) {
					bw.write("입력값 : [ " + origin + " ] 는 주민번호가 맞습니다.\n");
				} else {
					bw.write("입력값 : [ " + origin + " ] 는 개인정보가 아닙니다.\n");
				}
			} else if (change.matches("[0-9]+") && change.length() == 16) {
				bw.write("입력값 : [ " + origin + " ] 는 카드번호가 맞습니다.\n");
			} else {
				bw.write("입력값 : [ " + origin + " ] 는 개인정보가 아닙니다.\n");
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
