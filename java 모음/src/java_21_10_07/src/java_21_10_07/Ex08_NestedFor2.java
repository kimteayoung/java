package java_21_10_07;

public class Ex08_NestedFor2 {

	public static void main(String[] args) {
		// 중첩 for문을 활용하여 구구단을 출력해보시오.

		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j));
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}

}
