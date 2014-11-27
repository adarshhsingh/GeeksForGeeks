/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trees;

public class CheckIfBinaryTreeIsSubtreeOfAnother {
    
static boolean startcheck=false;
 static node newNode(int data)
    {
         node node = new node();
        node.data = data;
        node.left=null;
        node.right=null;

        return node;
    }
static void display( node ptr , int level)
{
     int i ;

     if(ptr != null)
     {
            display(ptr.right , level+1);
            System.out.printf("\n");
            for(i=0;i<level;i++)
              System.out.printf("  ");
            System.out.printf("%d", ptr.data);
            display(ptr.left, level+1);
     }


}


public static void main(String args[])
 {
        
        node first = newNode(10);
        first.left  = newNode(4);
        first.left.right = newNode(30);
        

        node second = newNode(26);
        second.left  = newNode(10);
        second.right = newNode(3);
        second.left.left = newNode(10);
        second.left.left.left = newNode(4);
        second.left.left.left.right = newNode(30);
        second.left.right = newNode(6);
        second.right.right = newNode(3);
        
        
        boolean flag=checkIfFirstTreeIsSubtreeOfSecond(first,second);
        System.out.println(flag);
    }

    private static boolean checkIfFirstTreeIsSubtreeOfSecond(node first, node second) 
    {
     
     if(first==null)return true;
     if(second==null)return false;
     if(areIdentical(first,second))return true;
     
     return (checkIfFirstTreeIsSubtreeOfSecond(first, second.left) || checkIfFirstTreeIsSubtreeOfSecond(first,second.right));
     
     
    }

    private static boolean areIdentical(node first, node second) {
    
        if(first==null && second==null)return true;
        
        if(first==null || second==null)return false;
        
        if(first.data==second.data)
            return (areIdentical(first.left, second.left) && areIdentical(first.right, second.right));
        else 
        return false;
    }
}