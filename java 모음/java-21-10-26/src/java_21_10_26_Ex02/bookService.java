package java_21_10_26_Ex02;

import java.util.*;

import java_21_10_26_Ex01.BoardDTO;

public class bookService {
	public Map<Integer,bookDTO> Join (Map<Integer,bookDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		int clientNumber = clientMap.size() + 1;
		System.out.print("고객이름: ");
		String clientName = scan.nextLine();
		System.out.print("전화번호: ");
		String clientphone = scan.nextLine();
		

		bookDTO num = new bookDTO(clientNumber, clientName, clientphone);

		clientMap.put(clientNumber,num);

		return clientMap;
	}
	public Map<Integer,bookDTO2> bookJoin (Map<Integer,bookDTO2> clientMap) {
		Scanner scan = new Scanner(System.in);
		int bookNumber = clientMap.size() + 1;
		System.out.print("도서명: ");
		String bookname = scan.nextLine();
		System.out.print("작가: ");
		String bookAuthor = scan.nextLine();
		System.out.print("대출여부: ");
		String bookCheck = scan.nextLine();
		System.out.print("대출회원: ");
		String clientNumber = scan.nextLine();
		

		bookDTO2 num1 = new bookDTO2(bookNumber, bookname,bookAuthor,bookCheck,clientNumber);

		clientMap.put(bookNumber,num1);

		return clientMap;
}
	public void bookCheck(Map<Integer,bookDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호: ");
		int bnumber = scan.nextInt();
		for (int i = 0; i < clientMap.size(); i++) {
			if (bnumber == clientMap.get(i).getClientNumber()) {
				int newHits = clientMap.get(i).getHits() + 1;
				clientMap.get(i).setHits(newHits);
				System.out.println(clientMap.get(i));
			} else {
				System.out.println("대출 불가능입니다.");
			}
		}
		}
	public int bookcheck(Map<Integer,Integer> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("고객번호: ");
		int clientNumber = scan.nextInt();
		System.out.println("도서번호: ");
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
