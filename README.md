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
<p> Duration for n = 10000: 1.938080015182495
Duration for n = 100000: 10.752519989013672
Duration for n = 1000000: 125.46827972412109
Duration for n = 10000000: 1442.9812353515624


Duration for n= 10000 : 1.5636400127410888
Duration for n= 20000 : 1.9712799930572509
Duration for n= 30000 : 2.8433999824523926
Duration for n= 40000 : 3.8593199920654295
Duration for n= 50000 : 5.017559986114502
Duration for n= 60000 : 5.99387996673584
Duration for n= 70000 : 7.184880027770996
Duration for n= 80000 : 8.312719993591308
Duration for n= 90000 : 9.307079963684082
Duration for n= 100000 : 10.544559898376464
Duration for n= 110000 : 11.53180004119873
Duration for n= 120000 : 12.73360008239746
Duration for n= 130000 : 14.437800102233886
Duration for n= 140000 : 14.829320068359374
Duration for n= 150000 : 16.139479942321778
Duration for n= 160000 : 17.18547996520996
Duration for n= 170000 : 18.928200073242188
Duration for n= 180000 : 19.966999893188476
Duration for n= 190000 : 21.843040161132812
Duration for n= 200000 : 23.247680206298828
Duration for n= 210000 : 23.09636001586914
Duration for n= 220000 : 24.272879943847656
Duration for n= 230000 : 25.792119827270508
Duration for n= 240000 : 26.659280166625976
Duration for n= 250000 : 28.674039993286133
Duration for n= 260000 : 28.866039962768554
Duration for n= 270000 : 30.34363998413086
Duration for n= 280000 : 31.431159896850588
Duration for n= 290000 : 32.52308013916016
Duration for n= 300000 : 33.712919921875


Duration for n= 1000000 : 10.401640014648438
Duration for n= 2000000 : 21.92151985168457
Duration for n= 3000000 : 33.682200317382815
Duration for n= 4000000 : 45.58067977905274
Duration for n= 5000000 : 59.699840240478515
Duration for n= 6000000 : 70.81620025634766
Duration for n= 7000000 : 82.87204010009765
Duration for n= 8000000 : 96.18531951904296
Duration for n= 9000000 : 110.16583953857422
Duration for n= 10000000 : 123.88448028564453



Runtimes for pivot point at first member of array
Data set in powers of ten:

Duration for n = 1: 5.600000265985727E-4
Duration for n = 10: 0.004399999980814755
Duration for n = 100: 0.017280000299215316
Duration for n = 1000: 0.25235999941825865
Duration for n = 10000: 2.1657200050354004
Duration for n = 100000: 10.599679985046386
Duration for n = 1000000: 128.3420379638672
Duration for n = 10000000: 1422.2004443359374


Duration for n= 10000 : 0.8550399994850159
Duration for n= 20000 : 1.829720001220703
Duration for n= 30000 : 2.8216400051116945
Duration for n= 40000 : 3.8548400020599365
Duration for n= 50000 : 4.843480014801026
Duration for n= 60000 : 5.9883199882507325
Duration for n= 70000 : 7.010879936218262
Duration for n= 80000 : 8.051919956207275
Duration for n= 90000 : 9.32568000793457
Duration for n= 100000 : 10.244279975891112
Duration for n= 110000 : 11.420920066833496
Duration for n= 120000 : 12.639519996643067
Duration for n= 130000 : 13.559640045166015
Duration for n= 140000 : 14.869959983825684
Duration for n= 150000 : 15.86759994506836
Duration for n= 160000 : 17.178799896240236
Duration for n= 170000 : 19.37379997253418
Duration for n= 180000 : 19.295999908447264
Duration for n= 190000 : 20.576160049438478
Duration for n= 200000 : 21.89483985900879
Duration for n= 210000 : 22.918999862670898
Duration for n= 220000 : 24.21247985839844
Duration for n= 230000 : 25.073960037231444
Duration for n= 240000 : 26.141719970703125
Duration for n= 250000 : 27.455920028686524
Duration for n= 260000 : 28.553560180664064
Duration for n= 270000 : 30.137880172729492
Duration for n= 280000 : 31.055760116577147
Duration for n= 290000 : 33.45967987060547
Duration for n= 300000 : 33.41244003295898


