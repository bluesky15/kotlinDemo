Tired of boring office work, Denis decided to open a fast food restaurant.

On the first day he made 𝑎 portions of dumplings, 𝑏 portions of cranberry juice and 𝑐 pancakes with condensed milk.

The peculiarity of Denis's restaurant is the procedure of ordering food. For each visitor Denis himself chooses a set of dishes that this visitor will receive. When doing so, Denis is guided by the following rules:

every visitor should receive at least one dish (dumplings, cranberry juice, pancakes with condensed milk are all considered to be dishes);
each visitor should receive no more than one portion of dumplings, no more than one portion of cranberry juice and no more than one pancake with condensed milk;
all visitors should receive different sets of dishes.
What is the maximum number of visitors Denis can feed?

Input
The first line contains an integer 𝑡 (1≤𝑡≤500) — the number of test cases to solve.

Each of the remaining 𝑡 lines contains integers 𝑎, 𝑏 and 𝑐 (0≤𝑎,𝑏,𝑐≤10) — the number of portions of dumplings, the number of portions of cranberry juice and the number of condensed milk pancakes Denis made.

Output
For each test case print a single integer — the maximum number of visitors Denis can feed.

Example
inputCopy
7
1 2 1
0 0 0
9 1 7
2 2 3
2 3 2
3 2 2
4 4 4
outputCopy
3
0
4
5
5
5
7
Note
In the first test case of the example, Denis can feed the first visitor with dumplings, give the second a portion of cranberry juice, and give the third visitor a portion of cranberry juice and a pancake with a condensed milk.

In the second test case of the example, the restaurant Denis is not very promising: he can serve no customers.

In the third test case of the example, Denise can serve four visitors. The first guest will receive a full lunch of dumplings, a portion of cranberry juice and a pancake with condensed milk. The second visitor will get only dumplings. The third guest will receive a pancake with condensed milk, and the fourth guest will receive a pancake and a portion of dumplings. Please note that Denis hasn't used all of the prepared products, but is unable to serve more visitors.