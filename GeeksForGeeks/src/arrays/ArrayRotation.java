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
public class ArrayRotation {
    
    public static int gcd(int a,int b)
    {
        if(a<b)return gcd(b,a);
        if(a%b==0)return b;
        else return gcd(b , a%b);
    }
    public static int[] RotateArrayBy_D_usingGcd(int a[] , int d)
    {
        int temp;
        int len=a.length;
        int rotate=gcd(len,d);
        if(rotate==1)rotate=d;
        int i,j;
      for(j=0;j<rotate;j++)
      {
        temp=a[j];
        for(i=j;(i+d)<len;i+=d)
        {     a[i]=a[i+d];
            //  System.out.println(i+" is exchange by "+(i+rotate));
        }
        //  System.out.println(i);
        a[i]=temp;
      }
      return a;
    }
    
    public static int[] reverseArray(int a[] , int start , int end)
    {
        int temp;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }
    public static int[] ReversalAlgorithmForArrayRotation(int a[] , int d)
    {
        /*for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n->");*/
        a=reverseArray(a, 0, d-1);
        /*for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n->");*/
        a=reverseArray(a,d,a.length-1);
        /*for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n->");*/
        a=reverseArray(a,0,a.length-1);
        /*for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");*/
        return a;
    }
    
    
    public static void main(String []args)
    {
       // int a[]={1,2,3,4,5,6,7};
        int b[]={1,2,3,4,5,6,7};
        
     /*   a=RotateArrayBy_D_usingGcd(a,2);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
       */ 
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println("");
        b=ReversalAlgorithmForArrayRotation(b, 1);
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println("");
    }
    
}
