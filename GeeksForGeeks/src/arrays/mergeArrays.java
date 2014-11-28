package arrays;

public class mergeArrays {

	public static void main(String[] args) {
		
		
		int a[]={1,3,6};
		int b[]={2,4,5};
		int c[]={1,2,2};
		int x[]=mergeArrays(a,b);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		int y[]=mergeArrays(b,c);
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}

	private static int[] mergeArrays(int[] a, int[] b) {

		int i=a.length-1;
		int j=b.length-1;
		int maxA=a[i];
		int maxB=b[j];
		int err[]={-1};
		int x[]=new int[a.length+b.length];
		int k=0;
		while(i>=0 && j>=0)
		{
			if(a[i]>maxA || b[j]>maxB)return err;
			
			if(a[i]<b[j])
			{
				x[k]=b[j];
				maxB=b[j];
				k++;
				j--;
			}
			else
			{
				x[k]=a[i];
				maxA=a[i];
				k++;
				i--;
			}
		}
		
		if(i>=0)
		{
			for(;i>=0;i--)
			{
				if(a[i]>maxA)return err;
				x[k]=a[i];
				maxA=a[i];
				k++;
				
			}
		}
		else
		{
			for(;j>=0;j--)
			{
				if(b[j]>maxB)return err;
				x[k]=b[j];
				maxB=b[j];
				k++;
			}
		}
		return x;
	}
}
