/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

import java.util.Vector;

/**
 *
 * @author Adarsh
 */
public class FindIfThereIsSubarrayWithSumZero {
    
    public static void main(String arg[])
    {
        int a[]={1,2,3,4,-4,3,3,4,5};
        boolean ans=sumZeroSubarray(a);
        System.out.println(ans);
    }

    private static boolean sumZeroSubarray(int[] a) {
       	// your code goes here
		Vector v=new Vector();
		int sum=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(v.contains(new Integer(sum))){flag=true;}
			v.addElement(new Integer(sum));
		}
		return(flag);
 
	}
  }
