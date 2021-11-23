package java_21_10_28_01;

import java.util.Random;

import java.util.Scanner;


public class num1 {

	public static void main(String[] args) {
	

		 

		//홀짝게임

		

		Scanner keyBoard = new Scanner(System.in);

		// 랜덤 뽑을 준비

		Random r = new Random();

		// 0 ~ 9 사이의 랜덤한 정수

		int random = r.nextInt(10) + 1;

		// 0부터 시작하기 때문에 1 ~ 10을 원한다면 뒤에 +1 붙여준다.

		String answer = (random % 2 == 1) ? "홀" : "짝";

		// 동전 갯수가 홀수면 홀 짝수면 짝

		String userAnswer = keyBoard.next();

		// 유저가 숫자 입력

		 

		System.out.printf("내 정답 : %s\n", userAnswer);

		// 내가 적은 숫자 출력

		System.out.println(random);

		// 랜덤 숫자 출력

		System.out.printf("정답 : %s\n", answer);

		// 정답 출력

		 

		// 결과

		// String result = (answer == userAnswer) ? "정답" : "오답"; (X)

		String result = (answer.equals(userAnswer)) ? "정답" : "오답";

		// 주의 String = 비교할때 .equals사용

		System.out.println(result);

		// 결과 출력

	}
}
