package java_21_10_13;

import java.util.Scanner;

public class Ex02_Ex_sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		while (run) {
			
//			if(select == 1) {
//				// 예금
//			}else if (select == 2) {
//				// 출금
//			}else if (select == 3) {
//				// 잔고
//			}else if (select == 4) {
//				// 종료
//			}else {
//				// 잘못된 선택
//			}
		
			boolean run = true;
			int balance = 0; // 잔고
			int deposit = 0; // 입금액
			int withdraw = 0; // 출금액
			int select = 0; // 기능선택
			Scanner scan = new Scanner (System.in); // Scanner 클래스타입의 변수 scan
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			switch(select) {
			case 1:
				// 예금
				System.out.print("예금액>");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("현재잔액은 "+balance+"입니다.");
				break;
			case 2:
				// 출금
				System.out.println("출금액>");
				withdraw = scan.nextInt();
				if(withdraw > balance) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은" + balance+"입니다.");
				}else {
					balance -= withdraw;
					System.out.println("현재잔액은" + balance+"입니다.");
				}
				break;
			case 3:
				System.out.println("현재잔액은" + balance+"입니다.");
				break;
			case 4:
				System.out.println("종료");
				break;
		}
			
		}

	}

