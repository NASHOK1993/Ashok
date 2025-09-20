import java.util.Scanner;

public class Thescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentYear = 2025;
		System.out.println(getInputFromScanner(currentYear));
	}

	public static String getInputFromScanner(int currentYear) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi, What's your Name? ");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ", Thanks for taking the course!");

		System.out.println("What year were you born? ");

		// Boolean validateDOB = false;
		int age = 0;
		do {
			System.out.println("Enter your DateofBirth <= " + currentYear + " and >= " + (currentYear - 125));
			age = checkData(currentYear, scanner.nextLine());
			// validateDOB = age > 0 ? true : false;
		} while (!(age > 0 ? true : false));

		return "So you are " + age + " years old";

	}

	public static int checkData(int currentYear, String dateOfBirth) {
		int dob = Integer.parseInt(dateOfBirth);
		int minimumYear = currentYear - 125;

		if (dob < minimumYear || dob > currentYear) {
			return -1;
		}

		return (currentYear - dob);

	}

}
