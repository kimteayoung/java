package java_21_10_13;

import java.util.Scanner;

public class Ex01_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("----------------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("----------------------------------");
		System.out.print("����> ");
		int num1 = 0; // ����
		int num2 = 0; // ���
		int num3 = 0; // �ܰ�
		int num4 = 0; // ����
		boolean num5 = true;

		while (num5) {
			num = scan.nextInt();
			if (num == 1) {
				System.out.print("����> ");
				num1 = scan.nextInt();
			} else if (num == 2) {
				System.out.println("���> " + num2);
				num2 = scan.nextInt();
			} else if (num == 3) {
				System.out.println("���� �ܾ��� " + num3 + "�� �Դϴ�.");
			}else if (num4 == 4) {
				System.out.println("���� �ܰ�: " + num3);
			}
		}

	}
}