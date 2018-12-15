package robin.park.common.command;

// command pattern을 위한 interface
public interface Command {
	void execute() throws Exception;		// 구현(implements) class에서 재정의

}
