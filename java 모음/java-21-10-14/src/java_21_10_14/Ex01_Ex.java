package java_21_10_14;

import java.util.Scanner;

public class Ex01_Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int [] scores = null; // scores ��� �迭 �̸��� ����
		int studentNum = 0;
		int selectNo = 0;
		
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.���� ����Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------");
			System.out.print("����> ");
			selectNo = scan.nextInt();
			
			switch(selectNo){
				case 1:
					// �л��� �Է� �ް� �ش� �� ũ�⸦ ���� �迭�� ����
					System.out.print("�л���: ");
					studentNum = scan.nextInt();
					scores = new int [studentNum];
					break;
				case 2:
					// �迭�� ���� ������ ����
					for(int i = 0; i<scores.length; i++) {
						System.out.print((i+1)+"��° �л� ����: ");
						scores[i] = scan.nextInt();
					}
					break;
				case 3:
					// ����� ������ ���
					for(int i = 0; i<scores.length; i++) {
						System.out.println((i+1)+"��° �л� ����: "+ scores[i]);
					}
					break;
				case 4:
					int sum = 0, max = 0;
					double avg = 0.0;
					for(int i = 0; i<scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
						}
						sum += scores[i];
					}
					avg = sum / scores.length;
					avg = (double) sum / scores.length;
					System.out.println("�ְ�����: "+max);
					System.out.println("�������: "+avg);
			
					// �������� ����
					int temp = 0;
					for(int i = 0; i < scores.length; i++) {
						for(int j = 0; j < scores.length; j++) {
						if(scores[i]< scores[j]) {
							temp = scores[i];
							scores[i] = scores[j];
							scores[j] = temp;
						}
						}
					}
					for(int i = 0; i<scores.length; i++) {
						System.out.println(scores[i]);
					}
					break;
				case 5:
					run = false;
					//����
					break;
			}
		}

	}

}
