package java_21_10_07;


import java.util.Scanner;

public class Ex06_forEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = 0, num1 = 0;
		System.out.print("시작값: ");
		num = scan.nextInt();
		System.out.print("끝값: ");
		num1 = scan.nextInt();
		
		int num2 = 0;
		for(int i=num; i<=num1; i++) {
			num2 += i;
			System.out.print(i);
			if(i < num1) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		}
			System.out.println(num2);
			System.out.println(num + "부터 " + num1 + "까지의 합은 " + num2 + "입니다");
			
		}

}
