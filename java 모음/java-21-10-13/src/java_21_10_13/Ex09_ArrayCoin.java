package java_21_10_13;

import java.util.Scanner;

public class Ex09_ArrayCoin {

	public static void main(String[] args) {
		// �Ž����� ����ϱ�
		int[] coin = { 500, 100, 50, 10, 1 };
		Scanner scan = new Scanner (System.in);
		System.out.print("�����Է�: ");
		int num = scan.nextInt();
		for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i]+ "��"+num/coin[i]);
				num %= coin[i];
			}
		}

}
