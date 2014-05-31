package algorithms.sorting;

import junit.framework.TestCase;

public class QuickSortTest extends TestCase {

	public void testSort() {
		String[] sortList = {"cat", "mat", "bat", "rat", "sat"};
		String[] expectedList = {"bat", "cat", "mat", "rat", "sat"};
		
		
		QuickSort<String> qsort = new QuickSortImpl<String>();
		String[] sortedList = qsort.sort(sortList);
		if (sortedList == null) {
			fail("empty list returned");
		}
		for (int i=0; i<sortedList.length; i++) {
		   assertEquals(expectedList[i], sortedList[i]);
		}
		
	}
	
}
