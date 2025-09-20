import java.util.Scanner;

public class TheScannerChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int sum = 0;
		String number = "";
		int totalCount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plz Enter Five Valid Numbers");
		do {
			try {
				number = scanner.nextLine();
				// System.out.println("Entered Number #" + number);
				totalCount = Integer.parseInt(number);
				sum += totalCount;
				count++;
				System.out.println("Entered " + count + " Number #" + number);
			} catch (NumberFormatException badUserData) {
				System.out.println("Characters not allowed!!! Try again.");
			}

		} while (count < 5);
		System.out.println("The Sume of Five Numbers are " + sum);
	}

}
