package java_21_10_13;

import java.util.Scanner;

public class Ex05_ArrayEx {

	public static void main(String[] args) {
		// ũ�Ⱑ 3�� ������ �迭�� �����ϰ� ��ĳ�ʸ� �̿��� �迭�� �����͸� �����ϰ�
		// ����� ���� ����, ����� ����ϼ���.

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
//		System.out.print("0�����Է�: ");
//		num[0] = scan.nextInt();
//		System.out.print("1�����Է�: ");
//		num[1] = scan.nextInt();
//		System.out.print("2�����Է�: ");
//		num[2] = scan.nextInt();
		int num1 = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է�: ");
			num[i] = scan.nextInt();
			num1 += num[i];
		}
		System.out.println(num1);
	}

}
