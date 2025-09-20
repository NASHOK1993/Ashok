package Collections;

import java.util.ArrayList;

public class HighestDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6, 4, 4, 4 };

		ArrayList<Integer> countedNumber = new ArrayList<>();

		int CountedCount = -1;
		int MAXelemt = 0;

		for (int i : input) {
			int currentNumber = i;
			int count = 0;
			if (!countedNumber.contains(currentNumber)) {

				for (Integer j : input) {
					if (currentNumber == j)
						count++;
					if (CountedCount < count) {
						CountedCount = count;
						MAXelemt = currentNumber;
					}

				}
				countedNumber.add(currentNumber);
			}

		}
		System.out.println("Number with highest duplicates: " + MAXelemt);
		System.out.println("It appears " + CountedCount + " times");
	}

}
