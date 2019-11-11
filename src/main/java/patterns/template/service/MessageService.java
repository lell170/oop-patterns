package patterns.template.service;

public abstract class MessageService {

	String username;
	String password;

	MessageService() {}

	public abstract boolean login(String username, String password);
	public abstract void sendData(byte[] data);
	public abstract void logout();

	// template method
	public void send(final String message) {
		// check credentials for each message service method
		if (login(this.username, this.password)) {
			// send message...
			sendData(message.getBytes());
			logout();
		}
	}
}
