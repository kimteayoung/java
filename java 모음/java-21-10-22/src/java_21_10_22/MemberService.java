package java_21_10_22;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	// ȸ������ �޼���
	// �޼��� �̸�: memberJoin
	// ���� Ÿ��: List<DTO>
	// �Ű� ����: List<DTO>

	List<MemberDTO> memberJoin(List<MemberDTO> memberList){
	Scanner scan = new Scanner(System.in);
	System.out.print("���̵�: ");
	String id = scan.nextLine();
	System.out.print("��й�ȣ: ");
	String password = scan.nextLine();
	System.out.print("�̸�: ");
	String name = scan.nextLine();	
	System.out.print("�̸���: ");
	String email = scan.nextLine();
	int number = memberList.size() +1;
	
	MemberDTO member = new MemberDTO(number,id,password,name,email);
	
	memberList.add(member);
	return memberList;
	
	}

	// ȸ����ȸ �޼���
	void memberListView(List<MemberDTO> memberList) {
		for(MemberDTO m : memberList) {
		System.out.println(m);
	}

	// �α��� �޼���
	// �޼��� �̸�: memberLogin ����Ÿ�� : void �Ű�����: List<MemberDTO>

	void memberLogin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		
		for(int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				System.out.println(id + "�� ȯ���մϴ�.");
			}else {
				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
			}
		}
	}

	// ȸ������ ���� �޼���
	// �޼��� �̸�: memverUpdare ����Ÿ��: List<MemberDTO> �Ű�����: List<MemberDTO>

	// ���̵�, ��й�ȣ Ȯ���� ���� �޼���
	boolean loginCheck(List<MemberDTO>memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		
		boolean result = false;
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
		}
	}
}
	//ȸ�� ������Ʈ
	List<MemberDTO> memberUpdate(List<MemberDTO>memberList){
		Scanner scan = new Scanner(System.in);
		System.out.print("���̵�: ");
		String id = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		
		for(int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
		System.out.println("������ �̸���: ");
		String email = scan.nextLine();
		memberList.get(i).setEmail(email);
		
			}
	}
}
