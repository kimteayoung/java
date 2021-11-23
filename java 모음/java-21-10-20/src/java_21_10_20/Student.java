package java_21_10_20;

public class Student {

	String name;
	int age;
	String studentNumber;

	// 생성자 형식을 다양하게 쓸 수있다 => 생성자 오버로딩

	// 기본생성자
	Student() {

	}

	// 매개변수가 있는생성자
	Student(String name, int age, String StudentNumber) {
		// super(); // 부모 클래스 생성자를 호출
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	// toString 메서드.
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNumber=" + studentNumber + "]";
	}

	// 필드 출력용 메서드
	void view() {
		System.out.println("필드값 출력");
		System.out.println("name");
		System.out.println("age");
		System.out.println("studentNumber");
	}

}
