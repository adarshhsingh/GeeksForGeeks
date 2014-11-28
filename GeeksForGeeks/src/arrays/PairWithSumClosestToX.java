package arrays;

public class PairWithSumClosestToX {

	final static int MAX_INT = 1000000000;
	public static void main(String[] args) {
		int a[]={1,2,5,7};
		int b[]={10,20,31,40};
		int x = 32;
		int pair[] = getClosestPairToX(a,b,x);
		System.out.println(a[pair[0]]+" "+b[pair[1]]);
	}

	private static int[] getClosestPairToX(int[] a, int[] b, int x) {
		int l = 0 ;
		int r = b.length - 1;
		int diff= MAX_INT;
		int pair[]=new int[2];
		while( l<a.length && r>=0) {
			
			if( Math.abs(a[l]+b[r]-x) < diff) {
				diff =  Math.abs(a[l]+b[r]-x);
				pair[0]=l;
				pair[1]=r;
			}
			
			if( a[l]+b[r] < x ) {
				l++;
			}
			else {
				r--;
			}
		}
		return pair;

	}
}
