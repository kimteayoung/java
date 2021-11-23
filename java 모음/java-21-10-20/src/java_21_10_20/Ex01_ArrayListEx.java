package java_21_10_20;

import java.util.*; //ArrayList
//import java.util.List;
//import java.util.Scanner;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// ArrayList에 영어로 된단어 5개를 스캐너로 입력 받고
		// 입력받은 단어를 모두 출력하시오.
		// 그리고 입력받은 단어 중 가장 긴 단어를 출력하시오.		
		
		String var1 =  "phone";
		System.out.println(var1.length()); // String 데이터 길이를 출력
		
		Scanner scan = new Scanner(System.in);
       List<String> list1 = new ArrayList<String>();
		
       //입력
		String num1 = "";
		for(int i=0; i<5; i++) {
			System.out.print("단어입력:");
			num1 = scan.nextLine();
			list1.add(num1);
		}
			//출력
			for(int i=0; i<list1.size(); i++){
				System.out.println(list1.get(i));
			}
		
			// 긴단어 찾기
			int num2 = 0;
			// 0번 인덱스에 저장된 데이터의 길이값 출력
		   System.out.println(list1.get(0).length());
		   
			for(int i=1; i<list1.size(); i++) {
				if(list1.get(num2).length() < list1.get(i).length()) {
					num2 = i;
					
				}
					
				}
			System.out.println("가장 긴 단어는:" + list1.get(num2));
			}
		
	}


