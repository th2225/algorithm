package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10825 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Student> studentlist = new ArrayList<Student>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			Student student = new Student(st.nextToken(), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

			studentlist.add(student);
		}

		Collections.sort(studentlist, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.kor > o2.kor) {
					return -1;
				} else if (o1.kor == o2.kor) {
					if (o1.eng < o2.eng) {
						return -1;
					} else if (o1.eng == o2.eng) {
						if (o1.math > o2.math) {
							return -1;
						} else if (o1.math == o2.math) {
							if (o1.name.compareTo(o2.name) < 0) {
								return -1;
							}
						}
					}
				}				
				return 1;
			}
		});

		for (Student student : studentlist) {
			System.out.println(student.name);
		}

		br.close();

	}

}

class Student {
	String name;
	int kor;
	int eng;
	int math;

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

}