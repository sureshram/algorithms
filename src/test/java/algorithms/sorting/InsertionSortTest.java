package algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;

import junit.framework.TestCase;

public class InsertionSortTest extends TestCase {

	//Total n square operations, n square comparisons, n array swaping??
	public void testSort() {
		int[] array = new int[] {5,2,4,6,1,3};
		
		printArray(array);
		for (int i=0; i<array.length ; i++) {   //n operations
			int insertItem = array[i];
			for(int j=i-1; j>=0; j--) {  // (n-1 + n-2, n-3 ... 1) operations
				System.out.println("i=" + i + ",j=" + j + "-" + insertItem + "," + array[j]);
				if (insertItem < array[j]) {
					array[j+1] = array[j]; //Push item to next
					array[j] = insertItem; //Insert the item
				}
				printArray(array);
			}
		}
		
	}
	
	public void printArray(int[] array) {
		System.out.println("\t");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}
