public class runTimeTest {
    
/* populates an array with a designated number
       of random integers */
    
    public static int[] populateArrN(int[] arr, int length) {
	for (int i = 0; i < length; i++) {
	    int rnd = (int)(Math.random() * (length - 1)) + 1;
	    arr[i] = rnd;
	}
	return arr;
    }

    /* calculates the runTime of a method 
     */
     public static double runTime(int n) {
	int[] arr = new int[n];
	populateArrN (arr, n);
	long startTime = System.nanoTime();
        qsort (arr);
	long endTime = System.nanoTime();
	long duration = endTime - startTime;
	return duration/1000000f;
    }
    
    
    /* iterates runtime for a given method
       25 times and find the average to give 
       a more accurate conceptual runtime
       for an algorithm 
     */
   public static double testSort_avg(int n) {
	double sum = 0;
	for (int i = 0; i < 25; i++)
	    sum += runTime(n);
	return sum/25;
    }

    public static void main (String [] args ) {	
	/* insert test cases here */

    }

}
