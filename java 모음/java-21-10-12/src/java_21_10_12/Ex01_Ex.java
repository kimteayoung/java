package java_21_10_12;

import java.util.Scanner;

public class Ex01_Ex {
	public static final String ANSWERC = "����";

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String inputString = "";
		boolean run = true;
		String ANSWER = "����";
	        // ���α׷��� �����ϴ� Ű������ ���ᰡ ���� �ٲ��� ���� ���
		final String answer = "����";
		// final Ű���带 ���� ������ �������� �ٲ� �� ����.
		// ANSWER = "�ٸ� �� ����"
		do {
			System.out.print(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if(inputString.equals(ANSWER)) {
				run = false;
			}
		}while(run);
		
	}
	}


