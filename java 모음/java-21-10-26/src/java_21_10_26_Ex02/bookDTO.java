package java_21_10_26_Ex02;

public class bookDTO {
	private int clientNumber; //고객번호
	private String clientName; //고객이름
	private String clientphone; // 전화번호

	public bookDTO() {

	}

	public bookDTO(int clientNumber, String clientName,String clientphone) {
		this.clientName = clientName;
		this.clientNumber = clientNumber;
		this.clientphone = clientphone;

	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientphone() {
		return clientphone;
	}

	public void setClientphone(String clientphone) {
		this.clientphone = clientphone;
	}

	@Override
	public String toString() {
		return "bookDTO [clientNumber=" + clientNumber + ", clientName=" + clientName + ", clientphone=" + clientphone
				+ "]";
	}

}
