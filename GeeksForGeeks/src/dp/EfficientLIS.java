package dp;

public class EfficientLIS {
	
	static int a[]= { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
	static int s[]=new int[a.length];
	static int p[]=new int[a.length];
	
	static int sL =0;
	public static void main(String[] args) {
		s[0] = 0;
		sL=1;
		int index = 0;
		p[0]=-1;
		for( int i=1;i<a.length;i++) {
			
			index = binarySearch(a[i],sL);
			if( index == -1) {
				s[sL] = i;
				p[i]=s[sL-1];
				sL++;
			} else {
				s[index] = i;
				if(index==0)p[i] = -1;
				else p[i]=s[index-1];
			}
		}
		for(int i=0;i<sL;i++) {
			System.out.print((s[i])+ " ");
		}
		System.out.println("");
		for(int i=0;i<a.length;i++) {
			System.out.print(p[i]+ " ");
		}
		int k = s[sL-1];
		int x = sL-1;
		int series[]=new int[sL];
		while(k>=0) {
			series[x] = a[k];
			k = p[k];
			x--;
		}
		System.out.println();
		for(int i=0;i<series.length;i++) {
			System.out.print(series[i]+ " ");
		}
		
	}
	
	
	private static int binarySearch(int n,int len) {
		
		int l = 0 , r = len-1;
		int mid=0;
		while( l <= r) {
			//System.out.println(l + " "+r);
			mid = (l+r)/2;
			if( mid == 0) {
				if(value(s[mid])>n) return mid;
				else l++;
			}
			else if( value(s[mid]) == n || (value(s[mid])>n && value(s[mid-1])<n)) return mid;
			else if( value(s[mid])>n) r=mid-1;
			else l = mid+1;
		}
		return -1;
	}


	static int value(int i) {
		return a[i];
	}
	
	
}
