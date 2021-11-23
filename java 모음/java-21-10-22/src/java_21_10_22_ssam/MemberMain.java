package java_21_10_22_ssam;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		// 諛깅Ц�씠遺덉뿬�씪��
		// memberList�뒗 MemberMain�뿉�꽌 愿�由ъ＜泥� 
		Scanner scan = new Scanner(System.in);
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
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
				memberList = ms.memberJoin(memberList);
			} else if(select == 2) {
				// �쟾泥댄쉶�썝議고쉶 
				ms.memberListView(memberList);
			} else if(select == 3) {
				// 濡쒓렇�씤
				ms.memberLogin(memberList);
			} else if(select == 4) {
				// �쉶�썝�젙蹂� 蹂�寃�
				memberList = ms.memberUpdate(memberList);
			} else if(select == 5){
				// 醫낅즺 
				run = false;
			} else {
				System.out.println("�떎�떆 �꽑�깮�빐二쇱꽭�슂.");
			}
			
		}
		
		
		
		
		
		
	}

}
