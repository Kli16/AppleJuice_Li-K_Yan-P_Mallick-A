# AppleJuice
Kevin Li, Pacy Yan, Alitquan Mallick
PERIOD 4

<h2> QUICK SORT ALGORITHM: </h2>
<p> QSort(arr): Uses a partition to separate numbers less than or greater than a given value in the array, and then recurses the process on the subarrays to the left and right of the partition, until the subarrays no longer need to be sorted, and all values are guaranteed to be in sorted order </p>

<h2> HOW TO RUN IT: </h2>
<ol> 
<li> Clone the repository </li>
<li> In terminal, run <code>javac QuickSortSortTester.java</code> </li>
<li> run <code>java QuickSortTester</code> for each time you would like to have a trial</li>
</ol>

<h2> BIG OH HYPOTHESIS: </h2>
<h3> Best Case </h3>
<p> The best pivot choice is if it always results in spliting the subarray in half, which guarantees that all of the subarrays are made equally as short as possible. I think that the runtime would be nlogn. </p>
<h3> Average/Most Likely Case </h3>
<h3> Worst Case </h3>
<p> The worst pivot choice would be a number that is always at either the extreme high or extreme low end of the array, which means that the next recursed partition is only reduced in size by one number. This would be a n * n runtime. </p>

<h2> METHODOLOGY: </h2>

<h2> DATA AND ANALYSIS: </h2>

<h2> How do pivot selection and data arrangements affect execution time? </h2>
