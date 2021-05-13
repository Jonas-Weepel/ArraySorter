package sortingAlgorithms;

public class ArraySorter {
	
	public static void main(String[] args) {
		ArrayHelper ar = new ArrayHelper();
		
		int[] unsortedArray = ar.getRandomArray(30, 50);
		ar.displayArray( "Unsorted Array", unsortedArray );
		
		int[] bubbleSortArray = new int[unsortedArray.length];
		bubbleSortArray = bubbleSort(unsortedArray);
		ar.displayArray( "Bubble Sorted Array", bubbleSortArray );
		
	}

	private static int[] bubbleSort(int[] bubbleArray) {
		boolean noSwitches = true;
		do {
			noSwitches = true;
			for( int i=0; i<bubbleArray.length-1; i++ ) {
				if( bubbleArray[i] > bubbleArray[i+1] ) {
					int temp = bubbleArray[i];
					bubbleArray[i] = bubbleArray[i+1];
					bubbleArray[i+1] = temp;
					noSwitches = false;
				}
			}
		} while( noSwitches == false );
		
		return bubbleArray;
	}
	
}