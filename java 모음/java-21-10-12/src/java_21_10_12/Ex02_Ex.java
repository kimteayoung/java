package java_21_10_12;

import java.util.Scanner;

public class Ex02_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� �Է¿� ����
		int num = 0;
		// �հ�� ����
		int sum = 0;
		// ������ ����
		int count = 0;
		boolean run = false;
		System.out.print("������ �Է��ϰ� �������� 0�� �Է��ϼ���: ");

		while (run) {
			num = scan.nextInt();
			// ���ڸ� �Է¹����� �հ�, ����
			if (num == 0) {
				run = false;
			} else {
				sum += num;
				count++; // count += 1; �̰͵� ��

			}
		}
		double avg = sum / count; // ���� ����� �Ǽ��� �����ؼ� .0�� ����
		double avg1 = (double) sum / count; // �Ǽ� ��� ����� �Ǽ������� ���� (�Ҽ��� ���� �� ����.)
		int avg2 = sum / count; // ���� ����� ������ �����ؼ� ��.
		System.out.println("�Է��� ����" + count + "��");
		System.out.println("�����" + avg + "�Դϴ�.");
		System.out.println("�����" + avg1 + "�Դϴ�.");
		System.out.println("�����" + (sum / count) + "�Դϴ�.");

	}
}
