package java_21_10_26_Ex02;

import java.util.*;

import java_21_10_26_Ex01.BoardDTO;
import java_21_10_26_Ex01.BoardService;

public class bookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer,bookDTO> clientMap = new HashMap<>();
		boolean num1 = true;
		bookService b = new bookService();

		while (num1) {
			System.out.println("----------------------------------");
			System.out.println("1.ȸ����� | 2.������� | 3.�������� | 4.ȸ����� | 5.�������");
			System.out.println("----------------------------------");
			System.out.println();
			int num2 = scan.nextInt();

			if (num2 == 1) {
				clientMap = b.Join(clientMap);
			}else if(num2==2){
				
			}else if(num2==3) {
				
			}else if(num2==4) {
		}
	}

	}

}
