package day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		
		HashMap<String, String> map = new HashMap<>();
		String key = null;
		String value = null;
		System.out.println("������ Ű �Է�");
		key = scanner.next();
		System.out.println("������ �� �Է�");
		value = scanner.next();
		map.put(key, value);
		System.out.println(map);
	}

}
