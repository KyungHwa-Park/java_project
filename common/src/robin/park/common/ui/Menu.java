package robin.park.common.ui;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

// composite pattern : 부분-전체 계층을 표현하는 패턴

@Data
@NoArgsConstructor		// class에서 생성자를 정의할 경우 매개변수가 없는 (default)생성자는 자동으로 추가되지 않기 떄문에 어노테이션을 이용해서 만들어준다.
public abstract class Menu {
	String title;
	List<Menu> menuList;
	
	public Menu(String title) {		// 서브메뉴에서만 운영
		this.title = title;
	}
	
	public void add(Menu menu) {	// 서브메뉴에서만 운영
		menuList.add(menu);
	}
	
	// 추상메소드 : 내용(실행문)없이 메소드 시그니처만 정의한 후 자식 class에서 구현
	public abstract void execute() throws Exception;

}
