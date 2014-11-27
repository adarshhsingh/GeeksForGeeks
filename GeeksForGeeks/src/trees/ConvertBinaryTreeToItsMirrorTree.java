package trees;

public class ConvertBinaryTreeToItsMirrorTree {

	public static void convertBinaryTreeToItsMirrorTree(node head)
	{
		if(head == null) return ;
		
		node temp = head.left;
		head.left = head.right;
		head.right = temp;
		
		convertBinaryTreeToItsMirrorTree(head.left);
		convertBinaryTreeToItsMirrorTree(head.right);
	}
}
