package day08;

import java.util.ArrayList;
import java.util.Arrays;


public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("tESt sTring   change       first");
		String changeStr = new String();
		System.out.println("변경 전 : " + str);
		ArrayList list = new ArrayList();
		
		String[] ch = str.split(" ");
		for(int i=0; i<ch.length; i++) {
			list.add(ch[i]);
		}
		
		for(int i=0; i<list.size(); i++) {
			String save = (String) list.get(i);
			String check[] = save.split("");
			for(int j=0; j<check.length; j++) {
				if(j == 0) {
					String s = check[j].toUpperCase();
					check[j] = s;
				}
			}
			String addr[] = new String[check.length];
			for(int j=0; j<check.length; j++) {
				addr[i] += check[j];
			}
			
			System.out.println(addr[i]);
			
		}
//		System.out.print("변경 후 : ");
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i));
//		}
	}

}
