package java_21_10_28_01;

import java.util.Random;

import java.util.Scanner;


public class num1 {

	public static void main(String[] args) {
	

		 

		//Ȧ¦����

		

		Scanner keyBoard = new Scanner(System.in);

		// ���� ���� �غ�

		Random r = new Random();

		// 0 ~ 9 ������ ������ ����

		int random = r.nextInt(10) + 1;

		// 0���� �����ϱ� ������ 1 ~ 10�� ���Ѵٸ� �ڿ� +1 �ٿ��ش�.

		String answer = (random % 2 == 1) ? "Ȧ" : "¦";

		// ���� ������ Ȧ���� Ȧ ¦���� ¦

		String userAnswer = keyBoard.next();

		// ������ ���� �Է�

		 

		System.out.printf("�� ���� : %s\n", userAnswer);

		// ���� ���� ���� ���

		System.out.println(random);

		// ���� ���� ���

		System.out.printf("���� : %s\n", answer);

		// ���� ���

		 

		// ���

		// String result = (answer == userAnswer) ? "����" : "����"; (X)

		String result = (answer.equals(userAnswer)) ? "����" : "����";

		// ���� String = ���Ҷ� .equals���

		System.out.println(result);

		// ��� ���

	}
}
