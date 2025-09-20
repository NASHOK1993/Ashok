package Collections;

import java.util.ArrayList;

public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(0);
		list.add(9);
		list.add(8);
		list.add(10);

		int temp = 0;
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				temp += integer;
			}
		}
		System.out.println("Sum of Even Number in the List = " + temp);
	}

}
