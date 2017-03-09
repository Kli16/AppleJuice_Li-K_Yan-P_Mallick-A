public class runTimeTest {
     public static double runTime(int n) {
	int[] arr = new int[n];
	populateArrN(arr, n);
	long startTime = System.nanoTime();
        Quicksort(arr);
	long endTime = System.nanoTime();
	long duration = endTime - startTime;
	return duration/1000000f;
    }
}
