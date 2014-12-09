package dp;

import javax.xml.bind.ValidationEvent;

/*
 * For example, consider the below binary matrix.

 
   0  1  1  0  1 
   1  1  0  1  0 
   0  1  1  1  0
   1  1  1  1  0
   1  1  1  1  1
   0  0  0  0  0
The maximum square sub-matrix with all set bits is

    1  1  1
    1  1  1
    1  1  1

 */
public class MaxSizeSubMatrix {

	static int[][] matrix={  {0,1,1,0,1}
	, {1,1,0,1,0} 
	, {0,1,1,1,0}
	, {1,1,1,1,0}
	, {1,1,1,1,1}
	, {0,0,0,0,0} };
	static int max_sub_mat = 0;
	static int row = 6;
	static int col = 5;
	static int arr[][]=new int[row][col];
	
	public static void main(String[] args) {
		for( int i = 0; i<row; i++ ) {
			for( int j = 0; j<col; j++) {
				arr[i][j] = Math.min(valueAT(i,j-1),Math.min(valueAT(i-1,j),valueAT(i-1,j-1))) + matrix[i][j];
				max_sub_mat = Math.max(max_sub_mat, arr[i][j]);
			}
		}
		System.out.println(max_sub_mat);
/*		for( int i = 0; i<row; i++ ) {
			for( int j = 0; j<col; j++) {
				System.out.println(arr[i][j]+ " ");
			}
		}
*/		
	}

	private static int valueAT(int i, int j) {
		if( i>=1 && j>=1) {
			return arr[i][j];
		} else if( i >= 0 && j>=0 ) {
			return matrix[i][j];
		}
		return 0;
	}
}
