package java_21_10_13;

public class Ex04_Ex {

	public static void main(String[] args) {
		// 34, 555, 7879, 1111 이 들어있는 정수형 배열 num을 선언하고
		// 이 배열에 들어있는 값을 for문을 통해 출력해보시오.

		int[] num = { 34, 555, 7879, 1111 };
		for (int i = 0; i <= 3; i++) {
			num[i] += i;
			System.out.println(num[i]);
			
		}
		// num 배열에 저장된 데이터의 총합과 평균 계산
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계: " + sum);
		System.out.println("합계: " + sum / num.length);
	}

}
