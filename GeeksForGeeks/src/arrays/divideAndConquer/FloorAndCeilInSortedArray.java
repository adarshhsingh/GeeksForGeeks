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
public class FloorAndCeilInSortedArray {
    
    public static void floorAndCeil(int a[] , int x)
    {
        int left=0,right=a.length-1;
        int mid=0;
        
        if(x<a[left])
         {
             System.out.println("Floor : Dont Exist |||  Ceil : "+a[left]);
             return;
         }
        
        if(x==a[left] || x==a[right])
        {
            System.out.println("Floor : "+x+ "|||  Ceil : "+x);
            return;
        }
        
        if(x>a[right])
        {
            System.out.println("Floor : "+a[right]+ "|||  Ceil : Dont Exist");
            return;
        }
        
        mid=(left+right)/2;
        
        while(left<right)
        {
            if(a[mid]==x)
            {
                System.out.println("Floor : "+x+ "|||  Ceil : "+x);
                return;
            }
            else if(a[mid]<x)
            {
               // if( )
            }
            else
            {
                
            }
        }
        
        
        
        
      //  if()
        while(left<right)
        {
            
            
        }
        
    }
}
