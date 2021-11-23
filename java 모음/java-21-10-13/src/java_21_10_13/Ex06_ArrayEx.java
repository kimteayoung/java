package java_21_10_13;

import java.util.Scanner;

public class Ex06_ArrayEx {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하고
		// 스캐너로 값을 받은 뒤
		// 입력받은 값 중에서 가장 큰 값을 출력하시오.
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		// 배열에 값 넣기
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력: ");
			num[i] = scan.nextInt();
			if(max < num[i]) {
				max = num[i];
			}
			
			}
		// 최댓값 찾기
//		for (int i =0; i<num.length; i++) {
//			if(max < num[i]) {
//				max = num[i];
			
		
		System.out.println("최댓값: " + max);
	}
//	if(num[0]<num[1]<num[2]<num[3]<num[4]<num[5]) {
//		System.out.println("큰값: " + num[5]);
//	}else if(num[1]<num[2]<num[3]<num[4]<num[5]<num[0]) {
//		System.out.println("큰값: " + num[0]);
//	}else if(num[2]<num[3]<num[4]<num[5]<num[0]<num[1]) {
//		System.out.println("큰값: " + num[1]);
//	}else if(num[3]<num[4]<num[5]<num[0]<num[1]<num[2]) {
//		System.out.println("큰값: " + num[2]);
//	}else if(num[4]<num[5]<num[0]<num[1]<num[2]<num[3]) {
//		System.out.println("큰값: " + num[3]);
//	}else if(num[5]<num[0]<num[1]<num[2]<num[3]<num[4]) {
//		System.out.println("큰값: " + num[4]);
}
