package Collections;

import java.util.ArrayList;

public class CommonElelmntsIn2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = { 4, 9, 8, 5 };
		int[] j = { 1, 8, 0, 5, 6 };

		ArrayList<Integer> countedNumber = new ArrayList<>();
		ArrayList<Integer> duplicateNumbers = new ArrayList<>();

		for (Integer x : i) {
			int currentNumber = x;

			if (!countedNumber.contains(currentNumber)) {

				for (Integer y : j) {
					if (currentNumber == y) {
						duplicateNumbers.add(y);
					}
				}
				countedNumber.add(x);
			}
		}
		System.out.println(duplicateNumbers);
	}

}
