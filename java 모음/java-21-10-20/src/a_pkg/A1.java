package a_pkg;

//���� �ٸ� ��Ű���� �ҼӵǾ� �ֱ� ������
//A1 Ŭ������ B1 Ŭ������ ����Ϸ��� import�� �������.
import b_pkg.B1;

// �Ҽ�: a_pkg
// ���������� : public

public class A1 {
	public static void main(String[] args) {
	B1 b1 = new B1();
	b1.b = "aaa";
	// not visiable: ������ �ʴ´�(������ �Ұ����ϴ�)
	// a�� default ���������̱� ������ �ٸ���Ű������ ���� �Ұ�
    //b1.a = "bbb";
	
	//b1.c = "ccc";
	
	// �ٸ���Ű���� �Ҽӵ� A1 Ŭ������
	//defaulte�� ������ B3�� ����� �� �ִ���
	//defaulte�� ���� ��Ű�������� ���� ����
	
	//B3 b3 = new B3();
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
