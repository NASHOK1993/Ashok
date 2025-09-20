package Collections;

import java.util.ArrayList;

public class ListofPrimeNumbertillGiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> PrimeNumber = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			if (isPrime(i)) {
				PrimeNumber.add(i);
			}
		}
		System.out.println(PrimeNumber);

	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		if (number == 2)
			return true;
		int n = (int) Math.sqrt(number);
		for (int i = 2; i <= n; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
