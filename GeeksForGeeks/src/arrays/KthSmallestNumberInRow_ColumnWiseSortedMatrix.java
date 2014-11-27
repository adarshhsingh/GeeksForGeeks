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

class pair<X,Y,Z>
{
X _data ;
Y _row;
Z _column;

pair(X x , Y y , Z z){_data=x; _row=y; _column=z;}

X data(){return _data;}
Y row(){return _row;}
Z column(){return _column;}

void setData(X x){_data=x;}
void setRow(Y y){_row=y;}
void setColumn(Z z){_column=z;}
}

public class KthSmallestNumberInRow_ColumnWiseSortedMatrix {
    
    public static void main(String[]args)
    {
        int a[][]={ {10, 20, 30, 40},{15, 25, 35, 45},{24, 29, 37, 48},{32, 33, 39, 50} };
        getKthSmallestElement(a);
    
    }

    private static void getKthSmallestElement(int[][] a) {
        
        PriorityQueue<pair<Integer,Integer,Integer>> pq=new PriorityQueue<pair<Integer,Integer,Integer>>(1,
        new Comparator<pair<Integer,Integer,Integer>>(){
            public int compare(pair<Integer, Integer, Integer> t, pair<Integer, Integer, Integer> t1) {
            return t.data()-t1.data();
            }
        }
        );
        
        for(int i=0;i<4;i++) // number of column
        {
            pq.offer(new pair<Integer,Integer,Integer>(a[0][i],0,i));
        }

        int count=4; // 4th smallest
        int answer=0;
        for(int c=1;c<=count;c++)
        {
            pair<Integer,Integer,Integer> res = pq.poll();
            answer=res.data();
         //   System.out.println(answer);
            int row=res.row();
            int col=res.column();
            if(row+1<4)pq.offer(new pair<Integer,Integer,Integer>(a[row+1][col],row+1,col));
            
        }
        
        System.out.println(answer);
    }
}
