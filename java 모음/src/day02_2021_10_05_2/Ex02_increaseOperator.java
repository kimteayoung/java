package day02_2021_10_05_2;

public class Ex02_increaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		int result = 0, var = 10;
		System.out.println("result: " + result + "var" + var);
		result = 10 + var++;
		System.out.println("result: " + result + "var" + var);
		result = 10 + var++;
		System.out.println("result: " + result + "var" + var);
		result = 10 + var--;
		System.out.println("result: " + result + "var" + var);
		
		result = 0;
		var = 10;
		result = 10 + ++var;
		System.out.println("result: " + result + "var" + var);
		result = 10 + ++var;
		System.out.println("result: " + result + "var" + var);
		

	}

}
