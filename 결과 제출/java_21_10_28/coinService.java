package java_21_10_28;

import java.util.*;

public class coinService {

	public List<coinDTO> insert(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("※천원 이상 만원 이하※");
		System.out.print("코인을 넣어주세요: ");
		int coinInsert = scan.nextInt();
		if (coinInsert >= 1000 && coinInsert <= 10000) {
			System.out.println("건전합니다. 게임을 선택하여 주십시오.");
		} else if (coinInsert < 1000) {
			System.out.println("금액이 적습니다. 더 가져오십시오.");
		} else if (coinInsert > 10000) {
			System.out.println("만원 이상부터는 불법도박으로 간주하여 경찰에 신고하겠습니다.");
		}

		coinDTO num1 = new coinDTO(coinInsert, 0, 0, 0);

		coinList.add(num1);

		return coinList;
	}

	public List<coinDTO> mini1(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("홀,짝을 선택해 주십시오.: ");
		String mini1 = scan.nextLine();
		int i = ((int) (Math.random() * 10));
		System.out.print(i);
		String sum1 = null;
		if (i % 2 == 0) {
			sum1 = "짝";
		} else if (i % 2 == 1) {
			sum1 = "홀";
		}
		if (mini1.equals(sum1)) {
			System.out.println("정답");
			long balance = coinList.get(0).getCoinInsert() * 2;
			System.out.println("코인현황" + balance);
		} else {
			System.out.println("노답");
			long balance = coinList.get(0).getCoinInsert() / 2;
			System.out.println("코인현황" + balance);

		}
		return coinList;
	}

	public List<coinDTO> mini2(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~10까지 하나씩 차례로 적어주세요. 멈추고 싶으면 0을 입력해주세요.");
		System.out.print("입력란: ");
		int mini2 = scan.nextInt();
		int i = ((int) (Math.random() * 10) + 1);
		System.out.print(i);
		boolean run = true;
		while (run) {

			if (mini2 <= i && mini2 != 0) {
				System.out.println("성공입니다!");
				long balance = coinList.get(0).getCoinInsert() * 2;
				System.out.print("입력란:");
				mini2 = scan.nextInt();
			} else if (mini2 > i) {
				System.out.println("실패입니다..");
				long balance = coinList.get(0).getCoinInsert() / 2;
				run = false;
			} else if (mini2 == 0) {
				System.out.println("계단을 멈추셨습니다.");
				long balance = coinList.get(0).getCoinInsert() * 2;
				run = false;
			}
		}
		System.out.println("게임을 종료합니다.");
		long balance = coinList.get(0).getCoinInsert();
		System.out.println("코인현황" + balance);

		return coinList;
	}

	public void coinView(List<coinDTO> coinList) {
		for(coinDTO b : coinList) {
			System.out.println(b);
		}
	}
	public List<coinDTO> coinView2(List<coinDTO> coinList) {
		//if(coinInsert == 0) {
			
		//}
		return coinList;
	}
}