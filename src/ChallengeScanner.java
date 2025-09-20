import java.util.Scanner;

public class ChallengeScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {
				String storedNumber = scanner.nextLine();
				int temp = Integer.parseInt(storedNumber);
				sum += temp;
				count++;
			} catch (NumberFormatException badUserData) {
				break;
			}
		}
		long avg = Math.round((double) sum / count);
		System.out.print("SUM = " + sum + " AVG = " + avg);

	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		int value = (int) Math.ceil(area / areaPerBucket);
		return value;
	}
}