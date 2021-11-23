package ja_21_10_18;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member t1 = new Member("아이디", "123", "이름", "이메일");

		Member t2 = new Member();

		t2.memberJoin("아이디", "123", "이름", "이메일");

		// boolean loginResult = t1.memberLogin("아이디", "123");
		// if(loginResult)
		// 밑에있는거처럼 줄여서 쓸수도 있음
		if (t1.memberLogin("아이디", "123")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
		t1.myinfo();
		t2.myinfo();

		t1.memberUpdate("이메일");
		t1.myinfo();

		System.out.println(t1);
		System.out.println(t2);

		// 로그인 정보 전달을 위한 Member 객체 생성
		Member loginMember = new Member();
		loginMember.name1 = "아이디0123";
		loginMember.name2 = "1231230";
		
		//loginMember 객체
	}

	
	
}
