/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  arrays.divideAndConquer;

/**
 *
 * @author Adarsh
 */
public class FindNumberOfZeroInArrayOfOnesFollowedByZero {
    
    public static void main(String arg[])
    {
        int a[]={1,1,0,0,0,0,0,0,0,0,0};
        int ans=noOfZero(a);
        System.out.println(ans);
       int  arr[] = {1, 1, 1, 1, 0, 0};
       ans=noOfZero(arr);
        System.out.println(ans);
int arr1[] = {1, 0, 0, 0, 0};
ans=noOfZero(arr1);
        System.out.println(ans);
int arr2[] = {1, 1, 1};
ans=noOfZero(arr2);
        System.out.println(ans);

    }

    private static int noOfZero(int[] a) {
    
      int high=a.length-1;
      int low=0,mid=0;
      if(a[0]==0)return high+1;
      if(a[high]==1)return 0;
      while(high>=low)
      {
          mid=(high+low)/2;
          
          if(a[mid]==1 && a[mid+1]==0)return(a.length-mid-1);
          else if(a[mid]==0 && a[mid-1]==1) return(a.length-mid); 
          else if(a[mid]==1)low=mid;
          else high=mid;
      }
        return 0;
    }
}
