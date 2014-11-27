/**
*/

package trees;
/**
* <b>Check if a given Binary Tree is SumTree</b>
*<p>
*
*Write a function that returns true if the given Binary Tree is SumTree else false.
*A SumTree is a Binary Tree where the value of a node is equal to sum of the
*nodes present in its left subtree and right subtree.
*<p>
*An empty tree is SumTree and sum of an empty tree can be considered as 0.
*A leaf node is also considered as SumTree.
*<p>
*Following is an example of SumTree.
*
*<pre>

         26
       /    \
      10     3
     /  \     \
    4    6     3
*</pre>
* @author naruto
*
*/
public class SumTreeProperty {
    
static int flag=1;
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

static int  checkIfSumTree( node root)
{
    int s=0;
    if(flag==0) return 0;
    if(root==null) return 1;
    if(root.left==null && root.right==null) { s=root.data;  return s; }
    s=checkIfSumTree(root.left);
    s+=checkIfSumTree(root.right);
    if(s!=root.data)flag=0;
    else s+=root.data;
    return s;

}

public static void main(String args[])
 {
        
        node root = newNode(23);
        root.left  = newNode(10);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(6);
        
        checkIfSumTree(root);
        if(flag==1)System.out.printf("True");
        else System.out.printf("False");

    }
}