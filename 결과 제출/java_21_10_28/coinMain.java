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
			System.out.println("1.�����Է� | 2.Ȧ¦ | 3.�ٸ����� | 4.������Ȳ | 5.�����Ȳ ");
			System.out.println("------------------------------");
			System.out.print("��ȣ�Է�> ");
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
