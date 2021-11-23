package java_21_10_12;

import java.util.Scanner;

public class Ex02_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 숫자 입력용 변수
		int num = 0;
		// 합계용 변수
		int sum = 0;
		// 갯수용 변수
		int count = 0;
		boolean run = false;
		System.out.print("정수를 입력하고 마지막에 0을 입력하세요: ");

		while (run) {
			num = scan.nextInt();
			// 숫자를 입력받으면 합계, 갯수
			if (num == 0) {
				run = false;
			} else {
				sum += num;
				count++; // count += 1; 이것도 됨

			}
		}
		double avg = sum / count; // 정수 결과를 실수에 대입해서 .0만 붙음
		double avg1 = (double) sum / count; // 실수 계산 결과를 실수변수에 대입 (소수점 이하 값 있음.)
		int avg2 = sum / count; // 정수 결과를 정수에 대입해서 몫만.
		System.out.println("입력한 수는" + count + "개");
		System.out.println("평균은" + avg + "입니다.");
		System.out.println("평균은" + avg1 + "입니다.");
		System.out.println("평균은" + (sum / count) + "입니다.");

	}
}
