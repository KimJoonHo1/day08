package day08;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Set
		 - HashSet
		 - TreeSet ���
		 HashSet
		 - ���� ������ �ȵȴ�.
		 - �������� �ߺ��� ������� �ʴ´�
		 */
		HashSet hs = new HashSet();
		hs.add("���");
		hs.add("���");
		hs.add("����");
		hs.add("���");
		System.out.println("hs : " + hs);
		hs.remove("���");
		System.out.println("hs : " + hs);
		
		ArrayList arr = new ArrayList();
		arr.add("���");
		arr.add("���");
		arr.add("����");
		arr.add("���");
		System.out.println("arr : " + arr);
	}

}
