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
public class FindAPeakElement {
    
    static int peakElement(int a[],int low , int high , int n)
    {
        // Find index of middle element
        int mid=(low+high)/2;
        
       // Compare middle elements with its neighbours (if neighbours exist)
        if((mid==0 || a[mid-1]<=a[mid]) && (mid==n-1 || a[mid+1]<=a[mid]))
            return a[mid];
        
        // If middle element is not peak and its left neighbour is greater than it
        // then left half must have a peak element
        else if(mid>0 && a[mid-1]>a[mid])
            return peakElement(a, low, (mid-1) , n);
        
        // If middle elent is not peak and its right neighbour is greater than it
        // then right half must have a peak element
        else return peakElement(a,(mid+1), high, n);
    }
    public static void main(String[]args)
    {
        int a[]={1,2,3,4,5,6,7,8,9,0,8,0};
        System.out.println(getPeakElement(a));
    }

    private static int getPeakElement(int[] a) {
    
        int n=a.length;
        return peakElement(a, 0, n-1, n);
    }
}
