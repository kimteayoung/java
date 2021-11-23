package java_21_10_28;

public class coinDTO {
	private int coinInsert; // 코인넣기
	private int coinMini1; // 홀짝 게임
	private int coinMini2; // 계단게임
	private long balance; // 금액

	coinDTO() {

	}

	public coinDTO(int coinInsert, int coinMini1, int coinMini2, long balance) {
		super();
		this.coinInsert = coinInsert;
		this.coinMini1 = coinMini1;
		this.coinMini2 = coinMini2;
		this.balance = balance;
	}

	public int getCoinInsert() {
		return coinInsert;
	}

	public void setCoinInsert(int coinInsert) {
		this.coinInsert = coinInsert;
	}

	public int getCoinMini1() {
		return coinMini1;
	}

	public void setCoinMini1(int coinMini1) {
		this.coinMini1 = coinMini1;
	}

	public int getCoinMini2() {
		return coinMini2;
	}

	public void setCoinMini2(int coinMini2) {
		this.coinMini2 = coinMini2;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long Balance) {
		this.balance = balance;
	}

@Override
public String toString() {
	return "coinDTO [coinInsert=" + coinInsert + ", coinMini1=" + coinMini1 + ", coinMini2=" + coinMini2
			+ ", balance=" + balance + "]";
}



}