package java_21_10_13;

import java.util.Scanner;

public class Ex05_ArrayEx {

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열을 선언하고 스캐너를 이용해 배열에 데이터를 저장하고
		// 저장된 값의 총합, 평균을 계산하세요.

		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
//		System.out.print("0숫자입력: ");
//		num[0] = scan.nextInt();
//		System.out.print("1숫자입력: ");
//		num[1] = scan.nextInt();
//		System.out.print("2숫자입력: ");
//		num[2] = scan.nextInt();
		int num1 = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력: ");
			num[i] = scan.nextInt();
			num1 += num[i];
		}
		System.out.println(num1);
	}

}
