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
import java.util.*;

public class KthLargestOrSmallestElementsInAnArray {

    public static int KthLargest(int a[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1,
        new Comparator<Integer>(){
           
            public int compare(Integer t, Integer t1) {
            return t1-t;    
            }

        });
        
        for(int i=0;i<a.length;i++)pq.offer(new Integer(a[i]));
        for(int i=0;i<k-1;i++)pq.poll();
        int ans=(int)pq.poll();
        return ans;
    }
    
    public static int KthSmallest(int a[],int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1,
        new Comparator<Integer>(){
           
            public int compare(Integer t, Integer t1) {
            return t-t1;    
            }

        });
        
        for(int i=0;i<a.length;i++)pq.offer(new Integer(a[i]));
        for(int i=0;i<k-1;i++)pq.poll();
        int ans=(int)pq.poll();
        return ans;
    }
   
    public static void main(String []args)
    {
     int a[]={1, 2, 3, 4, 5, 6, 7};
     System.out.println(KthLargest(a, 5));
     System.out.println(KthSmallest(a, 5));
    }
}
