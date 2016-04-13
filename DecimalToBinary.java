public class DecimalToBinary {

	public static void decimalToBinaryFormat(int inputNum) {
		System.out.print("\nBinary of "+inputNum +" is: ");
		
		int binary[] = new int[20];
		int index = 0;
		
		while (inputNum > 0) {
			binary[index++] = inputNum % 2;
			inputNum = inputNum / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		
	}

	public static void main(String a[]) {
		decimalToBinaryFormat(7);
		decimalToBinaryFormat(20);
		decimalToBinaryFormat(30);
	}
}