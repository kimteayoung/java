package b_pkg;
//�Ҽ�: b_pkg
//���������� : public
public class B2 {

	public static void main(String[] args) {
		// B1 Ŭ���� ��ü ����
		// B1, B2 ���� ��Ű���� �ҼӵǾ� �ֱ� ������ import ���� �ʾƵ� ��
		B1 b1 = new B1();
		b1.a = "aa"; // ���� ��Ű�� �Ҽ��̱� ������ ���� ����
		b1.b = "bb";
		//b1.c = "cc"; // private �̱� ������ ���� �Ұ���
	}
}
