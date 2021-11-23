package ja_21_10_18;

public class TrainneeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trainee t1 = new Trainee("이름", 25, "2363", true);
		System.out.println(t1.name1);
		System.out.println(t1.name2);
		System.out.println(t1.name3);
		System.out.println(t1.name4);
		
		Trainee t2 = new Trainee("이름", 25);
		System.out.println(t2.name1);
		System.out.println(t2.name2);
		System.out.println(t2.name3);
		System.out.println(t2.name4);
		
		// afterSignup 메서드 호출
		t2.afterSignup("9730", true);
		System.out.println(t2.name1);
		System.out.println(t2.name2);
		System.out.println(t2.name3);
		System.out.println(t2.name4);
		
		// phoneNumberUpdate 메서드 호출
		t1.phoneNumberUpdate("2363");
		System.out.println(t2.name1);
		System.out.println(t2.name2);
		System.out.println(t2.name3);
		System.out.println(t2.name4);
		
		
		
	}
}
