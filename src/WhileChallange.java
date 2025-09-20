
public class WhileChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int num = 5;
//		// System.out.print(num);
//		while (true) {
//			if (isEvenNumber(num)) {
//				System.out.println(num);
//			}
//			num++;
//			if (num > 20)
//				break;
//
//		}

		int num = 4;
		int LastNumber = 20;
		int count = 0;

		while (num <= LastNumber) {
			num++;
			if (!isEvenNumber(num))
				continue;
			System.out.println("Even Number is " + num);

			count++;
			if (count == 5)
				break;
		}

	}

	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;

	}

}
