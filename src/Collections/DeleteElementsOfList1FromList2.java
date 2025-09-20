package Collections;

import java.util.ArrayList;

public class DeleteElementsOfList1FromList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(9);
		l1.add(8);

		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(4);
		l2.add(1);
		l2.add(9);
		l2.add(4);
		l2.add(8);
		l2.add(0);
		l2.add(5);
		l2.add(1);
		l2.add(8);
		l2.add(6);

		// l2.removeAll(l1);
		System.out.println(l2);
		int Count = l2.indexOf(9);
		System.out.println(Count + 1);
	}
}
