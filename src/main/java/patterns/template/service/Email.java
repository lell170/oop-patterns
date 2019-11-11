package patterns.template.service;

public class Email extends MessageService {

	public Email(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean login(final String username, final String password) {
		System.out.println("checking user credentials for user " + this.username);
		// pseudo login...
		System.out.println("logged on by email provider");
		return true;
	}

	@Override
	public void sendData(final byte[] data) {
		System.out.println("message was send per email");
		// pseudo send function...
	}

	@Override
	public void logout() {
		System.out.println("User was logged out from email account");
	}
}
