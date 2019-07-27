package interviewPrograms;

import java.util.concurrent.SynchronousQueue;

public class ArrayLargestandLowest {

	public static void main(String[] args) {
		
		int[] arr = {10,20,40,5,-1,7998,23};
		
		int largest = arr[0];
		int lowest = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			else if(arr[i]<lowest) {
				lowest = arr[i];
			}
		}
		System.out.println("largest no. is " + largest);
		System.out.println("lowest no. is " + lowest);


	}

}
