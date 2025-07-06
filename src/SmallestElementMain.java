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
        System.out.println("The lowest element of above all the elements is " + findMin(myArray));
        
		
		
		
	}
	
	
	private static int[] readIntegers(int count) {
		
		int[] values = new int[count];
		while(count > 0) {
			System.out.println("Enter the value # " + count);
			values[count-1] = scanner.nextInt();
			count --;
			
		}
		
		return values;
	}
	
	private static int findMin(int[] array) {
		int[] sortedArray = Arrays.copyOf(array, array.length);
		boolean istItTrue = true;
		int temp =0;
		
		while(istItTrue) {
			istItTrue = false;
			for(int i=0; i<sortedArray.length-1;i++) {
				if(sortedArray[i] < sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					
				}
			}
		}
		return sortedArray[sortedArray.length-1];
		
	}

}
