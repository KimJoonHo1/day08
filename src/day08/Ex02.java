package day08;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		Iterator it = arr.iterator();
		/*
		 * System.out.println(it.hasNext()); System.out.println(it.hasNext());
		 * System.out.println(it.hasNext()); System.out.println(it.hasNext());
		 * System.out.println(it.hasNext()); System.out.println(it.hasNext());
		 * System.out.println(it.next());
		 * 
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * 
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 */
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
