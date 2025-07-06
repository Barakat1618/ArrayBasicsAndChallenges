import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		int[] myIntArray = new int[25];
        double[] myDoubleArray = {1.0,2.1,3.2,4.3,5.4,6.5,7.6,8.7,9.8,10.9};
        char[] myCharArray = {'a','B','c','D','e','F','g','H','i'};
        String[] myStringArray = {"Ali","Sabiya","Meenaz","Sadiya","Zubair","Uzma"};
        
		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i * 10;
		}
		printArray(myIntArray);
		*/
		
		anotherMethodForArray am = new anotherMethodForArray();
		int[] myIntArray = am.getArrays(5);
		System.out.println(am.getAverage(myIntArray));
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] usefulArray = new int[10];
		int total =0;
		
		for(int i=0; i< usefulArray.length;i++) {
			System.out.println("Enter a number #" + i);
			usefulArray[i] = scanner.nextInt();
			
			total += usefulArray[i];
			
		}
		
		//(double)total/(double)usefulArray.length this converts int value to double both on top and bottom to get a double output
		System.out.println("The average of " + usefulArray.length + " numbers is : " + ((double)total/(double)usefulArray.length));
		
		//System.out.println("Array elements : " + Arrays.toString(myIntArray));
		//Arrays.toString(myIntArray) This is also a one way of printing out an array 
		//To String method is used to print Strings or objects separated by a comma.
		//This method converts all the int values to a string before printing out.
		scanner.close();
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Loop is at " + i + " The value is " + array[i]);
		}

	}

}

