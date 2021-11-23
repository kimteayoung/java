package java_21_10_25_Ex03;

public class TestDTO {
	private int numver;
	private String val1;
	private String val2;

	public TestDTO() {

	}

	public TestDTO(int numver, String val1, String val2) {
		this.numver = numver;
		this.val1 = val1;
		this.val2 = val2;
	}

	@Override
	public String toString() {
		return "TestDTO [numver=" + numver + ", val1=" + val1 + ", val2=" + val2 + "]";
	}

	public int getNumver() {
		return numver;
	}

	public void setNumver(int numver) {
		this.numver = numver;
	}

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}

	public void setVal2(String val2) {
		this.val2 = val2;
	}
}
