public class runTimeTest extends QuickSort {
    
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
       pvtType refers to the pvt location when Quicksort
       is being run.
       1 = first member of arr
       2 = midpoint of arr
       3 = final member of arr
       any other number returns an error
     */
    public static double runTime(int n, int pvtType) {
	
	int[] arr = new int[n];
	populateArrN (arr, n);
	long startTime = System.nanoTime();
        qsort (arr,pvtType);
	long endTime = System.nanoTime();
	long duration = endTime - startTime;
	return duration/1000000f;
    }
    
    
    /* iterates runtime for a given method
       25 times and find the average to give 
       a more accurate conceptual runtime
       for an algorithm 
       
       pvtType refers to the pvt location when Quicksort
       is being run.
       1 = first member of arr
       2 = midpoint of arr
       3 = final member of arr
       any other number returns an error
     */

    public static double testSort_avg(int n, int pvtType) {
	double sum = 0;
	for (int i = 0; i < 25; i++)
	    sum += runTime(n,pvtType);
	return sum/25;
    }

    public static void main( String[] args ) 
    {
	/* 
	   runtimes for pivot at lastmember of the arr 
	*/
       
	System.out.println ("Created by Alitquan Mallick");
	System.out.println ("\nRuntimes for pivot point at last member of array");
	System.out.println ("Data set in powers of ten:\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	for (int i = 1; i <= 10000000; i*=10){
	    System.out.println ("(" + i + ", " + testSort_avg(i,3) +" )");
	    if (i > 100000) {
		while (i < 10000000) {
		     System.out.println ("(" + i + ", " + testSort_avg(i,3) +" )");
		     i*=2;
		}
	    }
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 30; i++) {
	    System.out.println ("(" + i * 10000 + ", " + testSort_avg(i * 10000,3) +" )");
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 10; i++) {
	    System.out.println ("(" + i * 1000000 + ", " + testSort_avg(1000000 * i,3) +" )");
	}
	System.out.println("\n");

	//System.exit(0); // line that helps during testing; stops program at this point

	System.out.println ("\nRuntimes for pivot point at midpoint  of array");

	System.out.println ("Data set in powers of ten:\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	for (int i = 1; i <= 10000000; i*=10){
	    System.out.println ("(" + i + ", " + testSort_avg(i,3) +" )");
	    if (i > 100000) {
		while (i < 10000000) {
		     System.out.println ("(" + i + ", " + testSort_avg(i,2) +" )");
		     i*=2;
		}
	    }
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 30; i++) {
	    System.out.println ("(" + i * 10000 + ", " + testSort_avg(i * 100000,2) +" )");
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 10; i++) {
	    System.out.println ("(" + i * 1000000 + ", " + testSort_avg(1000000 * i,2) +" )");
	}
	System.out.println("\n");
	
	System.out.println("\n");
	System.out.println ("Created by Alitquan Mallick");
	System.out.println ("\nRuntimes for pivot point at first member of array");

	System.out.println ("Data set in powers of ten:\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	for (int i = 1; i <= 10000000; i*=10){
	    System.out.println ("(" + i + ", " + testSort_avg(i,3) +" )");
	    if (i > 100000) {
		while (i < 10000000) {
		     System.out.println ("(" + i + ", " + testSort_avg(i,1) +" )");
		     i*=2;
		}
	    }
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 30; i++) {
	    System.out.println ("(" + i * 10000 + ", " + testSort_avg(i * 10000,1) +" )");
	}
	System.out.println("\n");
	System.out.println ("Data in formation (ARR LENGTH, RUNTIME)");
	System.out.println ("Created by Alitquan Mallick");
	for (int i = 1; i <= 10; i++) {
	    System.out.println ("(" + i * 1000000 + ", " + testSort_avg(1000000 * i,1) +" )");
	}
	System.out.println("\n");
	/*
	System.out.println ("\nData set for interval of 20 from between 10 through 300:\n");
	for (int x = 10; x <= 300; x+= 20)
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));
	
	System.out.println ("\nData set for interval of 35 from between 200 through 105000:\n");
	for (int x = 200 ; x <= 105000; x+= 35)
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));
	
	System.out.println ("\nData set for interval of 70 from between 3500 through 1000030:\n");
	for (int x = 3500; x <= 1000030; x+= 70)
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));
	
	System.out.println ("\nData set for interval of 100 from between 5000 through 100000:\n");
	for (int x = 5000; x <= 100000; x+= 100)
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));

	System.out.println ("\nData set for interval of 100 from 0 to 2000:\n");
	for (int x = 0; x <= 2000; x+= 100)
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));
	
	System.out.println ("\nData set in intervals increasing by 2000 from 0 to 1000000:\n");
	for (int x = 0; x <= 1000000; x+= 2000) 
	    System.out.println("Duration for n = " + x + ": " + testSort_avg(x,3));
	*/
    }//end main
    
}
