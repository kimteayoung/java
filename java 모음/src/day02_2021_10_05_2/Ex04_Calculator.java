package day02_2021_10_05_2;

import java.util.Scanner;

public class Ex04_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� ����
		// ��ĳ�ʸ� �̿��Ͽ� ���� 2���� ���� �Է¹ް� �Է¹��� ������ ���� ����غ�����.
		Scanner scan = new Scanner(System.in);
		
		int name1 = 0, name2 = 0;
		System.out.print("���ڸ� �Է��ϼ���: ");
	    name1 = scan.nextInt();
	    System.out.print("���ڸ� �Է��ϼ���: ");
	    name2 = scan.nextInt();
	    System.out.println("=" + ( name1 + name2 ));


	}

}
