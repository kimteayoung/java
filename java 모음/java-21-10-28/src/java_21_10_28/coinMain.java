package java_21_10_28;

import java.util.*;

public class coinMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<coinDTO> coinList = new ArrayList<coinDTO>();
		boolean sum = true;
		coinService a = new coinService();

		while (sum) {
			System.out.println("------------------------------");
			System.out.println("1.코인입력 | 2.홀짝 | 3.다리게임 | 4.코인현황 | 5.계급현황 ");
			System.out.println("------------------------------");
			System.out.print("번호입력> ");
			int select = scan.nextInt();

			if (select == 1) {
				coinList = a.insert(coinList);
			} else if (select == 2) {
				coinList = a.mini1(coinList);
			} else if (select == 3) {
				coinList = a.mini2(coinList);
			} else if (select == 4) {
				a.coinView(coinList);
			}

		}

	}

}
