package java_21_10_13;

import java.util.Scanner;

public class Ex06_ArrayEx {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
		// ��ĳ�ʷ� ���� ���� ��
		// �Է¹��� �� �߿��� ���� ū ���� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		// �迭�� �� �ֱ�
		for (int i = 0; i < num.length; i++) {
			System.out.print("���� �Է�: ");
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
			
			}
		// �ִ� ã��
//		for (int i =0; i<num.length; i++) {
//			if(max < num[i]) {
//				max = num[i];
			
		
		System.out.println("�ִ�: " + max);
	}
//	if(num[0]<num[1]<num[2]<num[3]<num[4]<num[5]) {
//		System.out.println("ū��: " + num[5]);
//	}else if(num[1]<num[2]<num[3]<num[4]<num[5]<num[0]) {
//		System.out.println("ū��: " + num[0]);
//	}else if(num[2]<num[3]<num[4]<num[5]<num[0]<num[1]) {
//		System.out.println("ū��: " + num[1]);
//	}else if(num[3]<num[4]<num[5]<num[0]<num[1]<num[2]) {
//		System.out.println("ū��: " + num[2]);
//	}else if(num[4]<num[5]<num[0]<num[1]<num[2]<num[3]) {
//		System.out.println("ū��: " + num[3]);
//	}else if(num[5]<num[0]<num[1]<num[2]<num[3]<num[4]) {
//		System.out.println("ū��: " + num[4]);
}
