package day08;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		
		str += "�ȳ��ϼ���.";
		System.out.println("str");
		
		System.out.println(str.equals("dasdas�ȳ��ϼ���"));
		System.out.println(str == "abcdefg�ȳ��ϼ���.");
		
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'd');
		
		System.out.println(str.charAt(0) - 32);
		System.out.println((char)(str.charAt(0) - 32));
	}

}
