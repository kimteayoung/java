package ja_21_10_18;

public class Member {
	String name1; // 아이디
	String name2; // 비밀번호
	String name3; // 이름
	String name4; // 이메일
	boolean name5;

	Member() {
	}

	Member(String name1, String name2, String name3, String name4) {
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}

	void memberJoin(String name1, String name2, String name3, String name4) {
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		System.out.println("가입완료");
	}

	boolean memberLogin(String name1, String name2) {
		boolean result = false;
		if (name1.equals(this.name1) && name2.equals(this.name2)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// memberlogin2 메서드
	// 매개변수: Member 클래스 타입의 객체
	boolean memberLogin(Member loginMember) {
		System.out.println(loginMember.name1);
		System.out.println(loginMember.name2);
		boolean result = false;
		if (loginMember.name1.equals(this.name1) && loginMember.name2.equals(this.name2)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	void myinfo() {
		System.out.println(this.name1);
		System.out.println(this.name2);
		System.out.println(this.name3);
		System.out.println(this.name4);
	}

	void memberUpdate(String name4) {
		this.name4 = name4;
		System.out.println("변경완료");
	}
	// soString 메서드
	// 리턴타입: String

	@Override // 메서드 재정의할 때 사용하는 어노테이션(Annotation)
	public String toString() {
		return "Member [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5="
				+ name5 + "]";
	}

}
