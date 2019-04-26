package bank.system;

public class Logger {

	private String driverName;

	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	public void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		System.out.println("not supported yet");
		return null;
	}

}
