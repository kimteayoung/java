package java_21_10_20;

import java.util.*; //ArrayList
//import java.util.List;
//import java.util.Scanner;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// ArrayList�� ����� �ȴܾ� 5���� ��ĳ�ʷ� �Է� �ް�
		// �Է¹��� �ܾ ��� ����Ͻÿ�.
		// �׸��� �Է¹��� �ܾ� �� ���� �� �ܾ ����Ͻÿ�.		
		
		String var1 =  "phone";
		System.out.println(var1.length()); // String ������ ���̸� ���
		
		Scanner scan = new Scanner(System.in);
       List<String> list1 = new ArrayList<String>();
		
       //�Է�
		String num1 = "";
		for(int i=0; i<5; i++) {
			System.out.print("�ܾ��Է�:");
			num1 = scan.nextLine();
			list1.add(num1);
		}
			//���
			for(int i=0; i<list1.size(); i++){
				System.out.println(list1.get(i));
			}
		
			// ��ܾ� ã��
			int num2 = 0;
			// 0�� �ε����� ����� �������� ���̰� ���
		   System.out.println(list1.get(0).length());
		   
			for(int i=1; i<list1.size(); i++) {
				if(list1.get(num2).length() < list1.get(i).length()) {
					num2 = i;
					
				}
					
				}
			System.out.println("���� �� �ܾ��:" + list1.get(num2));
			}
		
	}


