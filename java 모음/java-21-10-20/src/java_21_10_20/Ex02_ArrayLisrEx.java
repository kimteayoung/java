package java_21_10_20;

import java.util.ArrayList;
import java.util.List;

public class Ex02_ArrayLisrEx {

	public static void main(String[] args) {
		// foreach(advanced for��)

		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("spring");
		list.add("spring boot");

		// �������� for������ list ������ ���
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

		}

		// foreach�� ����� ���
		// �پ��� �����͸� ������ �ִ� ��ü(ArrayList, �迭 ��)�� ������ ��
		// for (�ݺ�����: �ݺ������Ұ�ü) => �ݺ������� �ݺ����ٿ밽ü�� ������ Ÿ���� �����ؾ���
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
