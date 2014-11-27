package trees;

public class IdenticalTrees {

	public static boolean isIdentical(node root1, node root2) {
		
		if(root1 == null && root2 == null)return true;
		if(root1 == null || root2 == null)return false;
		if(root1.data == root2.data)
			return (isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));
		return false;
	}

}
