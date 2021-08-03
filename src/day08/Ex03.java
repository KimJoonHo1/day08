package day08;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("¿œ");
		set.add("¿Ã");
		set.add("ªÔ");
		System.out.println("set : " + set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}

}
