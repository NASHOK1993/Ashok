
public class Customer {

	public static void main(String[] args) {
		ConstructorChallenge customer = new ConstructorChallenge("Ashok", 100000.00, "asahok@gmail.com");

		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getName());

		ConstructorChallenge customer2 = new ConstructorChallenge("Satya", "satya@gmail.com");
		System.out.println(customer2.getName());
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getName());
	}
}
