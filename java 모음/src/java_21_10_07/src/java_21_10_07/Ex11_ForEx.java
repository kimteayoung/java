package java_21_10_07;

import java.util.Scanner;

public class Ex11_ForEx {

	public static void main(String[] args) {
		// 어떤 정수를 하나 입력받아서
		// 1부터 입력받은 정수까지의 숫자 중에서
		// 2의배수, 3의배수를 제외한 숫자의 총합을 구하시오.

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		System.out.print("숫자입력: ");
		num = scan.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println("나머지 값: " + i);
				num1 += i;
			}

		}
		System.out.println("합: " + num1);
	}
}
