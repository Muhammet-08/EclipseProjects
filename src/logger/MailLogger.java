package logger;

public class MailLogger implements Logger {

	@Override
	public void add(String data) {
		System.out.println("Maile loglandı: "+ data);
		
	}

}
