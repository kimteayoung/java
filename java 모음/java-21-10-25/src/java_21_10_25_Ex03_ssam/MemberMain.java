package java_21_10_25_Ex03_ssam;

import java.util.*;


public class MemberMain {
	public static void main(String[] args) {
		// MemberDTO瑜� ���옣�븷 Map �꽑�뼵 
		Map<Integer, MemberDTO> memberMap = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		MemberService ms = new MemberService();
		
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.�쉶�썝媛��엯 | 2.�쟾泥댄쉶�썝議고쉶 | 3.濡쒓렇�씤 | 4.�씠硫붿씪蹂�寃� | 5.醫낅즺");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("�꽑�깮> ");
			int select = scan.nextInt();
			
			if(select == 1) {
				// �쉶�썝媛��엯 
				memberMap = ms.memberJoin(memberMap);
			} else if(select == 2) {
				// �쟾泥댄쉶�썝議고쉶 
				ms.memberListView(memberMap);
			} else if(select == 3) {
				// 濡쒓렇�씤
				ms.memberLogin(memberMap);
			} else if(select == 4) {
				// �쉶�썝�젙蹂� 蹂�寃�
				memberMap = ms.memberUpdate(memberMap);
			} else if(select == 5){
				// 醫낅즺 
				run = false;
			} else {
				System.out.println("�떎�떆 �꽑�깮�빐二쇱꽭�슂.");
			}
			
		}
	}
}
