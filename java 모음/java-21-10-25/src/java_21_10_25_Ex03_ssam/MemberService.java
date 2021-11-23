package java_21_10_25_Ex03_ssam;

import java.util.*;

public class MemberService {
	public Map<Integer, MemberDTO> memberJoin(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�븘�씠�뵒 : ");
		String id = scan.nextLine();
		System.out.print("鍮꾨�踰덊샇 : ");
		String password = scan.nextLine();
		System.out.print("�씠由� : ");
		String name = scan.nextLine();
		System.out.print("�씠硫붿씪 : ");
		String email = scan.nextLine();

		int number = memberMap.size() + 1;

		MemberDTO member = new MemberDTO(number, id, password, name, email);

		memberMap.put(number, member);
		return memberMap;
	}

	public void memberListView(Map<Integer, MemberDTO> memberMap) {
		MemberDTO member = null;
		for (int n : memberMap.keySet()) {
			member = memberMap.get(n); // Value
			System.out.print(n + "\t");
			System.out.println(member);

			System.out.println(memberMap.get(n));
		}
	}

	public void memberLogin(Map<Integer, MemberDTO> memberMap) {
		int loginMemberNumber = loginCheck(memberMap);
		if (loginMemberNumber > 0) {
			MemberDTO loginMember = memberMap.get(loginMemberNumber);
			System.out.println(loginMember.getId() + "�떂 �솚�쁺�빀�땲�떎.");
		}
	}

	public Map<Integer, MemberDTO> memberUpdate(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);

		int loginMemberNumber = loginCheck(memberMap);
		if (loginMemberNumber > 0) {
			System.out.print("蹂�寃쏀븷 �씠硫붿씪 : ");
			String email = scan.next();
			MemberDTO loginMember = memberMap.get(loginMemberNumber);
			loginMember.setEmail(email);
			memberMap.put(loginMemberNumber, loginMember);
		}
		return memberMap;
	}

	int loginCheck(Map<Integer, MemberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�븘�씠�뵒 : ");
		String id = scan.nextLine();
		System.out.print("鍮꾨�踰덊샇 : ");
		String password = scan.nextLine();

		MemberDTO member = null;
		int memberNumber = 0;

		for (Integer memberKey : memberMap.keySet()) {
			member = memberMap.get(memberKey);

			if (id.equals(memberMap.get(memberKey).getId())
					&& password.equals(memberMap.get(memberKey).getPassword())) {
//			if(id.equals(member.getId()) && password.equals(member.getPassword())) {
				memberNumber = memberKey;
			}
		}
		return memberNumber; // id, pw媛� �씪移섑븯�뒗 �쉶�썝�뜲�씠�꽣�쓽 key媛�
	}

}
