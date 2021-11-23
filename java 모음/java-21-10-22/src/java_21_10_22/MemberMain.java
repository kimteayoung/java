package java_21_10_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// 백문이불여일타
		// memberList는 MemberMain에서 관리주체
		Scanner scan = new Scanner(System.in);
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		boolean run = true;
		MemberService ms = new MemberService();
		
		while (run) {
			System.out.println("------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.이메일 변경");
			System.out.println("------------------------");
			System.out.println("선택> ");
			int select = scan.nextInt();
			
			if(select==1) {
			// 회원가입
				memberList = ms.memberJoin(memberList);
			}else if (select == 2) {
				//전체회원조회
				ms.memberListView(memberList);
			}else if (select == 3) {
				//로그인
				ms.memberJoin(memberList);
			}else if (select == 4) {
				// 회원정보 변경
				member = ms.memberUpdate(memberList);
			}else if (select == 5) {
				// 종료
				run = false;
			}else {
				System.out.println("다시 선택해주세요.");
			}
	
			
			
			
			
			
		}
		
	}

}
