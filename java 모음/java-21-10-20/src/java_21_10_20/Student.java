package java_21_10_20;

public class Student {

	String name;
	int age;
	String studentNumber;

	// ������ ������ �پ��ϰ� �� ���ִ� => ������ �����ε�

	// �⺻������
	Student() {

	}

	// �Ű������� �ִ»�����
	Student(String name, int age, String StudentNumber) {
		// super(); // �θ� Ŭ���� �����ڸ� ȣ��
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	// toString �޼���.
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNumber=" + studentNumber + "]";
	}

	// �ʵ� ��¿� �޼���
	void view() {
		System.out.println("�ʵ尪 ���");
		System.out.println("name");
		System.out.println("age");
		System.out.println("studentNumber");
	}

}
