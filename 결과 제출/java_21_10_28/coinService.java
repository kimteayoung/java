package java_21_10_28;

import java.util.*;

public class coinService {

	public List<coinDTO> insert(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��õ�� �̻� ���� ���ϡ�");
		System.out.print("������ �־��ּ���: ");
		int coinInsert = scan.nextInt();
		if (coinInsert >= 1000 && coinInsert <= 10000) {
			System.out.println("�����մϴ�. ������ �����Ͽ� �ֽʽÿ�.");
		} else if (coinInsert < 1000) {
			System.out.println("�ݾ��� �����ϴ�. �� �������ʽÿ�.");
		} else if (coinInsert > 10000) {
			System.out.println("���� �̻���ʹ� �ҹ��������� �����Ͽ� ������ �Ű��ϰڽ��ϴ�.");
		}

		coinDTO num1 = new coinDTO(coinInsert, 0, 0, 0);

		coinList.add(num1);

		return coinList;
	}

	public List<coinDTO> mini1(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ȧ,¦�� ������ �ֽʽÿ�.: ");
		String mini1 = scan.nextLine();
		int i = ((int) (Math.random() * 10));
		System.out.print(i);
		String sum1 = null;
		if (i % 2 == 0) {
			sum1 = "¦";
		} else if (i % 2 == 1) {
			sum1 = "Ȧ";
		}
		if (mini1.equals(sum1)) {
			System.out.println("����");
			long balance = coinList.get(0).getCoinInsert() * 2;
			System.out.println("������Ȳ" + balance);
		} else {
			System.out.println("���");
			long balance = coinList.get(0).getCoinInsert() / 2;
			System.out.println("������Ȳ" + balance);

		}
		return coinList;
	}

	public List<coinDTO> mini2(List<coinDTO> coinList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~10���� �ϳ��� ���ʷ� �����ּ���. ���߰� ������ 0�� �Է����ּ���.");
		System.out.print("�Է¶�: ");
		int mini2 = scan.nextInt();
		int i = ((int) (Math.random() * 10) + 1);
		System.out.print(i);
		boolean run = true;
		while (run) {

			if (mini2 <= i && mini2 != 0) {
				System.out.println("�����Դϴ�!");
				long balance = coinList.get(0).getCoinInsert() * 2;
				System.out.print("�Է¶�:");
				mini2 = scan.nextInt();
			} else if (mini2 > i) {
				System.out.println("�����Դϴ�..");
				long balance = coinList.get(0).getCoinInsert() / 2;
				run = false;
			} else if (mini2 == 0) {
				System.out.println("����� ���߼̽��ϴ�.");
				long balance = coinList.get(0).getCoinInsert() * 2;
				run = false;
			}
		}
		System.out.println("������ �����մϴ�.");
		long balance = coinList.get(0).getCoinInsert();
		System.out.println("������Ȳ" + balance);

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