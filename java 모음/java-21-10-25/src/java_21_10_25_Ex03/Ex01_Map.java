package java_21_10_25_Ex03;

import java.util.HashMap;
import java.util.Map;

public class Ex01_Map {

	public static void main(String[] args) {
		// �ʼ���
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();

		// �ʿ� ������ ����
		map1.put(1, "������1");
		map1.put(2, "������2");
		map1.put(11, "������3");

		// �ʿ� ��� ������ ���
		System.out.println(map1.get(1));
		System.out.println(map1.get(11));

		map1.put(11, "������33333333");
		System.out.println(map1.get(11));

		// �ݺ����� Ȱ��
		for (Integer n : map1.keySet()) {
			String s = map1.get(n);
			System.out.println("Ű?" +n);

			System.out.println(map1.get(n));
		}

		Map<String, Integer> map3 = new HashMap<>();
		map3.put("Ű1", 1234);
		map3.put("ŰŰŰŰ1", 55555);
		map3.put("aaaa", 123123);

		System.out.println(map3.get("ŰŰŰ1"));

		for (String v : map3.keySet()) {
			System.out.print("Ű��: " + v);
			System.out.println("\t�����: " + map3.get(v));
		}
		// �� ������ ����
		map3.remove("aaaa");
		
		
		// TestDTO�� ��� map ����
		Map<Integer, TestDTO> testMap = new HashMap<>();
		
		//TestDTO ��ü 3�� �����
		TestDTO test1 = new TestDTO(1, "aaa", "aaa");
		TestDTO test2 = new TestDTO(2, "bbb", "bbb");
		TestDTO test3 = new TestDTO(3, "ccc", "ccc");
		
		testMap.put(1, test1);
		testMap.put(2, test2);
		testMap.put(3, test3);
		
		// key ���� 2�� ���� ����� ������ ���
		System.out.println(testMap.get(2)); // => test2 ��ü
		
		for(Integer i : testMap.keySet()) {
			System.out.println(testMap.get(i));
		}
		// �� ũ�� Ȯ��
		System.out.println(testMap.size());
		
		
		
		
		
		
		
		
		
		

	}

}
