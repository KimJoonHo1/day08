package day08;

import java.util.ArrayList;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Have a nice day Have a nice day Have a nice day";
		ArrayList list = new ArrayList();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a') {
				list.add(i);
			}
		}
		System.out.println("°á°ú : " + list);
	}

}
