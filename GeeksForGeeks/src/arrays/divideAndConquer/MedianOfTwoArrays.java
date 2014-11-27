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
public class MedianOfTwoArrays {
    
    static int getMedian(int a[], int aL, int aH , int b[] , int bL , int bH)
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
            return getMedian(a, aL,(aL+aH)/2 , b,(bL+bH)/2+1, bH);
        }
        else
        {
            //System.out.println("\tbMedian > aMedian"); 
            return getMedian(a,(aL+aH)/2+1 ,aH, b,bL,(bL+bH)/2);
        }
    }
    
    public static void main(String[]args)
    {
        int a[]={1, 2, 3, 6};
        int b[]={4, 6, 8, 10};
        System.out.println("\nANswer : "+getMedian(a, 0, a.length-1, b, 0, b.length-1));
    }
}
