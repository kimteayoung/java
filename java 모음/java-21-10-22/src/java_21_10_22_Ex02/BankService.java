package java_21_10_22_Ex02;

import java.util.*;

import java_21_10_22_ssam.MemberDTO;

public class BankService {

	private Object bankList;

	List<BankDTO> clientJoin(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scan.nextLine();
		System.out.println("계좌번호: ");
		int number = scan.nextInt();
		int number1 = bankList.size() + 1;

		BankDTO bank = new BankDTO(name, number);
		bankList.add(bank);
		return bankList;
	}

	void CelientListView(List<BankDTO> bankList) {
		for (BankDTO m : bankList) {
			System.out.println(m);
		}
	}

	void deposit(List<BankDTO> bankList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scan.nextLine();
		System.out.println("계좌번호: ");
		int number = scan.nextInt();

		boolean line = false;
		int result = loginChek(bankList);
		if (result >= 0) {
			System.out.println("로그인 성공입니다.");
			System.out.println(bankList.get(result).getName() + "님 어서오세요");

		} else {
			System.out.println("로그인 실패입니다.");
		}
	}

	private int loginChek(List<BankDTO> bankList2) {
		return 0;
	}

}
