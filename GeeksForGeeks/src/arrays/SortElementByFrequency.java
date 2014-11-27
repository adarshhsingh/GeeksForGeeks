/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

import java.util.*;
/**
 *
 * @author Adarsh
 */
/*class pairr<X , Y , Z>
{
    X _number;
    Y _frequency;
    Z _index;
    
    public pairr(X x , Y y , Z z ) {_number=x; _frequency=y ; _index=z;}
    
    X number(){return _number;}
    Y frequency(){return _frequency;}
    Z index(){return _index;}
    
    void setNumber(X x) {_number=x;}
    void setFrequency(Y y){_frequency=y;}
    void setIndex(Z z){_index=z;}
}
*/
public class SortElementByFrequency {
    
  
    public static int[] sortArrayByFrequency(int a[])
    {
       int map[][]=new int[a.length][2];
       for(int i=0;i<a.length;i++)
       {
         map[i][0]=a[i];
         map[i][1]=i;
       }
       
      Arrays.sort(map , new Comparator<int[]>(){
        public int compare(int []a , int []b){
            return a[0]-b[0];
        }
       });
       /*for(int i=0;i<map.length;i++)
       {
           System.out.println(map[i][0]+"   "+ map[i][1]);
       }
       */
       System.out.println("");
       int num=map[1][0];
       //Count number of distinct numbers
       int count=1;
       for(int i=1;i<map.length;i++)
       {
           if(map[i][0]!=num)
           {
               count++;
               num=map[i][0];
           }
       }
        //System.out.println(count);
       // Mapping 1-Index and 0-count
       int map2[][]=new int[count][2]; 
       map2[0][1]=map[0][1];
       map2[0][0]=1;
       num=map[0][0];
       int j=0; // for map2 indexing
       for(int i=1;i<map.length;i++)
       {
           if(map[i][0]!=num)
           {
               ++j;
               map2[j][1]=map[i][1];
               map2[j][0]=1;
               num=map[i][0];
           }
           else
               map2[j][0]++;
       }
       
       /*  
       for(int i=0;i<map2.length;i++)
       {
           System.out.println(map2[i][0]+"   "+ map2[i][1]);
       }
       */
       Arrays.sort(map2 , new Comparator<int[]>(){
        public int compare(int []a , int []b){
            if(a[0]==b[0]) {return (a[1]-b[1]);}
            else return -(a[0]-b[0]);
        }
       });
       
       for(int i=0;i<map2.length;i++)
       {
           for(j=0;j<map2[i][0];j++)System.out.print(a[map2[i][1]]+ "  ");
       }     
            return a;
    }
    
  /*  public static void sortArraysByFreqUsingPriorityQueue(int a[])
    {
        PriorityQueue <pairr<Integer,Integer,Integer>> pq = new PriorityQueue<pairr<Integer,Integer,Integer>>(1,
        new Comparator<pairr<Integer,Integer,Integer>>()
        {
            public int compare(pairr<Integer,Integer,Integer> i , pairr<Integer,Integer,Integer> j)
            {
                if(j._frequency==i.frequency()) return i.index()-j.index();
                else 
                    return j.frequency()-i.frequency();
            }
        }
        );
        for(int i=0;i<a.length;i++)
        {
            
        }
    }
    */
    public static void main(String []args)
    {
        int a[]={5 ,2 ,2 ,8, 5,  6 , 8 , 8};
        sortArrayByFrequency(a);
    }
}