Duration for n= 1000000 : 10.381439971923829
Duration for n= 2000000 : 21.737719955444337
Duration for n= 3000000 : 33.37743988037109
Duration for n= 4000000 : 46.09188003540039
Duration for n= 5000000 : 61.91284027099609
Duration for n= 6000000 : 71.67640075683593
Duration for n= 7000000 : 83.47075958251953
Duration for n= 8000000 : 97.17916015625
Duration for n= 9000000 : 109.53956115722656
Duration for n= 10000000 : 122.08899963378906


alitquan@ALITQUAN:/mnt/c/Users/alitquan/Desktop/appleJuice$ javac runTimeTest.java
runTimeTest.java:145: error: reached end of file while parsing
}
 ^
1 error
alitquan@ALITQUAN:/mnt/c/Users/alitquan/Desktop/appleJuice$ javac runTimeTest.java
alitquan@ALITQUAN:/mnt/c/Users/alitquan/Desktop/appleJuice$ java runTimeTest

Runtimes for pivot point at last member of array
Data set in powers of ten:

Duration for n = 1: 6.000000284984708E-4
Duration for n = 10: 0.005800000019371509
Duration for n = 100: 0.1117600005865097
Duration for n = 1000: 0.424719997048378
Duration for n = 10000: 1.1082400107383727
Duration for n = 100000: 9.325400161743165
Duration for n = 1000000: 106.3249203491211
Duration for n = 1000000: 107.80592010498047
Duration for n = 2000000: 225.52828125
Duration for n = 4000000: 480.35735961914065
Duration for n = 8000000: 998.56814453125


Duration for n= 10000 : 0.811080002784729
Duration for n= 20000 : 1.6532399845123291
Duration for n= 30000 : 2.488680000305176
Duration for n= 40000 : 3.414399976730347
Duration for n= 50000 : 4.311559963226318
Duration for n= 60000 : 5.428040008544922
Duration for n= 70000 : 6.54515998840332
Duration for n= 80000 : 7.571319980621338
Duration for n= 90000 : 8.345919990539551
Duration for n= 100000 : 9.141960029602052
Duration for n= 110000 : 10.30020004272461
Duration for n= 120000 : 11.543840065002442
Duration for n= 130000 : 12.153720054626465
Duration for n= 140000 : 13.271720008850098
Duration for n= 150000 : 14.307280006408691
Duration for n= 160000 : 15.350959930419922
Duration for n= 170000 : 16.388359985351563
Duration for n= 180000 : 18.669120101928712
Duration for n= 190000 : 18.39720001220703
Duration for n= 200000 : 19.812639923095702
Duration for n= 210000 : 20.861640014648437
Duration for n= 220000 : 21.45036003112793
Duration for n= 230000 : 22.806200103759764
Duration for n= 240000 : 25.030919876098633
Duration for n= 250000 : 25.124320068359374
Duration for n= 260000 : 26.01012008666992
Duration for n= 270000 : 29.331480178833008
Duration for n= 280000 : 30.698919525146483
Duration for n= 290000 : 30.306399993896484
Duration for n= 300000 : 31.542479629516603


Duration for n= 1000000 : 9.531479988098145
Duration for n= 2000000 : 19.15047996520996
Duration for n= 3000000 : 29.572840042114258
Duration for n= 4000000 : 40.51131973266602
Duration for n= 5000000 : 52.19888000488281
Duration for n= 6000000 : 66.42359985351563
Duration for n= 7000000 : 82.35940032958985
Duration for n= 8000000 : 96.50536041259765
Duration for n= 9000000 : 98.83827911376953
Duration for n= 10000000 : 109.5833203125



Runtimes for pivot point at midpoint  of array
Data set in powers of ten:

Duration for n = 1: 6.000000284984708E-4
Duration for n = 10: 0.006320000137202441
Duration for n = 100: 0.018639999777078628
Duration for n = 1000: 0.23684000015258788
Duration for n = 10000: 1.7598000049591065
Duration for n = 100000: 10.526520004272461
Duration for n = 1000000: 122.58880004882812
Duration for n = 1000000: 126.53352111816406
Duration for n = 2000000: 269.53283935546875
Duration for n = 4000000: 579.6776782226563
Duration for n = 8000000: 1194.0495556640626


