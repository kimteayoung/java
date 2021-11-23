package java_21_10_20;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// Student ��ü�� ���� �� �ִ� ArrayList ����
		List<Student> studentList = new ArrayList<>();

		// Student ��ü ���� -1
		Student stu1 = new Student();
		stu1.name = "�л�1";
		stu1.age = 22;
		stu1.studentNumber = "20211234";
		// Student ��ü ���� - 2
		Student stu2 = new Student("�л�", 20, "20213333");

		// Student ��ü�� list�� ����
		studentList.add(stu1);
		studentList.add(stu2);

		// Student ��ü�� ������ �ִ� �ʵ尪 ���
		System.out.println(studentList.get(0).name);
		System.out.println(studentList.get(1).name);

		// stu1�� ������ �ִ� (��,0�� �ε����� ���) view() �޼��� ȣ��
		studentList.get(0).view();
		System.out.println(studentList.get(0).toString());

		// StudentList �� ��� stu2�� �̸� ����
		studentList.get(1).name = "�л�2 �̸�����";

		// foreach�� ����غ���
		for (Student s : studentList) {
			System.out.println(s.name);
			System.out.println(s.toString());
			s.view();
		}
		// for
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).name);
			System.out.println(studentList.get(i).toString());
			studentList.get(i).view();
		}

	}

}
