package robin.park.common.ui;

import robin.park.common.command.Command;

//composite pattern : 부분-전체 계층을 표현하는 패턴

public class MenuItem extends Menu {
	// 필드
	Command command;
	
	// 생성자 (상속받은 부모 클래스의 필드 title과 this class의 필드인 command를 매개변수로 생성)
	public MenuItem(String title, Command command) {
		super(title);
		this.command = command;
	}

	// 부모 class인 Menu의 abstract 메소드 재정의 (overriding)
	@Override
	public void execute() throws Exception {
		if(command != null) {
			command.execute();
		}
		
	}

}
