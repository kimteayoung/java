package java_21_10_12;

import java.util.Scanner;

public class Ex01_Ex {
	public static final String ANSWERC = "종료";

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		boolean run = true;
		String ANSWER = "종료";
	        // 프로그램을 종료하는 키워드인 종료가 절대 바뀌지 않을 경우
		final String answer = "종료";
		// final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
		// ANSWER = "다른 값 저장"
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if(inputString.equals(ANSWER)) {
				run = false;
			}
		}while(run);
		
	}
	}


