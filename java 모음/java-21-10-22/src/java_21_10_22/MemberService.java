package java_21_10_22;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	// 회원가입 메서드
	// 메서드 이름: memberJoin
	// 리턴 타입: List<DTO>
	// 매개 변수: List<DTO>

	List<MemberDTO> memberJoin(List<MemberDTO> memberList){
	Scanner scan = new Scanner(System.in);
	System.out.print("아이디: ");
	String id = scan.nextLine();
	System.out.print("비밀번호: ");
	String password = scan.nextLine();
	System.out.print("이름: ");
	String name = scan.nextLine();	
	System.out.print("이메일: ");
	String email = scan.nextLine();
	int number = memberList.size() +1;
	
	MemberDTO member = new MemberDTO(number,id,password,name,email);
	
	memberList.add(member);
	return memberList;
	
	}

	// 회원조회 메서드
	void memberListView(List<MemberDTO> memberList) {
		for(MemberDTO m : memberList) {
		System.out.println(m);
	}

	// 로그인 메서드
	// 메서드 이름: memberLogin 리턴타입 : void 매개변수: List<MemberDTO>

	void memberLogin(List<MemberDTO> memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		
		for(int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
				System.out.println(id + "님 환영합니다.");
			}else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		}
	}

	// 회원정보 변경 메서드
	// 메서드 이름: memverUpdare 리턴타입: List<MemberDTO> 매개변수: List<MemberDTO>

	// 아이디, 비밀번호 확인을 위한 메서드
	boolean loginCheck(List<MemberDTO>memberList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		
		boolean result = false;
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
		}
	}
}
	//회원 업데이트
	List<MemberDTO> memberUpdate(List<MemberDTO>memberList){
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		
		for(int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && password.equals(memberList.get(i).getPassword())) {
		System.out.println("변경할 이메일: ");
		String email = scan.nextLine();
		memberList.get(i).setEmail(email);
		
			}
	}
}
