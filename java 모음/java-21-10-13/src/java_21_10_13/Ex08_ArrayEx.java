package java_21_10_13;

import java.util.Scanner;

public class Ex08_ArrayEx {

	public static void main(String[] args) {
		// �Ʒ��� ���� �迭�� ���� ��
		// � ���ڰ� ��� �ε����� �ִ��� ���
		// ��) 8 �Է� �ϸ� 8�� 9�� �ε����� �ֽ��ϴ�.
		// 4 �Է��ϸ� 4�� 4�� �ε����� �ֽ��ϴ�.
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num1 = scan.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num1 == num[i]) {
				System.out.println(num1 + "��" + i + "�� �ε����� �ֽ��ϴ�");
			}

		}
	}

}
