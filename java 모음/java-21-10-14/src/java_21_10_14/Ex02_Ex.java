package java_21_10_14;

public class Ex02_Ex {

	public static void main(String[] args) {
		// ���� �˰���
		int[] num = {3, 2, 1, 5, 4};
		int temp = 0; // swap�� ���� �߰� ����� ����
		
		for(int i =0; i<num.length; i++) {
			System.out.println(i);
		}
		// ��ø for�� �̿��Ͽ� �����ϱ�
		for(int i = 0; i<num.length; i++) {
			for(int j = i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}	
		}
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