Duration for n= 10000 : 0.8706399941444397
Duration for n= 20000 : 1.8380399942398071
Duration for n= 30000 : 2.9320399951934815
Duration for n= 40000 : 3.9851999950408934
Duration for n= 50000 : 5.141279983520508
Duration for n= 60000 : 6.189120025634765
Duration for n= 70000 : 7.242640018463135
Duration for n= 80000 : 8.382759971618652
Duration for n= 90000 : 9.604799957275391
Duration for n= 100000 : 10.946080017089844
Duration for n= 110000 : 11.962160110473633
Duration for n= 120000 : 13.283040046691895
Duration for n= 130000 : 14.06803997039795
Duration for n= 140000 : 15.379799919128418
Duration for n= 150000 : 16.655519866943358
Duration for n= 160000 : 17.883040084838868
Duration for n= 170000 : 18.974319915771485
Duration for n= 180000 : 20.06911994934082
Duration for n= 190000 : 21.250959854125977
Duration for n= 200000 : 22.51844009399414
Duration for n= 210000 : 23.669839782714845
Duration for n= 220000 : 25.50896011352539
Duration for n= 230000 : 27.283639984130858
Duration for n= 240000 : 27.436319961547852
Duration for n= 250000 : 28.604359970092773
Duration for n= 260000 : 29.810360107421875
Duration for n= 270000 : 30.9152400970459
Duration for n= 280000 : 32.78255996704102
Duration for n= 290000 : 33.293479919433594
Duration for n= 300000 : 34.93832015991211


Duration for n= 1000000 : 10.653000030517578
Duration for n= 2000000 : 22.470279998779297
Duration for n= 3000000 : 35.58408004760742
Duration for n= 4000000 : 47.60832000732422
Duration for n= 5000000 : 59.79580017089844
Duration for n= 6000000 : 72.04767944335937
Duration for n= 7000000 : 85.62011993408203
Duration for n= 8000000 : 100.46752044677734
Duration for n= 9000000 : 112.2814404296875
Duration for n= 10000000 : 126.17796020507812



Runtimes for pivot point at first member of array
Data set in powers of ten:

Duration for n = 1: 5.600000265985727E-4
Duration for n = 10: 0.004440000201575458
Duration for n = 100: 0.017160000577569008
Duration for n = 1000: 0.25876000165939333
Duration for n = 10000: 1.981840012073517
Duration for n = 100000: 10.607439994812012
Duration for n = 1000000: 127.52132049560547
Duration for n = 1000000: 127.86100006103516
Duration for n = 2000000: 274.09364135742186
Duration for n = 4000000: 557.121201171875
Duration for n = 8000000: 1158.8008837890625


Duration for n= 10000 : 2.389159989356995
Duration for n= 20000 : 2.0936799955368044
Duration for n= 30000 : 2.8160400199890137
Duration for n= 40000 : 3.9014399814605714
Duration for n= 50000 : 5.029240016937256
Duration for n= 60000 : 5.988959999084472
Duration for n= 70000 : 7.154680004119873
Duration for n= 80000 : 8.294759998321533
Duration for n= 90000 : 9.351680030822754
Duration for n= 100000 : 10.432959938049317
Duration for n= 110000 : 11.49128002166748
Duration for n= 120000 : 12.582800064086914
Duration for n= 130000 : 13.76416000366211
Duration for n= 140000 : 14.936280059814454
Duration for n= 150000 : 15.97359992980957
Duration for n= 160000 : 17.244559783935546
Duration for n= 170000 : 18.798159942626953
Duration for n= 180000 : 19.442720031738283
Duration for n= 190000 : 20.672200088500976
Duration for n= 200000 : 22.86740005493164
Duration for n= 210000 : 23.01568000793457
Duration for n= 220000 : 24.17007995605469
Duration for n= 230000 : 25.664319915771486
Duration for n= 240000 : 27.16343994140625
Duration for n= 250000 : 28.376879959106446
Duration for n= 260000 : 29.079039916992187
Duration for n= 270000 : 30.389120025634767
Duration for n= 280000 : 31.66488006591797
Duration for n= 290000 : 33.165279693603516
Duration for n= 300000 : 34.476599578857424


Duration for n= 1000000 : 12.108319931030273
Duration for n= 2000000 : 24.609840087890625
Duration for n= 3000000 : 35.472559967041015
Duration for n= 4000000 : 46.50835998535156
Duration for n= 5000000 : 58.60551986694336
Duration for n= 6000000 : 70.94996002197266
Duration for n= 7000000 : 86.07504028320312
Duration for n= 8000000 : 97.66259948730469
Duration for n= 9000000 : 110.14880004882812
Duration for n= 10000000 : 129.0330010986328
</p>
<h2> How do pivot selection and data arrangements affect execution time? </h2>
