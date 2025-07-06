import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How many values do you want to enter.");
		int count = scanner.nextInt();
		int[] myArray = readIntegers(count);
		System.out.println("Below is the values you have entered.");
		System.out.println(Arrays.toString(myArray));
		System.out.println("Below is the reverse of the values you have entered.");
		System.out.println(Arrays.toString(reverse(myArray)));

	}

	private static int[] readIntegers(int count) {

		int[] values = new int[count];
		while (count > 0) {
			System.out.println("Enter the value # " + count);
			values[count - 1] = scanner.nextInt();
			count--;

		}

		return values;
	}

	private static int[] reverse(int[] array) {
		
		int[] values = new int[array.length];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			    
				values[j] = array[i];
				
				j++;
			}
		

		return values;
	}

}