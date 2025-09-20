package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> i = new ArrayList<>();
		i.add(4);
		i.add(9);
		i.add(8);
		i.add(4);
		i.add(6);

		Integer[] a = i.toArray(new Integer[0]);
		System.out.println(Arrays.toString(a));

	}

}
