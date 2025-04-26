Leet Code
1.	Palindrome Number -  Leetcode 9

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

 
Intuition:
•	If the given number is negative.
•	If the last digit of the given number is zero.

 
now let us divide the number
   12  |  321
now let us reverse the second half  
   123
now delete the last digit i.e., 3 and compare with the first half, if equal then it is 'true'

isPalindrome(n):
	if n < 0 || (n%10 == 0 && n != 0);
		return false;
	reversedNum = 0;
	while n > reversedNum:
		pop = n % 10;
		reversedNum = reversedNum * 10 + pop;
n = n/10;
	return n == reversedNum || n == reversedNum/10;
complexity: O(n)
constant space complexity: O(1)

2.	Reverse String  - Leetcode 344
Write a function that reverse a string. The input string is given as an array of characters char[].
The given string is ‘HELLO’

 
reverse_string(s):
	left = 0;
	right = len(str) – 1;
	while left < right:
		tmp = s[left];
		s[left] = s[right];
s[right] = tmp;
left++;
right--;
	return s;
Time complexity: O(n/2)
Constant space complexity: O(1)
3.	Longest Palindromic Substring   - Leetcode - 5
Expand around centre
a     b    a     b   a
longest_palindrome_substring(s):
	if s== null || s.length < 1:
	return “”
	start = 0, end = 0
for I from 0 to s.length-1:
len1 = expandAroundCenter(s,i,i)
len2 = expandAroundCenter(s,i,i+1)
	if len > end – start:
		start = i – (len - 1)/2
		end = i + len/2
	
expandAroundCenter(s, left, right):
L = left, R = right
While L >=0 && R <s.length &7 s.charAt(L) == s.charAt(R):
	L—
R++
Return R – L  -  1
4.	Binary Search: Leetcode - 704
Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. If target exists, then return its index, otherwise -1.
Example:     nums = [-1,0,3,5,9,12]
 
5.	Length of Last Word: Leetcode 58
Given a string s consists of upper/lower-case alphabets and empty space characters ‘ ’, return the length of last word in the string. If the last word does not exist, return 0.
 
	lenOfLastWord(str):
  count = 0;
  for i from len(str)-1 to 0:
	if s.charAt(i) != ‘ ‘;
		count++;
else:
	if count > 0:
		return count;

6.	Plus, One

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
You may assume that **Each element in the array contains a single digit.
Example: the given array below 2 scenarios

 	

plusOne(digits):
	carry = 1;
for i from len(digits)-1 to 0 && carry ==1:
	tmp = digits[i]+carry;
	if tmp >= 10:
		carry = 1;
		digits[i] = tmp;
if curry != 0:
	newDigits = new int[len(gidits)+1];
	newDigits[0] = 1;
	for j from 1 to len(newDigits) -1:
		newDigits[j] = digits[j-1];
	return newDigits;
return newDigits;

7.	Move Zeroes    Leetcode – 283

Given an array nums, write a function to move all 0’s to the end of it while maintaining the relative order of the non-zero elements.

Example:      [0, 1, 0, 3,12]   to  [ 1,3,12,0,0]
moveZeroes(nums):
	current = 0;
	for I from 0 to len(nums) -1:
		if nums[i] != 0:
			nums[current] = nums[i];
current++;
	for j from current to len(nums) – 1:
nums[i] = 0;
8.	Find All Disappeared/Missing numbers Leetcode – 448
Given an array of integers where 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.

Find all the elements that do not appear in this array Constraint: Space O(1) and Time O(n)

find_missing_numbers(nums):
	list = [];
	for I from 0 to len(nums):
	        n = abs(nums[i]);
	        if nums[n-1] > 0:
		nums[n-1] = -1* nums[n-1];
	for I from 0 to len(nums):
	        if nums[i] > 0:
		list.add(i+1);
	return list;
 
9.	Average Salary excluding the Minimum and Maximum Leetcode – 1491
Given an array of unique integers salary where salary[i] is the salary of the employee i. return the average salary of employees excluding the minimum and maximum salary.
Example: In the given below array excluding min and max, calculate the average of remaining elements.
 

