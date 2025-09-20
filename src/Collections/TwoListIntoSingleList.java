package Collections;

import java.util.ArrayList;

public class TwoListIntoSingleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstList[] = { 4, 9, 8 };
		int secondtList[] = { 5, 0, 10 };

//		ArrayList<Integer> firstList = new ArrayList<>();
//		firstList.add(4);
//		firstList.add(9);
//		firstList.add(8);
//
//		ArrayList<Integer> secondtList = new ArrayList<>();
//		secondtList.add(5);
//		secondtList.add(0);
//		secondtList.add(10);

		ArrayList<Integer> mergetList = new ArrayList<>();

		for (Integer i : firstList) {
			mergetList.add(i);

		}
		for (Integer i : secondtList) {
			mergetList.add(i);

		}

		System.out.println(mergetList);
	}

}
