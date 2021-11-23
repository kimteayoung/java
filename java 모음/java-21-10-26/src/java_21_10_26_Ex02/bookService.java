package java_21_10_26_Ex02;

import java.util.*;

import java_21_10_26_Ex01.BoardDTO;

public class bookService {
	public Map<Integer,bookDTO> Join (Map<Integer,bookDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		int clientNumber = clientMap.size() + 1;
		System.out.print("���̸�: ");
		String clientName = scan.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String clientphone = scan.nextLine();
		

		bookDTO num = new bookDTO(clientNumber, clientName, clientphone);

		clientMap.put(clientNumber,num);

		return clientMap;
	}
	public Map<Integer,bookDTO2> bookJoin (Map<Integer,bookDTO2> clientMap) {
		Scanner scan = new Scanner(System.in);
		int bookNumber = clientMap.size() + 1;
		System.out.print("������: ");
		String bookname = scan.nextLine();
		System.out.print("�۰�: ");
		String bookAuthor = scan.nextLine();
		System.out.print("���⿩��: ");
		String bookCheck = scan.nextLine();
		System.out.print("����ȸ��: ");
		String clientNumber = scan.nextLine();
		

		bookDTO2 num1 = new bookDTO2(bookNumber, bookname,bookAuthor,bookCheck,clientNumber);

		clientMap.put(bookNumber,num1);

		return clientMap;
}
	public void bookCheck(Map<Integer,bookDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�۹�ȣ: ");
		int bnumber = scan.nextInt();
		for (int i = 0; i < clientMap.size(); i++) {
			if (bnumber == clientMap.get(i).getClientNumber()) {
				int newHits = clientMap.get(i).getHits() + 1;
				clientMap.get(i).setHits(newHits);
				System.out.println(clientMap.get(i));
			} else {
				System.out.println("���� �Ұ����Դϴ�.");
			}
		}
		}
	public int bookcheck(Map<Integer,Integer> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����ȣ: ");
		int clientNumber = scan.nextInt();
		System.out.println("������ȣ: ");
		int bookNumber = scan.nextInt();

		int bookNumber2 = -1;

		for (int i = 0; i < clientMap.size(); i++) {
			if (clientNumber == clientMap.get(i).getClientNumber() && bookNumber.equals(clientMap.get(i).getBookNumber())) {
				bookNumber2 = i;
			}
		}
		return bookNumber2;
	}
}
