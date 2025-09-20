
public class PrimeNumberChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (isPrime(7)) {
			System.out.println("is a prime number");
		} else {
			System.out.println("is NOT a prime number");
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 2) {
			return (number == 2);
		}

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				return false;
			}

		}

		return true;

	}

}
