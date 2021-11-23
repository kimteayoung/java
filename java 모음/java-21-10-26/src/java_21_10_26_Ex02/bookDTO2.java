package java_21_10_26_Ex02;

public class bookDTO2 {
	private int bookNumber;
	private String bookname;
	private String bookAuthor;
	private String bookCheck;
	private String clientNumber;
	
	public bookDTO2() {
	}
	public bookDTO2(int bookNumber,String bookname,String bookAuthor,String bookCheck,String clientNumber) {
		this.bookAuthor = bookAuthor;
		this.bookCheck = bookCheck;
		this.bookname = bookname;
		this.bookNumber = bookNumber;
		this.clientNumber = clientNumber;

	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookCheck() {
		return bookCheck;
	}
	public void setBookCheck(String bookCheck) {
		this.bookCheck = bookCheck;
	}
	public String getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}
	@Override
	public String toString() {
		return "bookDTO2 [bookNumber=" + bookNumber + ", bookname=" + bookname + ", bookAuthor=" + bookAuthor
				+ ", bookCheck=" + bookCheck + ", clientNumber=" + clientNumber + "]";
	}


}
