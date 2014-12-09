package dp;
/*
 * 
Ugly Numbers
Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
shows the first 11 ugly numbers. By convention, 1 is included.
Write a program to find and print the 150’th ugly number.


METHOD 1 (Simple)
Thanks to Nedylko Draganov for suggesting this solution.

Algorithm:
Loop for all positive integers until ugly number count is smaller than n, 
if an integer is ugly than increment ugly number count.

To check if a number is ugly, divide the number by greatest divisible powers of 2, 3 and 5, 
if the number becomes 1 then it is an ugly number otherwise not.

For example, let us see how to check for 300 is ugly or not. Greatest divisible power of 2 is 4, 
after dividing 300 by 4 we get 75. 
Greatest divisible power of 3 is 3, after dividing 75 by 3 we get 25. 
Greatest divisible power of 5 is 25, after dividing 25 by 25 we get 1. 
Since we get 1 finally, 300 is ugly number.
 */
public class UGLYNUMBERS {

	public static void main(String[] args) {
		
		int[] ugly_num = new int[200];
		ugly_num[0] = 1;
		int x = 2;
		int y = 3;
		int z = 5;
		int ix = 0;
		int iy = 0;
		int iz = 0;
		int next_ugly_x = 0, next_ugly_y = 0, next_ugly_z = 0 ;
		int next_ugly = 0;
		for( int i =1; i<20; i++) {
			next_ugly_x = ugly_num[ix]*x;
			next_ugly_y = ugly_num[iy]*y;
			next_ugly_z = ugly_num[iz]*z;
			next_ugly = Math.min(next_ugly_x, Math.min(next_ugly_z, next_ugly_y));
			if(next_ugly == next_ugly_x) {
				ix++;
			}
			if(next_ugly == next_ugly_y) {
				iy++;
			}
			if(next_ugly == next_ugly_z) {
				iz++;
			}
			ugly_num[i] = next_ugly;
			System.out.println(ugly_num[i]);
		}
	}
}
