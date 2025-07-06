import java.util.Scanner;

public class anotherMethodForArray {
	
Scanner scanner = new Scanner(System.in);

public int [] getArrays(int number) {
	
	int[] values = new int[number];
	System.out.println("Enter the " + number +" numbers." );
	for(int i=0;i<number;i++) {
		values[i] = scanner.nextInt();
	}
	return values;
}



public double getAverage(int[] array) {
	
	int sum =0;
	
	for(int i=0; i< array.length; i++) {
		sum += array[i];
	}
	
	return (double)sum/(double)array.length;
}

}
