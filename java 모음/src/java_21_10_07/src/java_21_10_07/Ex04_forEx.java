package java_21_10_07;

public class Ex04_forEx {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 10까지 합계 구하기
		// for문을 이용해서 1부터 10까지 숫자를 만들어야 하고 이숫자들을 더하는 과정이 필요.
		// 합계를 구하기 위한 변수가 하나 필요함.
		// 55 int i = 0;
		int i = 0;
		int num = 0;
		for (i = 1; i <= 10; i++) {
			System.out.print("i: " + i);
			num = num + i;
			System.out.println("\t num: " + num);
		}
		System.out.print("합계: " + num);

	}
}
