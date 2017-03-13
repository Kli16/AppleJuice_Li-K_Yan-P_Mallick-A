# AppleJuice
<p> Kevin Li, Pacy Yan, Alitquan Mallick </p>

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

<center> ![DataTable1](DataTable1.png) </center>

<p>
This graph appears to depict a linear runtime and the concentration of the points seem mostly even in all the areas. That means that as the array becomes bigger, the runtime (if the pivot choice were the last member of the array) would become larger as well. Since the line of best fit intuitively seems straight, one would could conclude that the runtime is linear if the pivot choice were the last member. However, graphs of larger arrays show otherwise. 
</p>

![DataTable2](DataTable2.png)

<p>
This graph is exponential and is a better analysis of the data because it gives a larger array range. Now we know that the runtime of QuickSort with the pivot choice at the end of the array. As the array size increases, the runtime grows expontentially. 
</p>

![DataTable3](DataTable3.png) 

<p>
This graph can be analyzed in the same way Graph 2 was. It uses a larger array range and thus is a more accurate representation of the change in runtime of the of array if the pivot choice was at the end. 
</p> 

![DataTable4](DataTable4.png)

<p>
This graph appears slightly exponential with the last point. From this we could conclude that starting the pivot choice at the midpoint leads to an exponential runtime, where the size of the array correlates exponentially with the runtime. However, analysis of later graphs prove otherwise. 
</p> 

![DataTable5](DataTable5.png)

<p>
This graph shows a linear runtime. If you were to draw a line of best fit, it would be a constant runtime for each growth in array size. This proves that the runtime of Quicksort wit the midpoint as the pivot choice is constant or linear. 
</p> 

![DataTable6](DataTable6.png)

<p>
This graph reaches the same conclusion as Graph 5, just with a bigger range of array sizes. The conclusion is the same; the runtime of QuickSort when the pivot choice is the midpoint is linear.
</p> 

![DataTable7](DataTable7.png)

<p>
This graph appears linear for the most part and seems exponential because of the last point. However, because the data is so sparse, it is hard to tell if that is an outlier case, the graph is actually exponential, or if it is actually linear. From this, we could conclude that starting the pivote choice at the beginning leads to an exponential runtime, where the size of the array correlates exponentially with the runtime. However, later graphs disprove this. 
</p> 

![DataTable8](DataTable8.png)

<p>
This graph is linear and shows that the QuickSort runtime with the midpoint as the pivot choice is constant or linear, such that the size of the array correlates linearly with the runtime. 
</p> 

![DataTable9](DataTable9.png) 

<p>
The same analysis given to graph 8 could be said except this graph is more accurate as it has a larger array range. <br/>
</p> 

<h4> Runtimes for pivot point at last member of array </h4>
Data set in powers of ten: <br/>

