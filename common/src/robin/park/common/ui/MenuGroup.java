package robin.park.common.ui;

import java.util.ArrayList;
import java.util.Scanner;

//composite pattern : 부분-전체 계층을 표현하는 패턴

public class MenuGroup extends Menu {
	
	public MenuGroup() {		// 자기 자신의 다른 생성자 호출 (매개변수 : null)
		this(null);
	}
	
	public MenuGroup(String title) {	// 항상 이 생성자를 통해 인스턴스 생성
		super(title);		// 부모 class인 Menu의 생성자 호출
		menuList = new ArrayList<Menu>();
	}


	// 부모 class인 Menu의 abstract 메소드 재정의 (overriding)
	@Override
	public void execute() throws Exception {
		if(title != null) {
			System.out.printf("[%s] ", title);		// 문자열 출력
		}
		
		for(int i=0; i<menuList.size(); i++) {
			Menu menu = menuList.get(i);
			if(menu.getMenuList() != null) {		// 서브메뉴가 존재함
				System.out.printf("[*%d) %s*]", i, menu.getTitle());
			} else {		// 단일메뉴
				System.out.printf("%d) %s", i, menu.getTitle());
			}
		}
		System.out.println();
		
//		Prompt prompt = new Prompt();		// common에 Prompt class 생성 필요
//		int select = prompt.getInt("선택");
//		if(select >=0 && select<menuList.size()) {
//			menuList.get(select).excute();
//		}
		
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		if(select >=0 && select<menuList.size()) {
			menuList.get(select).execute();
		}
	}

}
