package java_21_10_26_Ex01;

import java.util.*;



public class BoardService {
	
	public Map<Integer,BoardDTO> boardWrite(Map<Integer,BoardDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		int bnumber = clientMap.size() + 1;
		System.out.print("�ۼ���: ");
		String writer = scan.nextLine();
		System.out.print("����: ");
		String title = scan.nextLine();
		System.out.print("����: ");
		String contents = scan.nextLine();
		System.out.print("��й�ȣ: ");
		String password = scan.nextLine();
		

		BoardDTO num = new BoardDTO(bnumber, writer, title, contents, password);

		clientMap.put(bnumber,num);

		return clientMap;
	}
	public void boedListView(Map<Integer,BoardDTO> clientMap) {
		BoardDTO num = null;
		for (int a : clientMap.keySet()) {
			num = clientMap.get(a);
			System.out.println(a);
			System.out.println(num);
			System.out.println(clientMap.get(a));
		}
	}
	public void boardView(Map<Integer,BoardDTO> clientMap) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�۹�ȣ: ");
		int bnumber = scan.nextInt();
		for (int i = 0; i < clientMap.size(); i++) {
			if (bnumber == clientMap.get(i).getBnumber()) {
				int newHits = clientMap.get(i).getHits() + 1;
				clientMap.get(i).setHits(newHits);
				System.out.println(clientMap.get(i));
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
		public Map<Integer,BoardDTO> boardDelete(Map<Integer,BoardDTO> clientMap) {
			int checkResult = boardcheck(clientMap);
			clientMap.remove(checkResult);
			return clientMap;
		
	}
		public int boardcheck(Map<Integer,BoardDTO> clientMap) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�۹�ȣ: ");
			int bnumber = scan.nextInt();
			System.out.println("��й�ȣ: ");
			String password = scan.nextLine();

			int boardNumber = -1;

			for (int i = 0; i < clientMap.size(); i++) {
				if (bnumber == clientMap.get(i).getBnumber() && password.equals(clientMap.get(i).getPassword())) {
					boardNumber = i;
				}
			}
			return boardNumber;
		}
		
}
