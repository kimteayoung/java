package java_21_10_20_22;

public class Student {
	private String name;
	private int age;
	private String studentNumber;

	//기본생성자
	public Student() {
		
	}
	//매개변수가 있는 생성자
	public Student(String name, int age, String studentNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}
   
	// name필드값을 저장하는 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNumber=" + studentNumber + "]";
	}
	

}
