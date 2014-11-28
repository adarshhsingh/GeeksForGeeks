/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays.divideAndConquer;

/**
 *
 * @author Adarsh
 */
public class MedianOfTwoSortedArrays {
    
    public static int getMeadianByMergeAndCount(int ar1[], int ar2[], int n)
    {
        // a , b are the two sorted arrays with N elements each
        int count=0; //count for median
        int i=0; // index for array 'ar1'
        int j=0; // index for array 'ar2'
        
        int m1=-1;
        int m2=-1;
        
        // Since there are 2n elements
        for(count =0;count<=n;count++)
        {
            // Below is to handle case where all elemnets of ar1[]
            //are smaller than smallest of ar2
            if(i==n)
            {
                m1=m2;// Strore the previous median
                m2=ar2[0];
                break;
            }
            
            // Below is to hadle the case where all elements of ar2 
            //are smaller than ar1 smallest
            else if(j==n)
            {
                m1=m2;// Store the previous median
                m2=ar1[0];
                break;
            }
            
            if(ar1[i]<ar2[j])
            {
                m1=m2;
                m2=ar1[i];
                i++;
            }
            else
            {
                m1=m2;
                m2=ar2[j];
                j++;
            }
        }
        return (m1+m2)/2;
    }
    
    public static int getMedianByComparingMedianOfTwoArrays(int a[] , int aL , int aH , int b[] , int bL ,int bH )
    {
    
        int aMedian,bMedian;
        
        /*
        System.out.println("\nCall");
        
        for(int i=aL;i<=aH;i++)
        {System.out.print(a[i]+"    ");}
        System.out.println("");
        for(int i=bL;i<=bH;i++)
        {System.out.print(b[i]+"    ");}
        */
        if(aH-aL==0 &&  bH-bL==0) return ((a[0]+b[0])/2);
        
        if(aH-aL==1 && bH-bL==1) return ((Math.max(a[aL], b[bL]) + Math.min(a[aH], b[bH]))/2);
        
        if((aL+aH)%2==0) aMedian=a[(aL+aH)/2]; 
        else aMedian=(a[((aL+aH)%2)]+a[((aL+aH)%2)+1])/2;
        
        if((bL+bH)%2==0) bMedian=b[(bL+bH)/2]; 
        else bMedian=(b[((bL+bH)%2)]+b[((bL+bH)%2)+1])/2;
       
        //System.out.print("\naMedian ="+aMedian+" bMedian="+bMedian+" | ");
        
        if(aMedian==bMedian) 
        {
            //System.out.println("\tMedian Mtached");
            return aMedian;
        }
        else if(aMedian > bMedian)
        { 
            //System.out.println("\taMedian > bMedian");
            return getMedianByComparingMedianOfTwoArrays(a, aL,(aL+aH)/2 , b,(bL+bH)/2+1, bH);
        }
        else
        {
            //System.out.println("\tbMedian > aMedian"); 
            return getMedianByComparingMedianOfTwoArrays(a,(aL+aH)/2+1 ,aH, b,bL,(bL+bH)/2);
        }
    }
    
  /*  public static int getMedianByUsingBinarySearch(int ar1[] , int ar2[] , int left , int right , int n)         
    {
        int i , j;
        
        if(left > right)
            return getMedianByUsingBinarySearch(ar2, ar1, 0 , n-1, n);
        
        i=(left+right)/2;
        j=n-i-1; // Index of ar2[] 
        
        // Recursion Terminates Here 
        if(ar1[i] > ar2[j] && (j==n-1 || ar1[i]<=ar2[j+1]))
        {
            // ar[i] is decided as median 2 , now select the median 1
            // (element just before ar[i] in merged array) to get avg of both)
            if(i==0 || ar2[j]>ar1[i-1] )
                return (ar1[i]+ar2[j])/2;
            else 
                return (ar1[i]+ar1[i-1])/2;
        }
        
        // Search in left half of array ar1[]
        //else if( ar1[i] > ar2[j] && )
        
    }*/
    
    public static void main(String args[])
    {
        int ar1[] = {1,2};
        int ar2[] = {3};
        System.out.println(getMeadianByMergeAndCount(ar1, ar2, ar1.length));
        System.out.println(getMedianByComparingMedianOfTwoArrays(ar1, 0, ar1.length-1, ar2, 0 , ar2.length-1));
    }
}
