package day02_2021_10_05_2;

import java.util.Scanner;

public class Ex05_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if 연습
		boolean con = false;
//		System.out.println("if문 실행 전");
//		// 단일 if문
//		if(con) {
//			System.out.println("if문 내부");
//		}
//		System.out.println("if문 실행 후");

		// if else 문
//		if(con) {
//			System.out.println("조건이 true");
//		} else {
//			System.out.println("조건이 false ");
//		}
//		System.out.println("if문 실행 후");
//		
//		// 스캐너로 정수를 입력받아 입력받은 정수가 양수인지 음수인지 출력해보세요.
//		// 일단 0도 양수라고 판단

//		int name = 0;
//		System.out.print("숫자를 입력하세요: ");
//		name = scan.nextInt();
//		 if(name > 0) {
//			System.out.print("양수입니다");
//		} else if( name == 0) {
//				System.out.print("0입니다");
//		} else {
//			    System.out.print("음수 입니다.");
//		}

		// 정수를 입력받아서 홀수, 짝수를 판단해보세요.
//		int name = 0;
//		System.out.print("숫자를 입력하세요: ");
//		name = scan.nextInt();
//		if (name <= 2 ) {
//			System.out.println("다시 입력하세요.");
//		} else if (name % 2 == 0) {
//			System.out.println("짝수 입니다.");
//		} else {
//			System.out.println("홀수 입니다.");
//		}
		Scanner scan = new Scanner(System.in);
		int name = 0;
		System.out.print("숫자를 입력하세요: ");
		name = scan.nextInt();
		if (name > 0) {
			System.out.println("양수 입니다.");
		} else if (name < 0) {
			System.out.println("음수 입니다.");
		}
		if (name <= 2) {
			System.out.println("다시 입력하세요.");
		} else if (name % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		System.out.print("숫자를 입력하세요: ");
		name = scan.nextInt();
		if (name > 0)
			if (name % 2 == 0) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}
		else {
			System.out.println("다시 입력하세요.");
		}

		System.out.print("숫자를 입력하세요: ");
		name = scan.nextInt();
		if (name > 0 && name % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else if (name > 0 && name % 2 != 0) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("0보다 큰숫자를 입력하세요.");
		}

	}
}
