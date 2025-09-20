package Collections;

public class ASsigment1 {

	int[] i = { 4, 5, 0, 9, 8, 10 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ASsigment1 a = new ASsigment1();
		System.out.println(" The Sum of Give Values =" + a.sum());
		System.out.println(" The AVERAGE of Give Values is =" + a.average());

	}

	public int sum() {
		int temp = 0;
		for (int j : i) {
			temp += j;
		}
		return temp;
	}

	public int average() {
		int temp = 0;
		for (int j : i) {
			temp += j;
		}

		return temp / i.length;

	}

}
