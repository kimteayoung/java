package java_21_10_22_ssam;

import java.util.*;

public class MemberService {

	// �쉶�썝媛��엯 硫붿꽌�뱶
	/*
	 * 硫붿꽌�뱶�씠由�: memberJoin 由ы꽩���엯: List<MemberDTO> 留ㅺ컻蹂��닔: List<MemberDTO>
	 */
	List<MemberDTO> memberJoin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String password = scan.nextLine();
		System.out.print("이름:  ");
		String name = scan.nextLine();
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		int number = memberList.size() + 1;

		MemberDTO member = new MemberDTO(number, id, password, name, email);

		memberList.add(member);
		return memberList;

	}

	// �쉶�썝議고쉶 硫붿꽌�뱶
	/*
	 * 硫붿꽌�뱶�씠由�: memberListView 由ы꽩���엯: void 留ㅺ컻蹂��닔: List<MemberDTO>
	 */
	void memberListView(List<MemberDTO> memberList) {
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	// 濡쒓렇�씤 硫붿꽌�뱶
	/*
	 * 硫붿꽌�뱶�씠由�: memberLogin 由ы꽩���엯: void 留ㅺ컻蹂��닔: List<MemberDTO>
	 */
	void memberLogin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("�븘�씠�뵒 : ");
//		String id = scan.nextLine();
//		System.out.print("鍮꾨�踰덊샇 : ");
//		String password = scan.nextLine();

//		for (int i = 0; i < memberList.size(); i++) {
//			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
//				System.out.println(id + "�떂 �솚�쁺�빀�땲�떎.");
//			} else {
//				System.out.println("�븘�씠�뵒 �삉�뒗 鍮꾨�踰덊샇媛� ��由쎈땲�떎.");
//			}
//		}
		int result = loginCheck(memberList);
		// result 媛� -1�씠硫� 濡쒓렇�씤 �떎�뙣, 0�씠�긽�쓽 媛믪쓣 媛�吏�怨� �엳�쑝硫� 濡쒓렇�씤�꽦怨듭쑝濡� �뙋�떒 
		// 濡쒓렇�씤�꽦怨듭씠�씪硫� 濡쒓렇�씤�븳 �쉶�썝�쓽 �씤�뜳�뒪踰덊샇瑜� 媛�吏�怨� �엳�뒗 寃� 
		if (result >= 0) {
			System.out.println("濡쒓렇�씤 �꽦怨�");
			System.out.println(memberList.get(result).getId() + "�떂 �솚�쁺�빀�땲�떎.");
		} else {
			System.out.println("濡쒓렇�씤 �떎�뙣");
		}

	}

	// �쉶�썝�젙蹂� 蹂�寃� 硫붿꽌�뱶
	/*
	 * 硫붿꽌�뱶�씠由�: memberUpdate 由ы꽩���엯: List<MemberDTO> 留ㅺ컻蹂��닔: List<MemberDTO>
	 */
	List<MemberDTO> memberUpdate(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
//		System.out.print("�븘�씠�뵒 : ");
//		String id = scan.nextLine();
//		System.out.print("鍮꾨�踰덊샇 : ");
//		String password = scan.nextLine();
//
//		for (int i = 0; i < memberList.size(); i++) {
//			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
//				System.out.print("蹂�寃쏀븷 �씠硫붿씪 : ");
//				String email = scan.nextLine();
//				memberList.get(i).setEmail(email);
//			} else {
//				System.out.println("�븘�씠�뵒 �삉�뒗 鍮꾨�踰덊샇媛� ��由쎈땲�떎.");
//			}
//		}

		int result = loginCheck(memberList);
		if (result >= 0) {
			System.out.println("濡쒓렇�씤 �꽦怨�");
			System.out.println(memberList.get(result).getId() + "�떂 �솚�쁺�빀�땲�떎.");
			System.out.print("蹂�寃쏀븷 �씠硫붿씪 : ");
			String email = scan.nextLine();
			memberList.get(result).setEmail(email);
		} else {
			System.out.println("濡쒓렇�씤 �떎�뙣");
		}
		return memberList;
	}

	// �븘�씠�뵒, 鍮꾨�踰덊샇 �솗�씤�쓣 �쐞�븳 硫붿꽌�뱶
	// memberLogin, memberUpdate�뿉�꽌 �샇異쒗빐�꽌 �솢�슜
	// �븘�씠�뵒, 鍮꾨�踰덊샇 �씪移섑븯�뒗 �쉶�썝�쓽 �씤�뜳�뒪踰덊샇瑜� 由ы꽩�븯怨� 
	// �븘�씠�뵒, 鍮꾨�踰덊샇媛� �씪移섑븯吏� �븡�쑝硫� -1瑜� 由ы꽩�븿. 
	int loginCheck(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�븘�씠�뵒 : ");
		String id = scan.nextLine();
		System.out.print("鍮꾨�踰덊샇 : ");
		String password = scan.nextLine();
		// 濡쒓렇�씤�븳 �쉶�썝�쓽 �씤�뜳�뒪 踰덊샇瑜� 媛��졇媛�湲� �쐞�븳 蹂��닔 (�쉶�썝踰덊샇 �븘�떂)
		int indexNumber = -1;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				indexNumber = i;
			}
		}
		return indexNumber;
	}

}
