# kotlinheroespractice4
Codeforces contest: Kotlin Heroes Practice 4


This repo consist of solutions to all the five problems of Codeforces contest: Kotlin Heroes Practice 4. The questions are:

# 1. A+B (Trial Problem)
File: Add.kt
Question: 
You are given two integers a and b. Print a+b.

Input
The first line contains an integer t (1≤t≤104) — the number of test cases in the input. Then t test cases follow.

Each test case is given as a line of two integers a and b (−1000≤a,b≤1000).

Output
Print t integers — the required numbers a+b.

# 2. Square?
File: Square.kt
Question:
Vasya claims that he had a paper square. He cut it into two rectangular parts using one vertical or horizontal cut. Then Vasya informed you the dimensions of these two rectangular parts. You need to check whether Vasya originally had a square. In other words, check if it is possible to make a square using two given rectangles.

Input
The first line contains an integer t (1≤t≤104) — the number of test cases in the input. Then t test cases follow.

Each test case is given in two lines.

The first line contains two integers a1 and b1 (1≤a1,b1≤100) — the dimensions of the first one obtained after cutting rectangle. The sizes are given in random order (that is, it is not known which of the numbers is the width, and which of the numbers is the length).

The second line contains two integers a2 and b2 (1≤a2,b2≤100) — the dimensions of the second obtained after cutting rectangle. The sizes are given in random order (that is, it is not known which of the numbers is the width, and which of the numbers is the length).

Output
Print t answers, each of which is a string "YES" (in the case of a positive answer) or "NO" (in the case of a negative answer). The letters in words can be printed in any case (upper or lower).

# 3. Sum of Round Numbers
File: Round.kt
Question: 
A positive (strictly greater than zero) integer is called round if it is of the form d00...0. In other words, a positive integer is round if all its digits except the leftmost (most significant) are equal to zero. In particular, all numbers from 1 to 9 (inclusive) are round.

For example, the following numbers are round: 4000, 1, 9, 800, 90. The following numbers are not round: 110, 707, 222, 1001.

You are given a positive integer n (1≤n≤104). Represent the number n as a sum of round numbers using the minimum number of summands (addends). In other words, you need to represent the given number n as a sum of the least number of terms, each of which is a round number.

Input
The first line contains an integer t (1≤t≤104) — the number of test cases in the input. Then t test cases follow.

Each test case is a line containing an integer n (1≤n≤104).

Output
Print t answers to the test cases. Each answer must begin with an integer k — the minimum number of summands. Next, k terms must follow, each of which is a round number, and their sum is n. The terms can be printed in any order. If there are several answers, print any of them.

# 4. Alice, Bob and Candies
File: Candies.kt
Question:
There are n candies in a row, they are numbered from left to right from 1 to n. The size of the i-th candy is ai.

Alice and Bob play an interesting and tasty game: they eat candy. Alice will eat candy from left to right, and Bob — from right to left. The game ends if all the candies are eaten.

The process consists of moves. During a move, the player eats one or more sweets from her/his side (Alice eats from the left, Bob — from the right).

Alice makes the first move. During the first move, she will eat 1 candy (its size is a1). Then, each successive move the players alternate — that is, Bob makes the second move, then Alice, then again Bob and so on.

On each move, a player counts the total size of candies eaten during the current move. Once this number becomes strictly greater than the total size of candies eaten by the other player on their previous move, the current player stops eating and the move ends. In other words, on a move, a player eats the smallest possible number of candies such that the sum of the sizes of candies eaten on this move is strictly greater than the sum of the sizes of candies that the other player ate on the previous move. If there are not enough candies to make a move this way, then the player eats up all the remaining candies and the game ends.

For example, if n=11 and a=[3,1,4,1,5,9,2,6,5,3,5], then:

move 1: Alice eats one candy of size 3 and the sequence of candies becomes [1,4,1,5,9,2,6,5,3,5].
move 2: Alice ate 3 on the previous move, which means Bob must eat 4 or more. Bob eats one candy of size 5 and the sequence of candies becomes [1,4,1,5,9,2,6,5,3].
move 3: Bob ate 5 on the previous move, which means Alice must eat 6 or more. Alice eats three candies with the total size of 1+4+1=6 and the sequence of candies becomes [5,9,2,6,5,3].
move 4: Alice ate 6 on the previous move, which means Bob must eat 7 or more. Bob eats two candies with the total size of 3+5=8 and the sequence of candies becomes [5,9,2,6].
move 5: Bob ate 8 on the previous move, which means Alice must eat 9 or more. Alice eats two candies with the total size of 5+9=14 and the sequence of candies becomes [2,6].
move 6 (the last): Alice ate 14 on the previous move, which means Bob must eat 15 or more. It is impossible, so Bob eats the two remaining candies and the game ends.
Print the number of moves in the game and two numbers:

a — the total size of all sweets eaten by Alice during the game;
b — the total size of all sweets eaten by Bob during the game.
Input
The first line contains an integer t (1≤t≤5000) — the number of test cases in the input. The following are descriptions of the t test cases.

Each test case consists of two lines. The first line contains an integer n (1≤n≤1000) — the number of candies. The second line contains a sequence of integers a1,a2,…,an (1≤ai≤1000) — the sizes of candies in the order they are arranged from left to right.

It is guaranteed that the sum of the values of n for all sets of input data in a test does not exceed 2⋅105.

Output
For each set of input data print three integers — the number of moves in the game and the required values a and b.

# 5. Special Permutation
File: Permute.kt
Question:
A permutation of length n is an array p=[p1,p2,…,pn], which contains every integer from 1 to n (inclusive) and, moreover, each number appears exactly once. For example, p=[3,1,4,2,5] is a permutation of length 5.

For a given number n (n≥2), find a permutation p in which absolute difference (that is, the absolute value of difference) of any two neighboring (adjacent) elements is between 2 and 4, inclusive. Formally, find such permutation p that 2≤|pi−pi+1|≤4 for each i (1≤i<n).

Print any such permutation for the given integer n or determine that it does not exist.

Input
The first line contains an integer t (1≤t≤100) — the number of test cases in the input. Then t test cases follow.

Each test case is described by a single line containing an integer n (2≤n≤1000).

Output
Print t lines. Print a permutation that meets the given requirements. If there are several such permutations, then print any of them. If no such permutation exists, print -1.
