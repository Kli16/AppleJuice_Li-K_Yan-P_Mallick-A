/**
Pacy Yan
APCS2 pd4
HW15 -- 
2017-03-07
 **/

/*****************************************************
 * class QuickSort
 * (skeleton) <<delete this line if untrue>>
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *
 * 2a. Worst pivot choice / array state and associated runtime: 
 *
 * 2b. Best pivot choice / array state and associated runtime:
 *
 * 3. Approach to handling duplicate values in array:
 *
 *****************************************************/

/***
    PROTIP: Assume no duplicates during initial development phase.
    Once you have a working implementation, test against arrays 
    with duplicate values, and revise if necessary. (Backup first.)
 ***/
public class QuickSort 
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    /**
     *alg qsort(arr, left, right)
     **if left < right
     *** pvtPos = partition(arr, left, right)
     ***qsort(arr, left, pvtPos - 1)
     *** qsort(arr, pvtPos + 1, right)

     **/
    public static void qsort( int[] d ) 
	{ 
	    qsortH(d, 0, d.length-1);
	    }

    // Thinkers are encouraged to roll their own subroutines.
    // Insert your auxiliary helper methods here.

    public static void qsortH(int[] arr, int left, int right) {
	if (left<right) {
	    int pivotPos= partition(arr, left, right, right);
	    qsortH(arr, left, pivotPos-1);
	    qsortH(arr, pivotPos+1, right);
	}
    }
    public static int partition( int arr[], int lowerBound, int upperBound, int pvt)
    {
	int v = arr[pvt];

	swap( pvt, upperBound, arr);
	int s = lowerBound;

	for( int i = lowerBound; i < upperBound; i++ ) {
	    if ( arr[i] <= v) {
		swap( i, s, arr );
		s++;}
	}
	swap(s,upperBound,arr);

	return s;
    }

    //main method for testing
    public static void main( String[] args ) 
    {
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) */
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);
	qsort( arr1 );	
       	System.out.println("arr1 after qsort: " );
	printArr(arr1);
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	    arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);
       	shuffle(arrN);
       	System.out.println("arrN post-shuffle: " );
	printArr(arrN);
	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)*/ 
	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);
	qsort( arr2 );	
       	System.out.println("arr2 after qsort: " );
	printArr(arr2);
	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	    arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);
       	shuffle(arrMatey);
       	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);
	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class QuickSort
