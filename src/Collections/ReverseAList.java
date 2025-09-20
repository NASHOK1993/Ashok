package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Integer> Reverse = new ArrayList<>();

		number.add(1);
		number.add(8);
		number.add(0);
		number.add(5);
		number.add(1);
		number.add(6);

		for (int i = number.size() - 1; i >= 0; i--) {
			Reverse.add(number.get(i));
		}
		// System.out.println(number);
		// System.out.println(Reverse);

		ArrayList<Integer> Original = new ArrayList<>(number);
		Collections.reverse(number);
		System.out.println(number);
		System.out.println(Original);
		Collections.sort(number);
		System.out.println(number);
		Collections.sort(number, Collections.reverseOrder());
		System.out.println(number);
	}

}
