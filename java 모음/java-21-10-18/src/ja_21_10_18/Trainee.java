package ja_21_10_18;

public class Trainee {
	// �ʵ弱��
	String name1;
	int name2;
	// 2363
	String name3;
	boolean name4;

	// afterSignup
	// phoneNumberUpdate

	// ������ ����
	// ��� ������ �޾Ƽ� �ű� ����� ���ִ� ������
	Trainee(String name, int name2, String name3, boolean name4) {
		this.name1 = name;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}
	// �̸�, ���̸� �޾Ƽ� �ű� ����� ���ִ� ������
	Trainee(String name, int name2){
		this.name1 = name;
		this.name2 = name2;
	}
	// �޼��� ����
	void afterSignup(String name3, boolean name4) {
		this.name3 = name3;
		this.name4 = name4;
		System.out.println("��� �Ϸ�");
	}
	void phoneNumberUpdate(String name5) {
		this.name3 = name5;
		System.out.println("����Ϸ�");

	}
}
