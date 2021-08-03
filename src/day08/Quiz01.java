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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch(select) {
				case 1:
					System.out.print("메뉴 입력 : ");
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
						System.out.println("존재하는 메뉴입니다.");
					} else {
						System.out.print("가격 입력 : ");
						int value = scanner.nextInt();
						map.put(menu, value);
						System.out.println("등록되었습니다.");
					}
					break;
				case 2:
					if(map.isEmpty()) {
						System.out.println("아직 등록된 메뉴가 없습니다.");
					} else {
						set = map.keySet();
						it = set.iterator();
						while(it.hasNext()) {
							String key = (String) it.next();
							int value = (Integer) map.get(key);
							System.out.println(key + " : " + value);
						}
						System.out.println("1.수정 2.삭제 3.나가기");
						System.out.print(">>>");
						int sw =  scanner.nextInt();
						switch(sw) {
							case 1:
								System.out.print("변경할 메뉴이름 입력 : ");
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
									System.out.print("수정 가격 입력 : ");
									int valueChange = scanner.nextInt();
									System.out.println(map.get(nameChange) + " -> " + valueChange);
									System.out.println("변경 완료되었습니다 !");
									map.put(nameChange, valueChange);
								} else {
									System.out.println("메뉴가 없습니다");
								}
								break;
							case 2:
								System.out.print("삭제할 메뉴 입력 : ");
								String removeMenu = scanner.next();
								Object obj = map.remove(removeMenu);
								if(obj == null) {
									System.out.println("메뉴가 없습니다.");
								} else {
									System.out.println("삭제가 완료되었습니다.");
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
					System.out.println("비정상 입력으로 종료합니다.");
					System.exit(1);
			}
		}
	}

}
