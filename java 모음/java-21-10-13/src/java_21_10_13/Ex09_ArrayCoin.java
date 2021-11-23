package java_21_10_13;

import java.util.Scanner;

public class Ex09_ArrayCoin {

	public static void main(String[] args) {
		// 거스름돈 계산하기
		int[] coin = { 500, 100, 50, 10, 1 };
		Scanner scan = new Scanner (System.in);
		System.out.print("숫자입력: ");
		int num = scan.nextInt();
		for (int i = 0; i < coin.length; i++) {
				System.out.println(coin[i]+ "원"+num/coin[i]);
				num %= coin[i];
			}
		}

}
