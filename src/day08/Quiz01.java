package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		Scanner scanner = new Scanner(System.in);
		
		Set set = null;
		Iterator it = null;
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.����");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch(select) {
				case 1:
					System.out.print("�޴� �Է� : ");
					String menu = scanner.next();
					set = map.keySet();
					it = set.iterator();
					int check = 0;
					while(it.hasNext()) {
						String keyMenu = (String) it.next();
						if(menu.equals(keyMenu)) {
							check = 1;
							break;
						}
					}
					if(check == 1) {
						System.out.println("�����ϴ� �޴��Դϴ�.");
					} else {
						System.out.print("���� �Է� : ");
						int value = scanner.nextInt();
						map.put(menu, value);
						System.out.println("��ϵǾ����ϴ�.");
					}
					break;
				case 2:
					if(map.isEmpty()) {
						System.out.println("���� ��ϵ� �޴��� �����ϴ�.");
					} else {
						set = map.keySet();
						it = set.iterator();
						while(it.hasNext()) {
							String key = (String) it.next();
							int value = (Integer) map.get(key);
							System.out.println(key + " : " + value);
						}
						System.out.println("1.���� 2.���� 3.������");
						System.out.print(">>>");
						int sw =  scanner.nextInt();
						switch(sw) {
							case 1:
								System.out.print("������ �޴��̸� �Է� : ");
								String nameChange = scanner.next();
								set = map.keySet();
								it = set.iterator();
								int ck = 0;
								while(it.hasNext()) {
									String key = (String) it.next();
									if(key.equals(nameChange)) {
										ck = 1;
									}
								}
								if(ck == 1) {
									System.out.print("���� ���� �Է� : ");
									int valueChange = scanner.nextInt();
									System.out.println(map.get(nameChange) + " -> " + valueChange);
									System.out.println("���� �Ϸ�Ǿ����ϴ� !");
									map.put(nameChange, valueChange);
								} else {
									System.out.println("�޴��� �����ϴ�");
								}
								break;
							case 2:
								System.out.print("������ �޴� �Է� : ");
								String removeMenu = scanner.next();
								Object obj = map.remove(removeMenu);
								if(obj == null) {
									System.out.println("�޴��� �����ϴ�.");
								} else {
									System.out.println("������ �Ϸ�Ǿ����ϴ�.");
								}
								break;
							case 3:
								break;
						}
					}
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("������ �Է����� �����մϴ�.");
					System.exit(1);
			}
		}
	}

}
