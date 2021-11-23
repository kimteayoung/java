package ja_21_10_18;

public class Trainee {
	// 필드선언
	String name1;
	int name2;
	// 2363
	String name3;
	boolean name4;

	// afterSignup
	// phoneNumberUpdate

	// 생성자 선언
	// 모든 정보를 받아서 신규 등록을 해주는 생성자
	Trainee(String name, int name2, String name3, boolean name4) {
		this.name1 = name;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}
	// 이름, 나이만 받아서 신규 등록을 해주는 생성자
	Trainee(String name, int name2){
		this.name1 = name;
		this.name2 = name2;
	}
	// 메서드 선언
	void afterSignup(String name3, boolean name4) {
		this.name3 = name3;
		this.name4 = name4;
		System.out.println("등록 완료");
	}
	void phoneNumberUpdate(String name5) {
		this.name3 = name5;
		System.out.println("변경완료");

	}
}
