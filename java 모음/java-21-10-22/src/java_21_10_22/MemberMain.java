package java_21_10_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// �鹮�̺ҿ���Ÿ
		// memberList�� MemberMain���� ������ü
		Scanner scan = new Scanner(System.in);
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		boolean run = true;
		MemberService ms = new MemberService();
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.ȸ������ | 2.��üȸ����ȸ | 3.�α��� | 4.�̸��� ����");
			System.out.println("------------------------");
			System.out.println("����> ");
			int select = scan.nextInt();
			
			if(select==1) {
			// ȸ������
				memberList = ms.memberJoin(memberList);
			}else if (select == 2) {
				//��üȸ����ȸ
				ms.memberListView(memberList);
			}else if (select == 3) {
				//�α���
				ms.memberJoin(memberList);
			}else if (select == 4) {
				// ȸ������ ����
				member = ms.memberUpdate(memberList);
			}else if (select == 5) {
				// ����
				run = false;
			}else {
				System.out.println("�ٽ� �������ּ���.");
			}
	
			
			
			
			
			
		}
		
	}

}
