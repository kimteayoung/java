package java_21_10_07;

public class Ex10_ForEx {

	public static void main(String[] args) {
		// 4x + 5y =60 �� �����ϴ� x,y ���� ����ϼ���.
		// (x,y�� 1���� ũ�� 10���� ���� ����)
		// ��: 5,8 10,4

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("x: " + x + "\ty: " + y);
				}
			}
		}
	}

}
