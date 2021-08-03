package day08;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "It is a fun java programming";
		System.out.println("총 개수 : " + s.length());
		
		int countA = 0;
		int countG = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a') {
				countA++;
			}
			if(s.charAt(i) == 'g') {
				countG++;
			}
		}
		
		System.out.println("a 개수 : " + countA);
		System.out.println("g 개수 : " + countG);
	}

}
