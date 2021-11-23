package java_21_10_20;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayLisrEx {

	public static void main(String[] args) {
		// foreach(advanced for문)

		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("spring");
		list.add("spring boot");

		// 전통적인 for문으로 list 데이터 출력
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

		}

		// foreach를 사용한 방식
		// 다양한 데이터를 가지고 있는 객체(ArrayList, 배열 등)에 접근할 떄
		// for (반복변수: 반복접근할객체) => 반복변수와 반복접근용갹체의 데이터 타입은 동일해야함
		for (String var : list) {
			System.out.println(var);
		}

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(100);
		list1.add(1234);
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (int num : list1) {
			System.out.println(num);
			}
	}
}
