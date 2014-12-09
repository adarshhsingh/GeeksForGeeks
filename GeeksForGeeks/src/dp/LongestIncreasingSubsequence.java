package dp;
/*
Dynamic Programming | Set 3 (Longest Increasing Subsequence)
We have discussed Overlapping Subproblems and Optimal Substructure properties in Set 1 and Set 2 respectively.

Let us discuss Longest Increasing Subsequence (LIS) problem as an example problem that can be solved using Dynamic Programming.
The longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that \
all elements of the subsequence are sorted in increasing order. 
For example, length of LIS for { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.

Optimal Substructure:
Let arr[0..n-1] be the input array and L(i) be the length of the LIS till 
index i such that arr[i] is part of LIS and arr[i] is the last element in LIS, then L(i) can be recursively written as.
L(i) = { 1 + Max ( L(j) ) } where j < i and arr[j] < arr[i] and if there is no such j then L(i) = 1
To get LIS of a given array, we need to return max(L(i)) where 0 < i < n
So the LIS problem has optimal substructure property as the main problem can be solved using solutions to subproblems.

Overlapping Subproblems:
Following is simple recursive implementation of the LIS problem. The implementation simply follows 
the recursive structure mentioned above. The value of lis ending with every element is returned using max_ending_here. 
The overall lis is returned using pointer to a variable max.
 */
public class LongestIncreasingSubsequence {

	static int a[]={ 10, 22, 9, 33, 21, 50, 41, 60, 80 };
	static int prev[]= new int[a.length];
	static int maxSeqEnd =0;
	static int maxLength = 0;
	public static void main(String[] args) {
	
		int dp[]=new int[a.length];

		for( int i=0; i<a.length; i++) {
			dp[i] = 1;
			prev[i] = -1;
			
			for( int j= i-1; j>=0; j--) {
				if ( dp[j]+1 > dp[i] && a[j] < a[i] ) {
					dp[i] = dp[j]+1;
					prev[i] = j;
				}
				if(maxLength < dp[i]) {
					maxLength = dp[i];
					maxSeqEnd = i;
				}
			}
		}
		
		System.out.println("Longest Increasing Sequence : ");
		for( int i=maxSeqEnd; i>=0;) {
			System.out.print(a[i]+ " ");
			i = prev[i];
		}
		
	}
}
