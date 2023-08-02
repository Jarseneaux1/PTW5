package PTW5;

public class App {

	public static void main(String[] args) {
		String error2 = "Potato";
		String log2 = "Hello";
		String log = "Pizza";
		String error = "Too much sauce";
		Logger logger = new AsteriskLogger();
logger.error(error);
logger.log(log);
Logger logger2 = new SpacedLogger();
logger2.log(log2);
logger2.error(error2);
	}

}
