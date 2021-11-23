package java_21_10_25_Ex03;
//회원가입 로그인 전체조회 회원정보 수정

import java.util.*;

public class MamberService {

	public Map<Integer, MemberDTO> memberJogin(Map<Integer, MemberDTO> MemberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("이메일: ");
		String email = scan.nextLine();
		int number = MemberMap.size() + 1;

		MemberDTO num1 = new MemberDTO(number, id, password, name, email);

		MemberMap.put(number, num1);
		System.out.println("가입을 축하드립니다.");

		return MemberMap;
	}

	public void memberLogin(Map<Integer, MemberDTO> MemberMap) {
		int result = loginCheck(MemberMap);
		if (result >= 0) {
			System.out.println("로그인 성공입니다");
			System.out.println(MemberMap.get(result).getName() + "님 어서오세요");
		} else {
			System.out.println("로그인 실패입니다.");
		}
	}

	int loginCheck(Map<Integer, MemberDTO> MemberMap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디: ");
		String id = scan.nextLine();
		System.out.print("비밀번호: ");
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
			System.out.println("로그인 성공입니다");
			System.out.println(MemberMap.get(result).getName() + "님 어서오세요");
			System.out.print("이메일 입력");
			String email = scan.nextLine();
			MemberMap.get(result).setEmail(email);
		} else {
			System.out.println("로그인 실패입니다.");
		}
		
		return MemberMap;
		
	}
}