Data in formation (ARR LENGTH, RUNTIME)
(1, 7.60000036098063E-4 ) <br/>
(10, 0.0053599999658763406 )<br/>
(100, 0.09247999995946884 )<br/>
(1000, 0.3441999977827072 )<br/>
(10000, 1.00900000333786 )<br/>
(100000, 8.70044002532959 )<br/>
(1000000, 108.21656036376953 )<br/>
(1000000, 122.93615936279296 )<br/>
(2000000, 241.4168798828125 )<br/>
(4000000, 477.8561999511719 )<br/>
(8000000, 1117.9667700195312 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(10000, 0.8294400000572204 )<br/> 
(20000, 1.843919997215271 )<br/>
(30000, 2.537760000228882 )<br/>
(40000, 3.329759998321533 )<br/>
(50000, 4.2776000022888185 )<br/>
(60000, 5.523719940185547 )<br/>
(70000, 5.979760017395019 )<br/>
(80000, 7.807799968719483 )<br/>
(90000, 9.581319980621338 )<br/>
(100000, 10.631719970703125 )<br/>
(110000, 11.320760040283202 )<br/>
(120000, 12.365920066833496 )<br/>
(130000, 12.89851993560791 )<br/>
(140000, 14.656359977722168 )<br/>
(150000, 15.232840003967285 )<br/>
(160000, 15.373320007324219 )<br/>
(170000, 17.297759895324706 )<br/>
(180000, 20.384360122680665 )<br/>
(190000, 20.102360076904297 )<br/>
(200000, 23.053879852294923 )<br/>
(210000, 22.945480194091797 )<br/>
(220000, 24.38431999206543 )<br/>
(230000, 24.36103988647461 )<br/>
(240000, 24.450120010375976 )<br/>
(250000, 27.42287986755371 )<br/>
(260000, 27.544720153808594 )<br/>
(270000, 28.833719940185546 )<br/>
(280000, 30.188360061645508 )<br/>
(290000, 31.196840133666992 )<br/>
(300000, 34.13496017456055 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(1000000, 129.23768005371093 )<br/>
(2000000, 245.56231994628905 )<br/>
(3000000, 349.6306408691406 )<br/>
(4000000, 476.635078125 )<br/>
(5000000, 653.7181982421876 )<br/>
(6000000, 784.3321557617187 )<br/>
(7000000, 987.5581127929687 )<br/>
(8000000, 1176.401025390625 )<br/>
(9000000, 1142.6854443359375 )<br/>
(10000000, 1360.9269970703126 )<br/>

<h4> Runtimes for pivot point at midpoint  of array</h4>
Data set in powers of ten:<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
(1, 3.600000170990825E-4 )<br/>
(10, 6.800000322982669E-4 )<br/>
(100, 0.004999999925494194 )<br/>
(1000, 0.05971999928355217 )<br/>
(10000, 0.7310799932479859 )<br/>
(100000, 9.463199882507324 )<br/>
(1000000, 116.38608154296875 )<br/>
(1000000, 130.77955871582031 )<br/>
(2000000, 277.97167907714845 )<br/>
(4000000, 612.6696337890625 )<br/>
(8000000, 1250.0573193359376 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(10000, 11.157800064086913 )<br/>
(20000, 23.10468017578125 )<br/>
(30000, 38.25751983642578 )<br/>
(40000, 50.73571960449219 )<br/>
(50000, 63.16936050415039 )<br/>
(60000, 77.58707977294922 )<br/>
(70000, 95.86880035400391 )<br/>
(80000, 109.03892028808593 )<br/>
(90000, 113.40452087402343 )<br/>
(100000, 135.89312072753907 )<br/>
(110000, 142.91648010253905 )<br/>
(120000, 151.68772033691405 )<br/>
(130000, 167.8890802001953 )<br/>
(140000, 185.99247985839844 )<br/>
(150000, 195.51151977539064 )<br/>
(160000, 208.72547790527344 )<br/>
(170000, 216.78172058105469 )<br/>
(180000, 230.15296264648438 )<br/>
(190000, 245.97256103515625 )<br/>
(200000, 258.6759210205078 )<br/>
(210000, 273.691640625 )<br/>
(220000, 299.19716796875 )<br/>
(230000, 316.4150048828125 )<br/>
(240000, 334.21783935546875 )<br/>
(250000, 339.25795776367187 )<br/>
(260000, 366.86240234375 )<br/>
(270000, 380.1865600585937 )<br/>
(280000, 378.8865600585938 )<br/>
(290000, 406.751240234375 )<br/>
(300000, 428.6623217773438 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(1000000, 130.65179962158203 )<br/>
(2000000, 279.9392785644531 )<br/>
(3000000, 414.04395874023436 )<br/>
(4000000, 597.26416015625 )<br/>
(5000000, 767.25732421875 )<br/>
(6000000, 883.1020068359375 )<br/>
(7000000, 1019.2953198242187 )<br/>
(8000000, 1186.3113037109374 )<br/>
(9000000, 1364.6184716796874 )<br/>
(10000000, 1571.354443359375 )<br/>

<h4> Runtimes for pivot point at first member of array</h4> <br/>
Data set in powers of ten:<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
(1, 3.600000170990825E-4 )<br/>
(10, 8.800000417977571E-4 )<br/>
(100, 0.005679999999701976 )<br/>
(1000, 0.07995999991893768 )<br/>
(10000, 0.9126399993896485 )<br/>
(100000, 12.425439987182617 )<br/>
(1000000, 143.57108001708986 )<br/>
(1000000, 130.84804077148436 )<br/>
(2000000, 274.08636291503905 )<br/>
(4000000, 588.1803527832031 )<br/>
(8000000, 1338.5633154296875 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(10000, 0.9057600045204163 )<br/>
(20000, 1.9170800018310548 )<br/>
(30000, 3.16032000541687 )<br/>
(40000, 4.246760025024414 )<br/>
(50000, 4.819080028533936 )<br/>
(60000, 6.781999988555908 )<br/>
(70000, 7.643519992828369 )<br/>
(80000, 9.822439994812012 )<br/>
(90000, 10.54727996826172 )<br/>
(100000, 10.883080024719238 )<br/>
(110000, 11.461079940795898 )<br/>
(120000, 12.585480079650878 )<br/>
(130000, 14.110639991760253 )<br/>
(140000, 16.93756000518799 )<br/>
(150000, 19.10675994873047 )<br/>
(160000, 21.061800003051758 )<br/>
(170000, 18.521920013427735 )<br/>
(180000, 18.850960083007813 )<br/>
(190000, 20.721439819335938 )<br/>
(200000, 22.27416000366211 )<br/>
(210000, 23.64604019165039 )<br/>
(220000, 24.919600143432618 )<br/>
(230000, 25.36819984436035 )<br/>
(240000, 27.113520050048827 )<br/>
(250000, 29.017080230712892 )<br/>
(260000, 31.924079971313475 )<br/>
(270000, 31.627799758911134 )<br/>
(280000, 35.80675987243652 )<br/>
(290000, 35.19712005615234 )<br/>
(300000, 36.32236022949219 )<br/>

Data in formation (ARR LENGTH, RUNTIME)<br/>
Created by Alitquan Mallick<br/>
(10000000, 136.9246398925781 )<br/>
(20000000, 291.86176208496096 )<br/>
(30000000, 446.40104248046873 )<br/>
(40000000, 518.47236328125 )<br/>
(50000000, 633.1504443359376 )<br/>
(60000000, 776.6074340820312 )<br/>
(70000000, 943.8649609375 )<br/>
(80000000, 1128.051484375 )<br/>
(90000000, 1460.0718701171875 )<br/>
(100000000, 1377.282841796875 )<br/>

<h2> How do pivot selection and data arrangements affect execution time? </h2>
