package java_21_10_13;

public class Ex03_Array {

	public static void main(String[] args) {
		// ���� Ÿ���� number �迭 ��ü ���� (��, ũ��� �������� ���� ����)
		int[] number;
		// System.out.println(number[0]);
		int number1[];
		int[] number2 = null;
		String[] strVars = null;

		// �迭 �����ϸ鼭 �ʱ갪 ����
		int[] number3 = { 1, 3, 12, 100, 123 };
		String[] strVars1 = { "����", "�����ٶ�", "abcdef", "123!##" };

		// �迭�� ����� �� ����ϱ�(�ε��� Ȱ��)
		System.out.println(number3[0]); // 1
		System.out.println(number3[1]); // 3
		System.out.println(number3[2]); // 12
		System.out.println(number3[3]); // 100
		System.out.println(number3[4]); // 123
		System.out.println(strVars1[0]);
		System.out.println(strVars1[1]); 
		System.out.println(strVars1[2]); 
		System.out.println(strVars1[3]);
		// System.out.println(number3[5]); //out of bounds exception �߻�
	
		// �迭 ������ �ٲٱ�
		// number3 �迭�� 2�� �ε����� 99 ����
		System.out.println(number3[2]);
		number3[2] = 99;
		System.out.println(number3[2]);
		
		// �迭�� ũ�� (�� ���� �����Ͱ� �ִ���) Ȯ��
		System.out.println(number3.length);
		int number3Size = number3.length;
		System.out.println(number3Size);
		
		// number3 �迭�l ũ�� : 5
		// number3 �迭 �ε��� : 0~4
		
		// Ÿ�� ; ������
		// �̸� : number4
		// ũ�� : 3
		// �ε��� : 0~2
		
		int[] number4 = new int [3];
		System.out.println(number4[0]);
		number4[0] = 111;
		System.out.println(number4[0]);
		System.out.println(number4[3]);
		double[] number5 = new double[2];
		System.out.println(number5[0]);
		
		String[] strVars2 = new String[3];
		System.out.println(strVars2[0]);
		
		// 34, 555, 7898, 1111�� ����ִ� ������ �迭 num�� �����ϰ�
		// �� �迭�� ����ִ� ���� for���� ���� ����غ��ÿ�.
		int[] num = {34, 555, 7898, 1111};
		
		int[] num1 = new int[4];
		num[0] = 34;
		num[1] = 555;
		num[2] = 7898;
		num[3] = 1111;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[1]);
		}
		//num �迭�� ����� �������� ���հ� ��� ���
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[1];
		}
		System.out.println("�հ�: "+sum);
		System.out.println("�հ�: "+sum / num.length);
		

	}

}
