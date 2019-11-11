package patterns.template;

import patterns.template.service.Email;
import patterns.template.service.MessageService;
import patterns.template.service.SMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(final String[] args) throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input user name: ");

		final String userName = reader.readLine();
		System.out.print("Input password: ");

		final String password = reader.readLine();
		System.out.print("Input message: ");

		final String message = reader.readLine();
		System.out.println("\nChoose message service.\n" + "1 - SMS\n" + "2 - Email");

		final int choice = Integer.parseInt(reader.readLine());
		final MessageService messageService;

		switch (choice) {
			case 1:
				messageService = new SMS(userName, password);
				messageService.send(message);
				break;
			case 2:
				messageService = new Email(userName, password);
				messageService.send(message);
				break;
			default:
				break;
		}
	}
}
