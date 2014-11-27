/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *
 * @author Adarsh
 */
public class Segregate0sAns1sInAnArray {
    
    public static int[] segregate(int a[])
    {
        int left=0;
        int right=a.length-1;
        
        while(left<right)
        {
            if(a[left]==0){left++;continue;}
            if(a[right]==1){right--; continue;}
            if(a[left]==1 && a[right]==0){a[left]=0;a[right]=1;}
        }
        return a;
    }
    public static void main(String []args)
    {
        int arr[] = {0, 1, 0, 1,0,0,0, 1, 1};
  
        arr=segregate(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
 
    }
}
