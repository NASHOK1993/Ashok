package Collections;

import java.util.ArrayList;

public class Split_List_Into_TwoLists {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(4);
		list1.add(9);
		list1.add(8);
		list1.add(5);
		list1.add(0);
		list1.add(10);

		ArrayList<Integer> firstList = new ArrayList<>();

		ArrayList<Integer> secondtList = new ArrayList<>();

		for (int i = 0; i < list1.size() / 2; i++) {
			firstList.add(list1.get(i));
		}
		for (int i = list1.size() / 2; i < list1.size(); i++) {
			secondtList.add(list1.get(i));
		}

		System.out.println("First List =" + firstList);
		System.out.println("Second List =" + secondtList);

	}

}
