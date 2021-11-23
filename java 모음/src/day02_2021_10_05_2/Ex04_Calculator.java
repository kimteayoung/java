package day02_2021_10_05_2;

import java.util.Scanner;

public class Ex04_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 간단한 덧셈 계산기
		// 스캐너를 이용하여 정수 2개를 각각 입력받고 입력받은 숫자의 합을 출력해보세요.
		Scanner scan = new Scanner(System.in);
		
		int name1 = 0, name2 = 0;
		System.out.print("숫자를 입력하세요: ");
	    name1 = scan.nextInt();
	    System.out.print("숫자를 입력하세요: ");
	    name2 = scan.nextInt();
	    System.out.println("=" + ( name1 + name2 ));


	}

}
