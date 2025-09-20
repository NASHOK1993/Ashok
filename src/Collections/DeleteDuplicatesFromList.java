package Collections;

import java.util.ArrayList;

public class DeleteDuplicatesFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 4, 1, 9, 4, 8, 0, 5, 8, 1, 8, 6 };

		ArrayList<Integer> Input1 = new ArrayList<>();

		for (Integer i : input) {
			Input1.add(i);
		}
		ArrayList<Integer> counted = new ArrayList<>();

		for (Integer x : Input1) {
			int currentNumber = x;
			int count = 0;
			if (!counted.contains(x)) {

				for (Integer y : Input1)
					if (currentNumber == y) {
						count++;
					}

				if (count > 1) {
					counted.add(x);

				}
			}

		}
		Input1.removeAll(counted);
		System.out.println(Input1);

	}

}
