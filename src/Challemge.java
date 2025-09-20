
public class Challemge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 20;
		double b = 65;
		double multiply = (a + b) * 100;
		System.out.println(multiply);
		double remainder = multiply % 40.00d;
		System.out.println(remainder);
		boolean isTrue = (remainder == 0.00);
		if (!isTrue) {
			System.out.println("Got some remainder");
		}

	}

}
