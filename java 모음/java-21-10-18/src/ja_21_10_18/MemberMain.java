package ja_21_10_18;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member t1 = new Member("���̵�", "123", "�̸�", "�̸���");

		Member t2 = new Member();

		t2.memberJoin("���̵�", "123", "�̸�", "�̸���");

		// boolean loginResult = t1.memberLogin("���̵�", "123");
		// if(loginResult)
		// �ؿ��ִ°�ó�� �ٿ��� ������ ����
		if (t1.memberLogin("���̵�", "123")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		t1.myinfo();
		t2.myinfo();

		t1.memberUpdate("�̸���");
		t1.myinfo();

		System.out.println(t1);
		System.out.println(t2);

		// �α��� ���� ������ ���� Member ��ü ����
		Member loginMember = new Member();
		loginMember.name1 = "���̵�0123";
		loginMember.name2 = "1231230";
		
		//loginMember ��ü
	}

	
	
}
