package java_21_10_13;

import java.util.Scanner;

public class Ex01_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택> ");
		int num1 = 0; // 예금
		int num2 = 0; // 출금
		int num3 = 0; // 잔고
		int num4 = 0; // 종료
		boolean num5 = true;

		while (num5) {
			num = scan.nextInt();
			if (num == 1) {
				System.out.print("예금> ");
				num1 = scan.nextInt();
			} else if (num == 2) {
				System.out.println("출금> " + num2);
				num2 = scan.nextInt();
			} else if (num == 3) {
				System.out.println("현재 잔액은 " + num3 + "원 입니다.");
			}else if (num4 == 4) {
				System.out.println("현재 잔고: " + num3);
			}
		}

	}
}