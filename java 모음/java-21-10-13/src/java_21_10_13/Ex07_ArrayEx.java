package java_21_10_13;

import java.util.Scanner;

public class Ex07_ArrayEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = null;
		
		System.out.print("배열크기: ");
		int size = scan.nextInt();
		
		num = new int [size];
		
		System.out.println(num.length);

	}

}
