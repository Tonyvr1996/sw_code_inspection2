package labcodeinspection;

import java.util.Scanner;

public class EmailAppUtils {

	private transient String message;
	
	/**
	 * @return the message to know the name of the class we are in
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @param message 
	 */
	public EmailAppUtils(final String message) {
		super();
		this.message = message;
	}

	/**
	 * @param args 
	 */
	public static void main(final String[] args) {
		final Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		final String firstName = input.nextLine();

		System.out.print("Enter your last name: ");
		final String lastName = input.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = input.nextInt();
		input.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
	
	
	
}
