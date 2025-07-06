import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		//When main method is made private we wont get a option to run as java application
		int[] myIntArray = getArray(5);
		
		printArray(myIntArray);
		sortArray(myIntArray);

	}

	public static int[] getArray(int number) {
		int[] values = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the digit to be sorted.");
			values[i] = scanner.nextInt();
			System.out.println("You have entered : " + values[i]);
		}

		return values;
	}

	public static void printArray(int[] array) {
		System.out.println("The actual array you have entered is :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		System.out.println();
	}

	public static void sortArray(int[] array) {
		System.out.println("Below is the sorted array :");
		
		int[] backUpArray1 = Arrays.copyOf(array, array.length);
		//Both are similar
		int[] backUpArray = new int[array.length];
		for(int i=0;i< array.length;i++) {
			backUpArray[i] = array [i];
		}
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0; i< array.length;i++) {
			System.out.print(array[i] + "\t");
		}

	}

}
