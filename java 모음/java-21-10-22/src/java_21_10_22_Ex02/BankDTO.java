package java_21_10_22_Ex02;

public class BankDTO {
	private String name; //���̸�
	private int number;  //���¹�ȣ
	private int number1; //����ȣ
	private int coin;  //�ܾ�
	private int deposit; //�Ա�
	private int withdraw; //���

	public BankDTO() {

	}
	public BankDTO(String name, int number) {
		this.name = name;
		this.number = number;
	
	}
	

	public BankDTO(String name, int number, int number1, int coin) {
		super();
		this.name = name;
		this.number = number;
		this.number1 = number1;
		this.coin = coin;
}

	@Override
	public String toString() {
		return "BankDTO [name=" + name + ", number=" + number + ", number1=" + number1 + ", coin=" + coin + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}
}