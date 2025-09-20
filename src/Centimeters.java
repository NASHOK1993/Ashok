
public class Centimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertToCentimeters(5, 8));

	}

	public static double convertToCentimeters(int inches) {
		return (inches * 2.54);
	}

	public static double convertToCentimeters(int feet, int inches) {
		return convertToCentimeters((feet * 12) + inches);
	}

}
