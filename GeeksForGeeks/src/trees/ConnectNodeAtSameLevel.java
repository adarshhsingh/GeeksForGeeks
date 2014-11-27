/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trees;

/**
 *
 * @author Adarsh
 */
class nodeC
{
 int data;
 nodeC left;
 nodeC right;
 nodeC nextRight;
}
public class ConnectNodeAtSameLevel {
    static nodeC newNode(int data)
    {
         nodeC node = new nodeC();
        node.data = data;
        node.left=null;
        node.right=null;
        node.nextRight=null;

        return node;
    }
    public static void main(String args[])
    {
        
        nodeC root = newNode(26);
        root.left  = newNode(10);
        root.right = newNode(3);
        root.left.left = newNode(10);
        root.left.left.left = newNode(4);
        root.left.left.left.right = newNode(30);
        root.left.right = newNode(6);
        root.right.right = newNode(3);
        int height=getHeight(root);
        connectNodesAtSameLevel(root , null ,1 , height);
 }

    private static void connectNodesAtSameLevel(nodeC root , nodeC prev , int level , int height) {
        
        for(int i=level;i<height;i++)
        {
            
        }
    }

    private static int getHeight(nodeC root) {
    
        if(root==null)return 0;
        else if(root.left!=null && root.right!=null) return Math.max(1+getHeight(root.left),1+getHeight(root.right));
        else if(root.left!=null) return 1+getHeight(root.left);
        else if(root.right!=null) return 1+getHeight(root.right);
        else return 1;
    }
}
