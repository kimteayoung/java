package java_21_10_25_Ex03;
//ȸ������ �α��� ��ü��ȸ ȸ������ ����

import java.util.*;

public class MamberService {

	public Map<Integer, MemberDTO> memberJogin(Map<Integer, MemberDTO> MemberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		System.out.print("�̸�: ");
		String name = scan.nextLine();
		System.out.print("�̸���: ");
		String email = scan.nextLine();
		int number = MemberMap.size() + 1;

		MemberDTO num1 = new MemberDTO(number, id, password, name, email);

		MemberMap.put(number, num1);
		System.out.println("������ ���ϵ帳�ϴ�.");

		return MemberMap;
	}

	public void memberLogin(Map<Integer, MemberDTO> MemberMap) {
		int result = loginCheck(MemberMap);
		if (result >= 0) {
			System.out.println("�α��� �����Դϴ�");
			System.out.println(MemberMap.get(result).getName() + "�� �������");
		} else {
			System.out.println("�α��� �����Դϴ�.");
		}
	}

	int loginCheck(Map<Integer, MemberDTO> MemberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���̵�: ");
		String id = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		int indexNumber = 0;
		for (int i = 0; i < MemberMap.size(); i++) {
			if (id.equals(MemberMap.get(i).getId()) && password.equals(MemberMap.get(i).getPassword())) {
				indexNumber = i;
			}
		}
		return indexNumber;
	}
	//void memberView(Map<Integer,MemberDTO> MemberMap) {
	void memberView(Map<Integer, MemberDTO> MemberMap) {
		for (Integer n : MemberMap.keySet()){
			MemberDTO s = MemberMap.get(n);
			System.out.println(n);
			System.out.println(MemberMap.get(n));
			
		}
	}
	Map<Integer, MemberDTO> memberUpdate(Map<Integer, MemberDTO> MemberMap) {
		Scanner scan = new Scanner(System.in);
		int result = loginCheck(MemberMap);
		if (result >= 0) {
			System.out.println("�α��� �����Դϴ�");
			System.out.println(MemberMap.get(result).getName() + "�� �������");
			System.out.print("�̸��� �Է�");
			String email = scan.nextLine();
			MemberMap.get(result).setEmail(email);
		} else {
			System.out.println("�α��� �����Դϴ�.");
		}
		
		return MemberMap;
		
	}
}
