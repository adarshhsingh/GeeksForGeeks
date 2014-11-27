package trees;

public class LowestCommonAncestorInBST {

	public static int getLowestCommonAncestorInBST(node root, int i, int j) {
		
		if(CheckIfBinaryTreeIsBST.isBST(root))
			return getLCA(root, i, j);
		return -1;
	}
	
	private static int getLCA(node root, int i, int j)
	{

		if(root==null) return -1;
		if(root.data>i && root.data>j)
			return getLowestCommonAncestorInBST(root.left, i, j);
				
		if(root.data<i && root.data<j) 
			return getLowestCommonAncestorInBST(root.right, i, j);	
		
		return root.data;
	}

	
}
