package java_21_10_26_Ex01;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,BoardDTO> clientMap = new HashMap<>();
		boolean num1 = true;
		BoardService b = new BoardService();

		while (num1) {
			System.out.println("----------------------------------");
			System.out.println("1.�۾��� | 2.��ü ����ȸ | 3.�� ����ȸ | 4.�ۻ���");
			System.out.println("----------------------------------");
			System.out.println();
			int num2 = scan.nextInt();

			if (num2 == 1) {
				clientMap = b.boardWrite(clientMap);
			}else if(num2==2){
				b.boedListView(clientMap);
			}else if(num2==3) {
				b.boardView(clientMap);
			}else if(num2==4) {
		}
	}
	}
}
