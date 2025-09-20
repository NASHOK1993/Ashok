
public class ConstructorChallenge {

	private String name;
	private double creditLimit;
	private String emailaddress;

	public ConstructorChallenge(String name, String emailaddress) {

		this(name, 1000, emailaddress);
	}

	public ConstructorChallenge(String name, double creditLimit, String emailaddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailaddress = emailaddress;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

}
