package java_21_10_13;

import java.util.Scanner;

public class Ex02_Ex_sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		while (run) {
			
//			if(select == 1) {
//				// ����
//			}else if (select == 2) {
//				// ���
//			}else if (select == 3) {
//				// �ܰ�
//			}else if (select == 4) {
//				// ����
//			}else {
//				// �߸��� ����
//			}
		
			boolean run = true;
			int balance = 0; // �ܰ�
			int deposit = 0; // �Աݾ�
			int withdraw = 0; // ��ݾ�
			int select = 0; // ��ɼ���
			Scanner scan = new Scanner (System.in); // Scanner Ŭ����Ÿ���� ���� scan
			System.out.println("---------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");
			select = scan.nextInt();
			switch(select) {
			case 1:
				// ����
				System.out.print("���ݾ�>");
				deposit = scan.nextInt();
				balance += deposit;
				System.out.println("�����ܾ��� "+balance+"�Դϴ�.");
				break;
			case 2:
				// ���
				System.out.println("��ݾ�>");
				withdraw = scan.nextInt();
				if(withdraw > balance) {
					System.out.println("�ܰ� �����մϴ�.");
					System.out.println("�����ܾ���" + balance+"�Դϴ�.");
				}else {
					balance -= withdraw;
					System.out.println("�����ܾ���" + balance+"�Դϴ�.");
				}
				break;
			case 3:
				System.out.println("�����ܾ���" + balance+"�Դϴ�.");
				break;
			case 4:
				System.out.println("����");
				break;
		}
			
		}

	}

