package java_21_10_07;

public class Ex05_forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력을 아래와 같이 나오도록 하시오
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			num += i; 
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
	}
		System.out.println(num);
	}
}
