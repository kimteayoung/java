package day02_2021_10_05_2;

import java.util.Scanner;

public class Ex03_Scaccers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 활용
		// 스캐너 객체를 선언해야 활용 가능
	    Scanner scan = new Scanner(System.in);
	    int num1 = 0;
	    System.out.println(num1);
	    
	    // 스캐너를 이용하여 num1에 데이터 입력
	    // println() ()안에 있는 내용을 출력하고 줄을 바꿈.
	    System.out.print("숫자를 입력하세요: ");
	    num1 = scan.nextInt(); // Scanner 클래스가 가지고 있는 nextInt() 메서드를 호출
	    System.out.println(num1);
	    
	    
	    String name = "";
	    System.out.print("이름을 입력하세요: ");
	    name = scan.next(); // 띄어쓰기 또는 엔터 전까지 입력한 내용을 저장
	    System.out.println(name);
	    scan.nextLine();
	    
	    System.out.print("이름을 입력하세요(nextLine메서드) ");
	    name = scan.nextLine();
	    System.out.println(name);

	}

}
