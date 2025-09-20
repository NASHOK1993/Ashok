package Collections;

import java.util.ArrayList;

public class DuplicateAndItsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = { "baby", "ball", "soap", "baby", "Shampoo", "chalk", "soap", "makeup", "baby", "lotion" };

		ArrayList<String> counted = new ArrayList<>();

		for (String string : s1) {
			String current = string;
			int count = 0;
			if (!counted.contains(current)) {
				for (String string2 : s1) {
					if (current.contains(string2))
						count++;
				}
				if (count > 1) {
					System.out.println(current + " occurs " + count);
				}
				counted.add(current);
			}

		}
	}
}
