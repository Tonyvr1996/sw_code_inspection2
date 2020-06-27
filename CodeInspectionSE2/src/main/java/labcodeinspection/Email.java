package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String firstname;
	private final transient String lastName;
	private transient String password;
	private transient String department;
	private final transient int passwordLength = 8;
	private transient String email;

	
	/**
	 * @param firstName string type refers to the user's first name
	 * @param lastName string type refers to the user's first last name
	 */
	public Email(final String firstName, final String lastName) {
		this.firstname = firstName;
		this.lastName = lastName;
	}

	/**
	 * This method does not receive parameters and is used to display user information.
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstname + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	 * @param depChoice of integer type that refers to the department number that you want to assign
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "sales";
			break;
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * This method is used to create the user email according to the previously established parameters
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLength);
		this.email = this.firstname.toLowerCase(Locale.US) + this.lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
