package ja_21_10_18;

public class Member {
	String name1; // ���̵�
	String name2; // ��й�ȣ
	String name3; // �̸�
	String name4; // �̸���
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
		System.out.println("���ԿϷ�");
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

	// memberlogin2 �޼���
	// �Ű�����: Member Ŭ���� Ÿ���� ��ü
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
		System.out.println("����Ϸ�");
	}
	// soString �޼���
	// ����Ÿ��: String

	@Override // �޼��� �������� �� ����ϴ� ������̼�(Annotation)
	public String toString() {
		return "Member [name1=" + name1 + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + ", name5="
				+ name5 + "]";
	}

}
