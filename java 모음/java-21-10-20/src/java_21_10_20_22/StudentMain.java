package java_21_10_20_22;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// Student ��ü�� ���� �� �ִ� ArrayList ����
		List<Student> studentList = new ArrayList<>();
		
		Student stu1 = new Student();
		
		// stu1 ��ü�� name �ʵ尪�� ����
		// stu1.name = "�л�";
		stu1.setName("�л�1");
		
		// stu1 ��ü�� name �ʵ尪 ���
		//System.out.println(stu1.name); �̷����ϸ� �ȵ�
		System.out.println(stu1.getName()); //�տ� get ������

		stu1.setAge(22);
		stu1.setStudentNumber("20211020");
		
		//stu1 ��ü�� studentList�� ����
		studentList.add(stu1);
		
		Student stu2 = new Student("�л�",20, "202100000");
		//stu2 ��ü�� studenList�� ����
		studentList.add(stu2);
		
		//for���� ����Ͽ� studentNumber ���
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i).getStudentNumber());
			System.out.println(studentList.get(i).toString());
			System.out.println(studentList.get(i));
			
		}
		
		//foreach
		for(Student s : studentList) {
			System.out.println(s.getStudentNumber());
			System.out.println(s.toString());
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
