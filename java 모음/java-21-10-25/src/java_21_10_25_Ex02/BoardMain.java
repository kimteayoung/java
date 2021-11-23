package java_21_10_25_Ex02;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BoardDTO> clientList = new ArrayList<BoardDTO>();
		boolean num1 = true;
		BoardService b = new BoardService();

		while (num1) {
			System.out.println("----------------------------------");
			System.out.println("1.�۾��� | 2.��ü ����ȸ | 3.�� ����ȸ | 4.�ۻ���");
			System.out.println("----------------------------------");
			System.out.println();
			int num2 = scan.nextInt();
			
			if (num2 == 1) {
				clientList = b.boardWrite(clientList);
			} else if (num2 == 2) {
				b.boedListView(clientList);
			} else if (num2 == 3) {
				b.boardView(clientList);
			}else if (num2 == 4) {
				clientList = b.boardDelete(clientList);
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}

		}
	}
}
