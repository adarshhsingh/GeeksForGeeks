package trees;

public class CheckIfBinaryTreeIsBST {

	public static boolean isBST(node head)
	{
		if(head == null) return true;
		if(head.left == null && head.right == null)return true;
		
		if(isBST(head.left) && isBST(head.right))
		{
			if(head.left != null && head.data < head.left.data )return false;
			if(head.right != null && head.data > head.right.data )return false;
			return true;
		}
		return false;
	}
}
