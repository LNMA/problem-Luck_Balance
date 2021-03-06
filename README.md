# problem-Luck_Balance

1-Review: 

Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests. Initially, her luck balance is 0. She believes in "saving luck", and wants to check her theory. Each contest is described by two integers L[i] and T[i]:

-L[i]: is the amount of luck associated with a contest. If Lena wins the contest, her luck balance will decrease by L[i]; if she loses it, her luck balance will increase by L[i].

-T[i]:denotes the contest's importance rating. It's equal to 1 if the contest is important, and 0 it's equal to if it's unimportant.

If Lena loses no more than (k) important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.

For example k=2 and:

     Contest	L[i]	T[i]
     1		5	1
     2		1	1
     3		4	0
    
If Lena loses all of the contests, her will be 5+1+4 = 10. Since she is allowed to lose 2 important contests, and there are only important contests. She can lose all three contests to maximize her luck at 10. If k=1 she has to win at least 1 of the 2 important contests. She would choose to win the lowest value important contest worth 1. Her final luck will be 5+4-1 = 8 .  

2-Input Format

The first line contains the number of preliminary contests (n).
The second line the maximum number of important contests Lena can lose (k).
Each of the next lines contains separated integers, L[i] and T[i] , the contest's luck balance and its importance rating.

3-Output Format

Print a single integer denoting the maximum amount of luck Lena can have after all the contests.

Sample

Sample Input

    6 3
    5 1
    2 1
    1 1
    8 1
    10 0
    5 0

Sample Output

    29
