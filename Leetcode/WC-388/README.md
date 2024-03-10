# Leetcode Weekly Contest Solutions

In this document, I will share my approaches to the problems in the Leetcode Weekly Contest 388.

## Table of Contents

1. [3074. Apple Redistribution into Boxes](#3074-apple-redistribution-into-boxes)
2. [3075. Maximize Happiness of Selected Children](#3075-maximize-happiness-of-selected-children)
3. [3076. Shortest Shortest Uncommon Substring in an Array](#3076-shortest-shortest-uncommon-substring-in-an-array)

## 3074. Apple Redistribution into Boxes

### Problem Statement

You are given an array apple of size n and an array capacity of size m.

There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.

Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.

Note that, apples from the same pack can be distributed into different boxes.

### Intuition:

We need to select the minimum number of boxes to redistribute the apples into the boxes. We can select the boxes with maximum capacity first and then select the boxes with less capacity. We can iterate the array from the end and select the boxes with maximum capacity. We can keep track of the number of apples and the number of boxes selected. If the number of apples becomes less than or equal to 0, then we can break the loop and return the number of boxes selected.

### Approach

```
1. Count the total number of apples.
2. Sort the capacity of the boxes in ascending order.
3. Start from the box with the maximum capacity and keep on adding the apples to the box until the total number of apples is less than or equal to 0.
4. Return the number of boxes used.
```

### Code

check `Q1.java`

## 3075. Maximize Happiness of Selected Children

### Problem Statement

You are given an array happiness of length n, and a positive integer k.

There are n children standing in a queue, where the ith child has happiness value happiness[i]. You want to select k children from these n children in k turns.

In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1. Note that the happiness value cannot become negative and gets decremented only if it is positive.

Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.

### Intuition:

We need to select k children from n children in k turns. In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1. Note that the happiness value cannot become negative and gets decremented only if it is positive.

### Approach:

```
1. Sort the array in ascending order.
2. Iterate the array from the end and select the children with maximum happiness value.
3. If the happiness value is greater than or equal to the number of children selected till now, then add the difference to the sum.
4. Return the sum.
```

### Code

check `Q2.java`

## 3076. Shortest Shortest Uncommon Substring in an Array

### Problem Statement

You are given an array arr of size n consisting of non-empty strings.

Find a string array answer of size n such that:

answer[i] is the shortest
substring
of arr[i] that does not occur as a substring in any other string in arr. If multiple such substrings exist, answer[i] should be the
lexicographically smallest
. And if no such substring exists, answer[i] should be an empty string.
Return the array answer.

### Intuition

For each string in the array, we need to find the shortest substring that does not occur in any other string. We can do this by iterating through each string and finding all the substrings of the string. Then we can check if the substring occurs in any other string. If it does not, we can add it to a list of substrings. We can then sort the list of substrings and return the first element of the list. If the list is empty, we can return an empty string. We can do this for each string in the array and return the result.

### Approach:

```
1. Create an arraylist of strings to store the result.
2. Iterate through each string in the array.
3. For each string, iterate through each character in the string and create all the substrings of the string.
4. For each substring, check if it occurs in any other string in the array. If it does not, add it to the list of substrings.
5. Sort the list of substrings and return the first element of the list. If the list is empty, return an empty string.
6. Return the result.
```

### Code

check `Q3.java`
