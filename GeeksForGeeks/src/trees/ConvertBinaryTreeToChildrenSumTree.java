package trees;

public class ConvertBinaryTreeToChildrenSumTree {

	public static void convert(node root) {
	
		if(root == null)return;
		convert(root.left);
		convert(root.right);
		
		int diff = (root.data) - (	((root.left!=null) ? root.left.data:0 )  +
									((root.right!=null) ?root.right.data:0 )	
								 );
		if(diff < 0)  {
			root.data += Math.abs(diff);
		}
		else if(diff > 0)  {
			node childToChange = (root.left != null) ? root.left : root.right;
			if(childToChange!=null)childToChange.data += diff;
			convert(childToChange);
		}
		
	}

	
}
