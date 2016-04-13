public class ReverseNumber {

	public static void main(String[] args) {

		int number = 136892;
		int reversedNum = 0;

		int temp = 0;
		int inputNum = number;

		while (inputNum > 0) {

			temp = inputNum % 10;

			reversedNum = reversedNum * 10 + temp;

			inputNum = inputNum / 10;

		}

		System.out.println("Reverse of " + number + " is: " + reversedNum);
	}
}
