package java_21_10_25_Ex03;

import java.util.*;

public class MemberProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, MemberDTO> MemberMap = new HashMap<Integer, MemberDTO>();
		boolean run = true;
		MamberService m = new MamberService();

		while (run) {
			System.out.println("-----------------");
			System.out.println("1.회원가입 | 2.로그k인 | 3.전체조회 | 4.회원정보 수정");
			System.out.println("-----------------");
			int select = scan.nextInt();

			if (select == 1) {
				MemberMap = m.memberJogin(MemberMap);
			} else if (select == 2) {
				m.memberLogin(MemberMap);
			}else if (select==3) {
				m.memberView(MemberMap);
			}else if (select==4) {
				MemberMap = m.memberUpdate(MemberMap);
			}else {
				System.out.println("로그인에 실패하였습니다.");
			}

		}

	}

}
