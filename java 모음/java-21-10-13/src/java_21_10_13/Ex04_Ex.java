package java_21_10_13;

public class Ex04_Ex {

	public static void main(String[] args) {
		// 34, 555, 7879, 1111 �� ����ִ� ������ �迭 num�� �����ϰ�
		// �� �迭�� ����ִ� ���� for���� ���� ����غ��ÿ�.

		int[] num = { 34, 555, 7879, 1111 };
		for (int i = 0; i <= 3; i++) {
			num[i] += i;
			System.out.println(num[i]);
			
		}
		// num �迭�� ����� �������� ���հ� ��� ���
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("�հ�: " + sum);
		System.out.println("�հ�: " + sum / num.length);
	}

}
