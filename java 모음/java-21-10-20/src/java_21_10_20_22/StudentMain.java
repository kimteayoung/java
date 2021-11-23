package java_21_10_20_22;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 담을 수 있는 ArrayList 선언
		List<Student> studentList = new ArrayList<>();
		
		Student stu1 = new Student();
		
		// stu1 객체의 name 필드값을 저장
		// stu1.name = "학생";
		stu1.setName("학생1");
		
		// stu1 객체의 name 필드값 출력
		//System.out.println(stu1.name); 이렇게하면 안됨
		System.out.println(stu1.getName()); //앞에 get 써주자

		stu1.setAge(22);
		stu1.setStudentNumber("20211020");
		
		//stu1 객체를 studentList에 저장
		studentList.add(stu1);
		
		Student stu2 = new Student("학생",20, "202100000");
		//stu2 객체를 studenList에 저장
		studentList.add(stu2);
		
		//for문을 사용하여 studentNumber 출력
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
