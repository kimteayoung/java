package java_21_10_12;

public class Ex03_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0; // 1,-2,3,-4,5,-6~
		int count = 1; // 1,2,3,4,5,6,~
		int s = 1; // ��ȣ�� ����
		boolean run = true;
		 while(run) {
			 sum += num;
			 if (sum >=100) {
				 run = false;
			 }else {
				 num = s* count;
				 s = -s;
				 count++;
			 }
		 }
		System.out.println("����: " + num);
		System.out.println("�հ�: " + sum);

	}

}
