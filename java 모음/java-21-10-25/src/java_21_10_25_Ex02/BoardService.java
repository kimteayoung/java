package java_21_10_25_Ex02;

import java.util.*;

public class BoardService {

	public List<BoardDTO> boardWrite(List<BoardDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		int bnumber = clientList.size() + 1;
		System.out.print("작성자: ");
		String writer = scan.nextLine();
		System.out.print("제목: ");
		String title = scan.nextLine();
		System.out.print("내용: ");
		String contents = scan.nextLine();
		System.out.print("비밀번호: ");
		String password = scan.nextLine();

		BoardDTO num = new BoardDTO(bnumber, writer, title, contents, password);

		clientList.add(num);

		return clientList;
	}

	public void boedListView(List<BoardDTO> clientList) {
		for (BoardDTO a : clientList) {
			System.out.println(a);
		}
	}

	public void boardView(List<BoardDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호: ");
		int bnumber = scan.nextInt();
		for (int i = 0; i < clientList.size(); i++) {
			if (bnumber == clientList.get(i).getBnumber()) {
				int newHits = clientList.get(i).getHits() + 1;
				clientList.get(i).setHits(newHits);
				System.out.println(clientList.get(i));
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}

	}

	public List<BoardDTO> boardDelete(List<BoardDTO> clientList) {
		int checkResult = boardcheck(clientList);
		clientList.remove(checkResult);
		return clientList;
	}

	public List<BoardDTO> boardUpdate(List<BoardDTO> clientList) {
		int checkResult = boardcheck(clientList);

		if (checkResult >= 0) {
			Scanner scan = new Scanner(System.in);
			System.out.print("수정제목: ");
			String title = scan.next();
			System.out.println("수정내용: ");
			String contents = scan.next();
			clientList.get(checkResult).setTitle(title);
			clientList.get(checkResult).setTitle(contents);
		}
		return clientList;
	}

	public int boardcheck(List<BoardDTO> clientList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("글번호: ");
		int bnumber = scan.nextInt();
		System.out.println("비밀번호: ");
		String password = scan.nextLine();

		int boardNumber = -1;

		for (int i = 0; i < clientList.size(); i++) {
			if (bnumber == clientList.get(i).getBnumber() && password.equals(clientList.get(i).getPassword())) {
				boardNumber = i;
			}
		}
		return boardNumber;
	}
}
