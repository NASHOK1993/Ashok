import java.util.Scanner;

public class MinimumMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int minimumNumber = Integer.MAX_VALUE;
		int maximunNumber = Integer.MIN_VALUE;
		while (true) {
			try {
				System.out.println("Enter a Number to continue or Enter a Char to exit");
				String numberEntered = scanner.nextLine();
				int storednumber = Integer.parseInt(numberEntered);

				if (storednumber < minimumNumber) {
					minimumNumber = storednumber;
				}
				if (storednumber > maximunNumber) {
					maximunNumber = storednumber;
				}
			} catch (NumberFormatException badUserData) {
				System.out.println("you entered an Char, so exiting from Function");
				break;

			}

		}
		System.out.println("Minimum Number from your  Numbers are " + minimumNumber);
		System.out.println("Maximum Number from your numbers  are " + maximunNumber);
	}
}
